import java.io.*;
import java.util.*;

public class IteratorDemo<I extends Number> {
    public static void main(String[] args) throws FileNotFoundException {
        Set<Integer> scores = new TreeSet<Integer>();
        scores.add(94);
        scores.add(38);
        scores.add(87);
        scores.add(43);
        scores.add(72);

        Iterator<Integer> itr = scores.iterator();
        while (itr.hasNext()) {
            int score = itr.next();

            System.out.println("The score is: " + score);

            // eliminate any failing grades
            if (score < 60) {
                itr.remove();
            }
        }
        System.out.println(scores); // [72, 87, 94]
    }
}