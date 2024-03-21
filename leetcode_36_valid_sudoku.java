//Actually I better use hashset maybe, but I am not good at it :(,
//that is why I used boolean array


/*
TIME COMPLEXITY : O(1) ==> the time complexity of this isValidSudoku method
is O(1) because the input board is always a fixed size of 9x9.
The method iterates through each cell of the board once,
performing constant time operations for each cell.

SPACE COMPLEXITY : O(1) ==> the space complexity is also O(1) because the method
uses a fixed amount of extra space regardless of the input size.
It creates three boolean arrays of size 9 for checking rows, columns, and 3x3 subgrids,
as well as a few integer variables for indexing.
These arrays and variables do not scale with the input size and are constant in size.

 */
public class Main {
    public static boolean isValidSudoku(char[][] board) {
        //for iterating through each row of the board
        for (int i = 0; i < 9; i++) {
            //boolean arrays to keep track of whether a digit located in a row, column, or box
            boolean[] rowCheck = new boolean[9];
            boolean[] columnCheck = new boolean[9];
            boolean[] boxCheck = new boolean[9];

            //for iterating through each column of the board
            for (int j = 0; j < 9; j++)
            {
                //check if the current cell is empty (contains a period '.')
                if (board[i][j] == '.')
                {
                    //the empty if statements serve as placeholders for situations where the value at position board[i][j] is a period ('.').
                }

                //if the current cell contains a value other than '.', check the row constraints
                else if (rowCheck[board[i][j] - '1'])
                    return false; //if the value already exists in the row, the Sudoku board is invalid

                else rowCheck[board[i][j] - '1'] = true; //mark the value as encountered in the row

                //similar logic for checking column constraints
                if (board[j][i] == '.')
                {
                    //the empty if statements serve as placeholders for situations where the value at position board[i][j] is a period ('.').
                }

                else if (columnCheck[board[j][i] - '1'])
                    return false; //if the value already exists in the column, the Sudoku board is invalid

                else columnCheck[board[j][i] - '1'] = true; //mark the value as encountered in the column

                //calculate the indices for the box constraints
                int m = i / 3 * 3 + j / 3;
                int n = i % 3 * 3 + j % 3;

                //checking box constraints
                if (board[m][n] == '.')
                {
                    //the empty if statements serve as placeholders for situations where the value at position board[i][j] is a period ('.').
                }
                else if (boxCheck[board[m][n] - '1'])
                    return false; //if the value already exists in the box, the Sudoku board is invalid

                else boxCheck[board[m][n] - '1'] = true; //mark the value as encountered in the box
            }
        }
        return true; //if all constraints are satisfied, the Sudoku board is valid
    }

    public static void main(String[] args) { //my test method

        char[][] sudokuBoard = { //giving a board
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        //calling isValidSudoku function with the provided Sudoku board
        boolean isValid = isValidSudoku(sudokuBoard);

        //printing the result
        System.out.println("Is valid Sudoku? " + isValid);
    }
}