import java.util.ArrayList;

public class advancedStartup {
    public static void main(String[] args) {
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();

        Startup firstStartup = new Startup();
        firstStartup.setName("");

        int randomNum = (int) (Math.random()*5);
//        int[] locations = {randomNum, randomNum+1, randomNum+2};
//        theStartup.setLocationCells(locations);

        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("enter a number");
            String result = firstStartup.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " +numOfGuesses + " guesses");}
        }
    }
}

class Startup {
    private ArrayList<String> locationCells;
    private String startupName;
//    private int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public void setName (String name) {
        startupName = name;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);

        if(index >=0 ) {
            locationCells.remove(index);
            if(locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }

}

