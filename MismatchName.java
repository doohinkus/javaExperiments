public class MismatchName {
  public static void main(String [] Args){
    flipName(Args[0]);
  }
  public static void flipName(String name){
     String [] arrayOfName = name.split(" ");
     String firstName = arrayOfName[0];
     String lastName = arrayOfName[1];
     
     System.out.println("The flipped name is -> " + lastName + " " + firstName);
  }
}