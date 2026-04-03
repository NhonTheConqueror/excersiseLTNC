package MyTools;
import java.util.Scanner;

public class Input {
    private static Scanner obj = new Scanner(System.in);
    
    public static String nextLine() {
        return obj.nextLine();
    }
    
    public static int nextInt() {
        return obj.nextInt();
    }
    
    public static double nextDouble() {
        return obj.nextDouble();
    }
    
    public static float nextFloat() {
        return obj.nextFloat();
    }
    
    public static boolean nextBoolean() {
        return obj.nextBoolean();
    }
}