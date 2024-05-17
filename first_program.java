import java.util.Scanner;

/**
 * main
 */
public class first_program {

  public static void main(String[] args) {

    // String n = "Aditya";
    // for (int i = 0; i < n.length(); i++) {
    // System.out.println(n.charAt(i));
    // }

    // Pattern 1
    // for (int i = 0; i < 5; i++) {
    // for (int j = 0; j < 5; j++) {
    // System.out.print(" *");
    // }
    // System.out.println();
    // }

    // Pattern 2
    // for (int i = 0; i < 5; i++) {
    // for (int j = 0; j <= i; j++) {
    // System.out.print(" *");
    // }
    // System.out.println();
    // }

    // Scanner sc = new Scanner(System.in);
    // String n = sc.next();
    // String n = sc.nextLine();
    // System.out.println(n);

    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();

    // int c = a+b;
    // System.out.println(c);

    // Pattern 3
    int n = 4;
    int m = 5;

    // for (int i = 1; i <= n; i++) {
    // for (int j = 1; j <= m; j++) {
    // if (i == 1 || j == 1 || i == n || j == m) {
    // System.out.print("*");
    // } else {
    // System.out.print(" ");
    // }
    // }
    // System.out.println();
    // }

    // Pattern 4
    // for (int i = 0; i <= 5; i++) {
    // for (int j = 0; j < 5-i; j++) {
    // System.out.print("*");
    // }
    // System.out.println();
    // }

    // Pattern 5
    // for (int i = 1; i < 5; i++) {
    // for (int j = 1; j < 5 - i; j++) {
    // System.out.print(" ");
    // }

    // for (int j = 1; j < i + 1; j++) {
    // System.out.print("*");
    // }

    // System.out.println();
    // }

    // Pattern 6
    // for (int i = 1; i <= 5; i++) {
    // for (int j = 1; j <= i; j++) {
    // System.out.print(j);
    // }
    // System.out.println();
    // }

    // Pattern 7
    // for (int i = 0; i < 5; i++) {
    // for (int j = 1; j <= 5 - i; j++) {
    // System.out.print(j);
    // }
    // System.out.println();
    // }

    // Pattern 8
    // for (int i = 1; i <= 5; i++) {
    // int sum = i;
    // for (int j = 1; j <= i; j++) {
    // System.out.print(sum);
    // sum++;
    // }
    // System.out.println();
    // }

    // Pattern 9

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j <= i; j++) {
        int sum = i + j;
        if (sum % 2 == 0) {
          System.out.print(1);
        } else {
          System.out.print(0);
        }

      }
      System.out.println();
    }

  }
}