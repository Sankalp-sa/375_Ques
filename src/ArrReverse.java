
import javax.sound.sampled.ReverbType;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sankalp
 */
public class ArrReverse {
    
    public static void printArray(int[] arr){
        
        for(int i=0; i<arr.length; i++){
            if(i!=arr.length-1){
            System.out.print(arr[arr.length-i-1]+",");
            }
            else{
               System.out.print(arr[arr.length-i-1]); 
            }
        }
    }
    // Method 1 :-
    public static void PrintRev1(int[] arr){
        int[] arrRev = new int[arr.length];
        for(int i=arr.length-1; i>=0 ;i--){
            arrRev[arr.length-i-1] = arr[i];
        }
        printArray(arr);
    }
    
    // Method 2 :-
    public static void PrintRev2(int[] arr){
        for(int i=0; i<arr.length; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        printArray(arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,6,5,8,7};
        PrintRev2(arr);
    }
}
