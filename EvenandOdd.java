import java.util.*;
public class EvenandOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        int bitmask = 1;

        String result = (a & bitmask) == 0 ? "The number is even" : "The number is odd";
        System.out.println(result);

        sc.close();
    }
}
