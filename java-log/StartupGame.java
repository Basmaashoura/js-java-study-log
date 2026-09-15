import java.util.Scanner;

public class StartupGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;

         GameHelper helper = new GameHelper();

        simpleStartup theStartup = new simpleStartup();
        int randomNum = (int) (Math.random()*5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theStartup.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {
          int guess = helper.getUserInput("enter a number");
            String result = theStartup.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " +numOfGuesses + " guesses");}
            }
        }
}


class simpleStartup {
    int[] locationCells;
    int numOfHits = 0;

    String checkYourself(int guess) {
        String result = "miss";

        for(int cell : locationCells) {
            if (cell == guess) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;
    }

    void setLocationCells(int[] locs) {
        locationCells = locs;
    }
}

class GameHelper {
    public int getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return  scanner.nextInt();
    }
}

// Code Magnets exercise solution
class MultiFor {
    public static void main(String[] args) {
        for (int i = 0; i < 4 ; i++) {
            for (int j = 4; j > 2 ; j-- ) {
                System.out.println(i + " " + j);
                if(i == 1) {
                    i++;
                }
            }
        }
    }
}