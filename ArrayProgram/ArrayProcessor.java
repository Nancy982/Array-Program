//Name: Nancy Medina
//Date: 9/20/18
//Description:lab 1 part 1 
import java.util.Scanner;
public class ArrayProcessor {
   
   //create the sorted array
   public int[] sortIntArray(int[] anArray){
      int[] sortedArray  =  new int[3];
   
      if(anArray[0]<anArray[1] && anArray[0]<anArray[2]){
         if (anArray[1]<anArray[2]){
            sortedArray[0] = anArray[0];
            sortedArray[1] = anArray[1];
            sortedArray[2] = anArray[2];
         }
         else {
            sortedArray[0] = anArray[0];
            sortedArray[1] = anArray[2];
            sortedArray[2] = anArray[1];
         }
      }
      else if (anArray[1]<anArray[0] && anArray[1]<anArray[2]){
         if (anArray[0]<anArray[2]){
            sortedArray[0] = anArray[1];
            sortedArray[1] = anArray[0];
            sortedArray[2] = anArray[2];
         }
         else{
            sortedArray[0] = anArray[1];
            sortedArray[1] = anArray[2];
            sortedArray[2] = anArray[0];
         }
      }
      else {
         if (anArray[1]<anArray[0]){
            sortedArray[0] = anArray[2];
            sortedArray[1] = anArray[1];
            sortedArray[2] = anArray[0];
         }
         else{
            sortedArray[0] = anArray[2];
            sortedArray[1] = anArray[0];
            sortedArray[2] = anArray[1];
         } 
       }   
      return sortedArray;
   }
   
   //create the sorted reversed array
   public int[] reverseIntArray (int[] sortedArray){
    int[] reversedArray = new int [3];
      reversedArray[0] = sortedArray[2];
      reversedArray[1] = sortedArray[1];
      reversedArray[2] = sortedArray[0];
      return reversedArray;
     } 
   } 
   
   