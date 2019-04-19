import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhap so a = ");
    int a = scanner.nextInt();
    System.out.println("Nhap so b = ");
    int b = scanner.nextInt();
    check(a, b);
  }

  static void check(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    if (a == 0 && b == 0) {
      System.out.println("Hai so a, b deu bang 0 khong co UCLN");
    } else if (a == 0 && b != 0) {
      System.out.println("UCLN : " + b);
    } else if (a != 0 && b == 0) {
      System.out.println("UCLN : " + a);
    } else {
      while (a != b) {
        if (a > b)
          a = a - b;
        else
          b = b - a;
      }
      System.out.println("UCLN: " + a);
    }
  }
}
