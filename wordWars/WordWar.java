package wordWars;
import java.util.*;

public class WordWar {
  
  public static void main(String [] Args){
    int [] numbersArray = {1,2,3,4,5,6,7};
    List<Integer> evenNumbers = getEvenNumbers(numbersArray);
    List<Integer> oddNumbers = getOddNumbers(numbersArray);
    int sumOfEven = addNumbers(evenNumbers);
    int sumOfOdd = addNumbers(oddNumbers);
    List<Integer> sorted = sortHighToLow(sumOfEven, sumOfOdd);
    int difference = (int) sorted.get(0) - (int) sorted.get(1);

    System.out.println(difference + " " + sorted);
  }
  public static List<Integer> getEvenNumbers(int[] numbers){
    List<Integer> evenNumbers = new ArrayList<Integer>();
     for (int i = 0; i< numbers.length; i++){
       if(numbers[i] % 2 == 0){
         //System.out.println(numbers[i]);
         evenNumbers.add(numbers[i]);
       } 
      }
      return evenNumbers;
    }
  public static List<Integer> getOddNumbers(int[] numbers){
    List<Integer> oddNumbers = new ArrayList<Integer>();
     for (int i = 0; i< numbers.length; i++){
       if(numbers[i] % 2 != 0){
         // System.out.println(numbers[i]);
         oddNumbers.add(numbers[i]);
       } 
      }
      return oddNumbers;
  }
  public static int addNumbers(List<Integer> numbers){
    int result = 0;
    for(int i = 0; i < numbers.size(); i++){
      result += numbers.get(i);
    }
    return result;
  }

  public static List<Integer> sortHighToLow(int number1, int number2){
    List<Integer> sortedNumbers = new ArrayList<Integer>();
    if(number1 > number2){
      sortedNumbers.add(number1);
      sortedNumbers.add(number2);
    }else{
      sortedNumbers.add(number2);
      sortedNumbers.add(number1);
    }
    return sortedNumbers;
  }
}