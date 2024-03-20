/*
    TIME COMPLEXITY = O(n) ===> reverse() function is called three times.
    each reverse operation takes O(n/2) time complexity where n is the
    number of elements in the array. All other operations takes O(1).
    therefore the overall time complexity is O(n/2)*3+O(1)
    which simplifies to O(n).

    SPACE COMPLEXITY = O(1) ===> the input array is modified in place
    and no extra space is used to the size of input. thanks to them,
    the space complexity is O(1).
 */

import java.util.*;

public class Main {

    public static void main (String [] args) //for test the methods
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //we create an array that will be placed in the method

        //checkAndDo(givenArray, k);
        checkAndDo(arr, 3); //checkAndDo method takes two parameters, first the array, second the k

    }
    public static void checkAndDo(int[] parameterArray, int k) { //checkAndDo method takes two parameters, first the array, second the k
        if (k > parameterArray.length || k == 0) { //I used if-else to check is the k bigger than the size of array or not
            System.out.println("array size is " + parameterArray.length + ", smaller then 'k'"); //if the k is bigger than size, than the operation does not work
        } else { //if the k is smaller than the size of the array, then the operation would work
            k = k % parameterArray.length; //to be able to know how many numbers the function traverse
            reverse(parameterArray, 0, parameterArray.length-1); //first call, revers all the array
            reverse(parameterArray, 0, k-1); //second call, re reverse first k numbers
            reverse(parameterArray, k, parameterArray.length-1); //third call, re reverse the rest
            System.out.println(Arrays.toString(parameterArray)); //print the array with Arrays.toString method
        }
    }

    public static void reverse (int[] currentArray, int start, int end)
    {
        int temp = 0;
        while(start < end) //here I'm just doing reverse operation for an array
        {
            temp = currentArray[start]; //first put the first index's value to temprorary variable
            currentArray[start] = currentArray[end]; //second swap the first index's value with last index's value
            currentArray[end] = temp; //third put the value that comes from the temprorary to last index
            start++;
            end--;
        }
    }
}

/*
Given an integer array nums, rotate the array to the right by k steps,
where k is non-negative. Do not use any additional array. Space compleity can
be at most O(1).
Example 1:
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
2
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */



