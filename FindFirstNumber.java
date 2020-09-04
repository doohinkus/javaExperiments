public class FindFirstNumber {
  public static void main(String [] Args){
    System.out.println(findFirstNumber(Args[0]));
  }
  public static String findFirstNumber(String word){
    String result = "";
    for(char character : word.toCharArray()){
      if(Character.isDigit(character)){
        result = "The first number in the string is " + (char) character;
        return result;
      }
    }
    result = "There are no numbers in the string " + word;
    return (String) result;
  }
}