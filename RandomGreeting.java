import  java.util.Random;
public class RandomGreeting {
  public static void main(String [] Args){
    Random randomInt = new Random();
    String randomName = Args.length <= 0 ? "No one" : Args[randomInt.nextInt(Args.length)];
    System.out.println("Hello " + randomName);
  }
}