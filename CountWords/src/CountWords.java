//
// BJP5 11-1 Lists
//

import java.io.*;
import java.util.*;

public class CountWords {
    public static void main(String[] args) throws FileNotFoundException {
//        Set<String> words = new HashSet<String>(); // order is arbitrary
        Set<String> words = new TreeSet<String>(); // order will be alphabetical (upper then lower case - so "The" is different than "the" and comes first)

        Scanner input = new Scanner(new File("mobydick.txt"));
//        Scanner input = new Scanner(new File("small.txt"));
        while (input.hasNext())  {
            String word = input.next();
            //if (!words.contains(word)) {
                words.add(word);
            //}
        }

        System.out.println(words.size() + " unique words.");
//        System.out.println(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
}