package helpers;
import java.util.ArrayList;

/**
 * General Helper Class
 */
public class General {
    private General() {}

    // Converts a list of strings into a single, oxfard-comma separated string
    public String conjunct(ArrayList<String> stringList, String conjunction) {
        
        // Deal with edge cases (numStrins == 1 or 2)
        if (stringList.size() == 1) {
            return stringList.get(0);
        } else if (stringList.size() == 2) {
            return stringList.get(0) + " " + conjunction + " " + stringList.get(1);
        }

        // Deal with other cases (numStrings > 2)
        String conjunctedString = "";
        for (int i = 0; i < stringList.size() - 1; i++) {
            conjunctedString += stringList.get(i) + ", ";
        }
        conjunctedString += conjunction + " " + stringList.get(stringList.size() - 1);
        return conjunctedString;
    }
}
