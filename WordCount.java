public class WordCount {
  public static void main (String [] Args){
     int wordCount =  countWords(Args[0]);
     System.out.println("There are " + wordCount + " words in the word: " + Args[0]);
  }
  public static int countWords(String sentence){
    String [] words = sentence.split(" ");
    return words.length;
  }
  
}