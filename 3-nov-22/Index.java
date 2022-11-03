package Nov3Assg;

import java.util.Arrays;

//Write a Java program to find the index of an array element.

public class Index {
	public static void main(String[] args) {

	 int[] numbers = {2,3,4,5,6,7}; 
     int element = 2; 
     int index ;
     index=2;
	for(int i = 0; i < numbers.length; i++) {
         if(numbers[i] == element) {
             index = i;
             break;
         }} 
     System.out.println("Index of "+element+" is : "+index);
 }
}