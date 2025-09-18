import java.util.*;
public class getith{  
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.print("Enter the index: ");
        int i = sc.nextInt();
        int bitmask = 1<<i;
        
        String result = (a & bitmask) == 0 ? "0" : "1";
        System.out.print("The given idex have : ");
        System.out.println(result);

        sc.close();
    }
}
