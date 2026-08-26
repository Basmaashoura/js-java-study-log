import java.util.concurrent.TransferQueue;

class Books {
    String title;
    String author;
}

class Hobbits {
    String name;
}

class Triangle {
    double area;
    int height;
    int length;

    void setArea() {
        area = (height * length) / 2;
    }
}

public class knowYourVariables {
    public static void main(String[] args) {

       /* {// Be The Compiler - 1:
            Books[] myBooks = new Books[3];
            // The Missing Part - Objects creation
            myBooks[0] = new Books();
            myBooks[1] = new Books();
            myBooks[2] = new Books();

            int x = 0;

            myBooks[0].title = "The Grapes of Java";
            myBooks[1].title = "The Java Gatsb(y)";
            myBooks[2].title = "The Java Cookbook";

            myBooks[0].author = "bob";
            myBooks[1].author = "sue";
            myBooks[2].author = "ian";

            while (x < 3) {
                System.out.print(myBooks[x].title);
                System.out.print(" by ");
                System.out.println(myBooks[x].author);

                x = x + 1;
            }

            // Be The Compiler - 2:
            Hobbits[] h = new Hobbits[3];
            int z = 0;

            // while (z < 4) {
            // Needed change:
            while (z < 3) {
                h[z] = new Hobbits();

                h[z].name = "bilbo";

                if (z == 1) {
                    h[z].name = "frodo";
                }

                if (z == 2) {
                    h[z].name = "sam";
                }

                System.out.print(h[z].name + " is a ");
                System.out.println("good Hobbit name");

                z = z + 1;
            }


            // Code Magnets
            int[] index = new int[4];
            index[0] = 1;
            index[1] = 3;
            index[2] = 0;
            index[3] = 2;

            String[] islands = new String[4];
            islands[0] = "Bermuda";
            islands[1] = "Fiji";
            islands[2] = "Azores";
            islands[3] = "Cozumel";

            int ref;
            int y = 0;
            while (y < 4) {
                ref = index[y];
                y = y + 1;

                System.out.print("island = ");
                System.out.println(islands[ref]);
            }
        } */

        int x = 0;
        Triangle[] ta = new Triangle[4];

        while (x<4) {
            ta[x] = new Triangle();
            ta[x].height = (x+1)*2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);

    }
}
