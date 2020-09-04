public class TraingleNumber {
  public static void main (String Args[]){
    int input = Integer.parseInt(Args[0]);
    int answer = calculateTriangleNumber(input);
    String message = "The next triangle number is ";

    System.out.println(message);
    System.out.println(answer);
  }
  public static int calculateTriangleNumber(int points){
     int result = 1;
     result = points * (points + 1) / 2;
     return result;
  }
}