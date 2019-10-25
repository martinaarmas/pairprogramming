import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class SortingWords {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("unsorteddict.txt"));
        String line = reader.readLine();
        int contador = 0;
        while (line!=null){
            line = reader.readLine();
            contador++;
        }

        String [] words = new String[contador];
        System.out.println(contador);
        int i = 0;
        BufferedReader.reset();
        while (line!= null){
            words[i]= reader.readLine();
            i++;
        }
        for (i = 0; i<words.length ; i++)
        {
            System.out.println(words[i]);
        }
        String[] names = {"joe", "slim", "ed", "george"};
        sortwords(names);
        for (int k = 0; k < 4; k++)
            System.out.println(names[k]);
    }

    public static void sortwords(String x[]) {
        int j;
        boolean flag = true;  // will determine when the sort is finished
        String temp;

        while (flag) {
            flag = false;
            for (j = 0; j < x.length - 1; j++) {
                if (x[j].compareToIgnoreCase(x[j + 1]) > 0) { // ascending sort
                    temp = x[j];
                    x[j] = x[j + 1];     // swapping
                    x[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}

