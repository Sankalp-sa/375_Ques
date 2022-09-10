/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sankalp
 */
import java.util.*;


public class SubArraySumMax {
    public static void maxSubArray(int[] nums) {
        int maxEndingHere = 0,maxSoFar = Integer.MIN_VALUE;
        int size = nums.length;
        
        for(int i=0; i<size; i++){
            maxEndingHere = maxEndingHere + nums[i];
            if(maxSoFar<maxEndingHere){
            maxSoFar = maxEndingHere;
            }
        }
        
        System.out.println(maxSoFar);
    }
    
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,-1,-2};
        maxSubArray(arr);
    }
}
