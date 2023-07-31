import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        ArrayList<String> snacks = new ArrayList<String>();
        snacks.add("Apples");
        snacks.add("Almonds");
        snacks.add("Pretzels");
        snacks.add("Yogurt");

        // Use reverse for loop to safely remove elements
        for(int i=0; i<snacks.size(); i++) {
            if(snacks.get(i).charAt(0) == 'A') {
                snacks.remove(i);
                i--; // Here we move one step back
            }
        }
        System.out.println(snacks);
    }
}
