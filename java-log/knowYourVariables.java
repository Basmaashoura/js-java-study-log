class Books {
    String title;
    String author;
}

class Hobbits {
    String name;
}

public class knowYourVariables {
    public static void main(String[] args) {

        // Be The Compiler - 1:
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
    }
}
