public class howObjectsBehave {
    public static void main(String[] args) {

        // Be the compiler
        {
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