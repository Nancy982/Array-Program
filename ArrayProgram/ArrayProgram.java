//Name: Nancy Medina
//Date: 9/20/18
//Description:lab 1 part 2 
import java.util.Random;
public class ArrayProgram {

   public static void main(String[] args) {

      Random randomNumbers = new Random();
      int[] anArray = new int[3];
      
      System.out.println("The original array  ");
      
      //print the original array
      for (int i = 0; i < anArray.length; i++){
             anArray[i] = randomNumbers.nextInt(10);; 
             System.out.println("Entry " + (i) + " is " + anArray[i]);
          }
          
      System.out.println("");
      System.out.println("The sorted array");
      
      ArrayProcessor theAP = new ArrayProcessor();
      
      //print the sorted array
      int[] sortedArray = theAP.sortIntArray(anArray);
      for (int x = 0; x < sortedArray.length; x++){ 
             System.out.println("Entry " + (x) + " is " + sortedArray[x]);
          }
                            
      System.out.println("");
      System.out.println("The sorted reversed array");
      
      //print the sorted reversed array
      int[] reverseArray = theAP.reverseIntArray(sortedArray);
      for (int y = 0; y < reverseArray.length; y++){ 
            System.out.println("Entry " + (y) + " is " + reverseArray[y]);
          }
      }
  }  
   