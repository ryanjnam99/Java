import java.util.Set;
import java.util.HashMap;

public class Hashmatique {
    public static void main (String[] args) {
        HashMap<String, String> musicMap = new HashMap<String, String>();
        musicMap.put("Four Tracks", "Boogie Child");
        musicMap.put("The Nu'rons", "Hurry up Tomorrow");
        musicMap.put("Three Tracks", "You Mean Everything to Me");
        musicMap.put("Five Tracks", "Like my Love for You");
        for (String key: musicMap.keySet()) {
            System.out.println(String.format("Track: %s - Name: %s", key, musicMap.get(key)));
        }
    }
}