public class howObjectsBehave {
    public static void main(String[] args) {

        // Be the compiler
        /*{
        // ============ A ============
            int orig = 42;
            XCopy x = new XCopy();
            int y = x.go(orig);
            System.out.println(orig + " " + y);

        // ============ B ============
            Clock c = new Clock();
            c.setTime("12345");
            String tod = c.getTime();
            System.out.println("time: " + tod);
        }*/

        // Pool Puzzle
        {
            Value[] values = new Value[6];
            int number = 1;
            int i = 0;
            while (i < 6) {
                values[i] = new Value();
                values[i].intValue = number;
                number = number * 10;
                i = i + 1;
            }

            int result = 0;
            i = 6;
            while (i > 0) {
                i = i - 1;
                result = result + values[i].doStuff(i);
                ;
            }
            System.out.println("result " + result);
        }
    }
}


class Value {
    int intValue;
    public int doStuff(int factor) {
        if(intValue > 100) {
            return intValue * factor;
        } else {
            return intValue * (5 - factor);
        }
    }
}

class XCopy {
    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
}

class Clock {
    String time;

    void setTime (String t) {
        time = t;
    }

    String getTime() {
        return time;
    }
}