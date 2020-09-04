public class Sum {

  public static void main(String Args[]){
    double a = Double.parseDouble(Args[0]);
    double b = Double.parseDouble(Args[1]);
    double result = SumNums(a, b);
    System.out.println("The result is " +  result);
  }
  public static double SumNums(double a, double b){
    return a + b;
  }
  
}