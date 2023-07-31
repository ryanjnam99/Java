import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);

        char randomLetters = generator.getRandomLetter();
        System.out.println(randomLetters);

        String randomPassword = generator.generatePassword();
        System.out.println(randomPassword);

        ArrayList<String> randomSet = generator.getNewPasswordSet(4);
        System.out.println(randomSet);
	}
}
