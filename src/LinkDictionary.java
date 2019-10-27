

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class LinkDictionary {


    static LinkedList<String> listCreator(String filename) throws IOException {
        //reading in the file
        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));

        LinkedList<String> words = new LinkedList<>();
        String newString = br.readLine();
        if (newString != null) {
            words.add(newString);
        }
        String currString;
        boolean added;
        while ((newString = br.readLine()) != null) {
            added = false;
            for (int i = 0; i < words.size(); i++) {
                currString = words.get(i);
                if (currString.compareToIgnoreCase(newString) > 0) {
                    words.add(i, newString);
                    added = true;
                    break;
                }
            }
            //if we get here then the word is the last one
            if (!added)
                words.add(newString);
        }
        br.close();
        return words;
    }
}
