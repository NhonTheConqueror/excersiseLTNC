package Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "Apply";
        String s3 = "App";

        System.out.println("--- STRING COMPARISON TRACE ---");

        // 1. Comparing 'e' (101) vs 'y' (121)
        int result1 = s1.compareToIgnoreCase(s2);
        System.out.println("'Apple' vs 'Apply': " + result1); 
        System.out.println("Reason: 'e' - 'y' = " + (int)'e' + " - " + (int)'y' + " = -20");

        // 2. Comparing "Apple" vs "App" (Prefix case)
        int result2 = s1.compareToIgnoreCase(s3);
        System.out.println("\n'Apple' vs 'App': " + result2);
        System.out.println("Reason: Length(5) - Length(3) = 2");

        // 3. Identical strings
        int result3 = s1.compareTo("Apple");
        System.out.println("\n'Apple' vs 'Apple': " + result3);

        System.out.println("-------------------------------");
    }
}
