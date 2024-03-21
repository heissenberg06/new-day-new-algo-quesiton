//I do not prefer to use StringBuilder because I want more simple code

/*
TIME COMPLEXITY : O(n) ==> where n is the number of unique roman symbols
used to represent the input array. because the loop iterates through
the corresNumbers array. within the loop the 'while' loop may iterate multiple
times but its max iterations are bounded by the number of unique symbols.


SPACE COMPLEXITY : O(1) ==> it is constant. because the amount of memory used
by the program does not increase with the size of the input. regardless of the
input number, the program only uses a fixed amount of memory to store the romanSymbols
array, the corresNumbers array and the primitive variables. thus, the space
complexity remains constant regardless of the magnitude of the input number.
 */


public class Main {
    public static void convertRoman(int num) { //this is the converter function to roman
        //these arrays hold corresponding values with roman and numbers
        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; //these are roman symbols
        int[] corresNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1}; //these are numbers that correspond to romans


        String roman = ""; //I initialized an empty string to store roman numbers
        for (int i = 0; i < corresNumbers.length; i++) { //this loop iterates through romanSymbols and corresNumbers
            while (num >= corresNumbers[i]) {
                //this loop repeatedly subtracts the largest possible value from the given number
                // while appending the corresponding Roman numeral symbol to the output string
                //also, using a while loop allows us to repeatedly perform the subtraction until it's no longer possible
                roman += romanSymbols[i]; //append the corresponding symbol to the Roman numeral string
                num -= corresNumbers[i]; //subtract the value from the number

            }
        }
        //return the result string
        System.out.println(roman);
    }

    public static void main(String[] args) {//main method for testing
        int num = 1881; //input for testing
        convertRoman(num);
    }
}


/*
Convert Integer to Roman.
Roman numerals are represented by seven different
symbols: I, V, X, L, C, D and M.
Symbol Value
I 1
V 5
X 10
L 50
C 100
D 500
M 1000
For example, 2 is written as II in Roman numeral, just two one's added
together. 12 is written as XII, which is simply X + II. The number 27 is written
as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right.
However, the numeral for four is not IIII. Instead, the number four is written
as IV. Because the one is before the five we subtract it making four. The same
principle applies to the number nine, which is written as IX. There are six
instances where subtraction is used:
• I can be placed before V (5) and X (10) to make 4 and 9.
3
• X can be placed before L (50) and C (100) to make 40 and 90.
• C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.
Example 1:
Input: num = 3
Output: "III"
Explanation: 3 is represented as 3 ones.
 */
