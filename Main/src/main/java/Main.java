import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        
        int A, B, C, n1, n2 = 0, n3 = 0;
        
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        n1 = Math.min(A, Math.min(B, C));
        
        if (n1 == A) {
            n2 = Math.min(B, C);
            n3 = Math.max(B, C);
        }
        
        if (n1 == B) {
            n2 = Math.min(A, C);
            n3 = Math.max(A, C);
        }
        
        if (n1 == C) {
            n2 = Math.min(A, B);
            n3 = Math.max(A, B);
        }
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println("");
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
            input.close();
        }
    }
