import java.util.Scanner;
public class Calculate {

  public static void main(String [] Args){
    promptUser();
  }
  public static int applyOperation(int n1, String operator, int n2){
    switch(operator){
      case "+":
        return n1 + n2;
      case "*":
        return n1 * n2;
      case "/":
        return n1 / n2;
      case "%":
        return n1 % n2;
    }
    return 0;
  }
  public static void promptUser(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int n1 = input.nextInt();
    System.out.print("Enter an operator: ");
    String operator = input.next();
    System.out.print("Enter an integer: ");
    int n2 = input.nextInt();
    int result = applyOperation(n1, operator, n2);
    System.out.println("Here is your answer: " + result);
  }
}