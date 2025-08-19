import java.util.Scanner;

public class HelloWord {
  public static void main(String[] args) {
    System.out.println("Holle This is HelloWord file");

    String a, b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter First number");
    a = sc.nextLine();
    System.out.println("Enter Second number");
    b = sc.nextLine();

    System.out.println("Your enter first number : " + a);
    System.out.println("Your enter second number : " + b);
  }
}