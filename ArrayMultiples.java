import java.util.*;

public class ArrayMultiples {
  int n1;
  int n2;
  public static void main(String [] Args){

    ArrayMultiples prompt = new ArrayMultiples();
    prompt.promptForInput();
    prompt.displayAnswer();

  }

  public static int[] arrayOfMultiples(int multiplier, int count){
    int arrInt[] = new int[count];
    int pos = 0;
    for(int step = 1; step <= count; step++){
      arrInt[pos] = step * multiplier;
      pos++;
    }
    return arrInt;
  }

  public void promptForInput(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an multiplier: ");
    n1 = input.nextInt();
  
    System.out.print("Enter a count: ");
    n2 = input.nextInt();
  }

  public void displayAnswer(){
    int[] result = arrayOfMultiples(n1, n2);
    System.out.println("Here is your answer: " + Arrays.toString(result));
  }
}