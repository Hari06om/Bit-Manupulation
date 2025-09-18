import java.util.*;
public class SetIth{  
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the index: ");
        int i = sc.nextInt();
        int bitmask = 1<<i;
        
        int result = a | bitmask;
        System.out.println(result);

        sc.close();
    }
}
