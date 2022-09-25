/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;

/**
 *
 * @author Sankalp
 */


public class SubArraySumMax {
    public static void maxSum(int[] nums) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int startingIndex =0;
        int endingIndex=0;
        for (int i = 0; i < nums.length; i++) {
            max_ending_here = max_ending_here + nums[i];
            
            if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
                endingIndex = i;
            }
            if(max_ending_here<0){
                max_ending_here = 0;
            }
        }

        for (int i = endingIndex; i>0; i--) {
            max_so_far = max_so_far - nums[i];
            if(max_so_far==0){
                startingIndex = i;
                break;
            }
        }


        for (int i = startingIndex; i <= endingIndex; i++) {
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,-1,-2};
        maxSum(arr);
    }
}
