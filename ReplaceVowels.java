public class ReplaceVowels {
  public static void main (String Args []){
    String str = "Some name with vowels that need to be removed";
    String result = "";
    char letter;
    for(int i = 0; i < str.length(); i++){
      // char temp = str.charAt(i);
      // System.out.println(temp);
      letter = str.charAt(i);
      if(
        letter == 'a' 
        || letter == 'e'
        || letter == 'i'
        || letter == 'o'
        || letter == 'u'
      )
      { 
        if(Args[0].length() > 0){
          result += Args[0];
        } else {
          result += "";
        }
      } 
      else 
      {
        result += str.charAt(i);
      }
        
    }
      System.out.println(result);
  }
}