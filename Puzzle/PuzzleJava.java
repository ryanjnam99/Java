// You will need to import the Random library from java.util
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
    
// // To use methods from the Random library you will need to create an instance of Random
// Random randMachine = new Random();
// // // From there you can use any of the methods listed in the documentation. For example:
// // randMachine.setSeed(35679); // <--- you won't need to use this method.



public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        Random randMachine = new Random();
        for (int i=0; i<= 10; i++) {
            rolls.add(randMachine.nextInt(20)+1);
        }
        return rolls;
    }

    public char getRandomLetter() {
        Random rand = new Random();
        char [] allAlphabets = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        return allAlphabets [rand.nextInt(allAlphabets.length)];
    }

    public String generatePassword() {
        Random rand = new Random();
        String password = "";
        for (int i=0; i<8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> set = new ArrayList<String>();
        for(int i=0; i<length; i++) {
            set.add(generatePassword());
        }
        return set;
    }


}