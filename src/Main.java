import java.io.File;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<File> myLinkedList = new LinkedList<>();

        File file = new File("~/pairprogramming/unsorteddict.txt/");

        myLinkedList.add(file);

        System.out.println(myLinkedList);

    }
}
