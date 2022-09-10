/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sankalp
 */
public class SearchInRotatedSortedArray {
    
    public static int search(int[] num, int target){
        
        for(int i=0; i<num.length; i++){
            if(num[i] == target){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        
        int nums[] = {4,5,6,7,0,1,2},target = 0;
        System.out.println(search(nums, target));
    }
}
