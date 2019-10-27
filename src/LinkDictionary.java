
import sun.awt.image.ImageWatched;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class LinkDictionary {

    static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        }
        catch (NumberFormatException ex) {
            return false;
        }
    }

    static int findIndex(LinkedList<String> words, String word) {// to run this you need to run it in "Run configurations"
        for(int i = 0; i < words.size(); i++) {
            if(word.equals(words.get(i))) {
                return i;
            }
        }
        return -1;
    }    //**  the following could work in intellij, the other code works on eclipse run configurations
    // static int findIndex(LinkedList<String> words, String word) {
    //    	System.out.println("Enter the word whose index you want: ");
    //    	Scanner scan= new Scanner(System.in);
    //    		String word1 =scan.nextLine();
    //        for(int i = 0; i < words.size(); i++) {
    //            if(word1.equals(words.get(i))) {
    //                System.out.println (i);
    //            }
    //        }
    //        return -1;
    //    }
    // */


    static LinkedList<String> listCreator(String filename) throws IOException {
        //reading in the file
        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));

        LinkedList<String> words = new LinkedList<>();
        String newString = br.readLine();
        if(newString != null) {
            words.add(newString);
        }
        String currString;
        boolean added;
        while ((newString = br.readLine()) != null) {
            added = false;
            for(int i = 0; i < words.size(); i++) {
                currString = words.get(i);
                if(currString.compareToIgnoreCase(newString) > 0) {
                    words.add(i, newString);
                    added = true;
                    break;
                }
            }
            //if we get here then the word is the last one
            if(!added)
                words.add(newString);
        }
        br.close();
        return words;
    }

    static void write(String writeFile, LinkedList<String> words) throws IOException {
        FileWriter filewriter = new FileWriter(writeFile);
        BufferedWriter bw = new BufferedWriter(filewriter);//writes in the sorteddict

        for(int i = 0; i < words.size(); i++) {
            bw.write(words.get(i));
            bw.newLine();
        }

        bw.close();
    }

    static void printArguments(String[] args, LinkedList<String> words) {//print word with an input of the index
        for(int i = 0; i < args.length; i++) {
            String current = args[i];
            if(isInteger(current)) {
                int num = Integer.parseInt(current.trim());
                if(num >= 0 && num < words.size()) {
                    System.out.println(words.get(num));
                }
                else {
                    System.out.println("Out of range input");//if the inout is not valid for amount of words
                }
            }
            else {
                //find index
                int index = findIndex(words, current);
                System.out.println(index);
            }
        }
    }

    public static void main(String[] args) throws IOException {

        String filename = "/Users/martinaarmas/pairprogramming/unsorteddict.txt";
        LinkedList<String> words = listCreator(filename);

        String writeFile = "/Users/martinaarmas/pairprogramming/sorteddict.txt";
        write(writeFile, words);

        if(args.length > 10) {// to accept maximum 10 args
            System.out.println("Too many arguments");
        }
        else {
            printArguments(args, words);
        }



    }


}
