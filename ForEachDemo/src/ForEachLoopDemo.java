//
// BJP5 11-1 Lists
//

import java.io.*;
import java.util.*;

public class ForEachLoopDemo {
    public static void main(String[] args) throws FileNotFoundException {
//        Set<String> words = new HashSet<String>(); // order is arbitrary
        Set<Double> grades = new TreeSet<>();
        grades.add(90.5);
        grades.add(85.4);
        grades.add(100.0);
        grades.add(72.5);

        System.out.println(grades.size() + " unique words.");
        for (double grade : grades) {
            System.out.println("Student's grade: " + grade);
        }
        System.out.println(grades);
//        for (String word : names) {
//            System.out.println(word);
//        }
    }
}