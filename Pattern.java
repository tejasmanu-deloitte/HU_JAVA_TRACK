import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        int i, j, k, line;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want to print: ");
        line = sc.nextInt();
        for (i= 1; i<= line ; i++) {
            for (j=i; j <line ;j++) {
                System.out.print(" ");
            }
            for (k=1; k<=i;k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (i=line; i>=1; i--) {
            for(j=i; j<=line;j++) {
                System.out.print(" ");
            }
            for(k=1; k<i ;k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
} 