/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sankalp
 */
public class MinMax {
    
    public static void FindMax(int[] arr){
        int max=0;
        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1){
                break;
            }
            if(arr[i]<arr[i+1]){
                max = arr[i+1];
            }
        }
        System.out.println(max);
    }
    
    public static void FindMin(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1){
                break;
            }
            if(min>arr[i+1]){
                min = arr[i+1];
            }
        }
        System.out.println(min);
    }
    public static void main(String[] args) {
        int[] arr = {21,4,3,47,56};
        
        FindMax(arr);
        FindMin(arr);
    }
}
