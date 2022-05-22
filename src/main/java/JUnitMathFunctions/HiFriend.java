package JUnitMathFunctions;
import java.util.Scanner;


public class HiFriend {

    public static void main(String[] args) {
        System.out.println("Enter name:");
        String name = hiFriend();
        System.out.println("Hi, " + name);
    }

    public static String hiFriend(){
        Scanner scanner = new Scanner(System.in);
        String Name = scanner.nextLine();
        return Name;
    }
}
