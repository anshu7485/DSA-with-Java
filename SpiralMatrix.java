public class SpiralMatrix {
    
public static void printSpiral(int matrix[][]) {



    int startRow = 0;
    int endRow = matrix.length - 1;
    int startCol = 0;
    int endCol = matrix[0].length - 1;

    

        while (startRow <= endRow && startCol <= endCol) {
            // Print top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            

            // Print right column
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            

                // Print bottom row
                for (int j = endCol-1; j >= startCol; j--) {

                    if(startRow==endRow) {
                        break; 
                    } // Avoid double printing in case of single column
                    System.out.print(matrix[endRow][j] + " ");
                }
                
            
                // Print left column
                for (int i = endRow-1; i >= startRow+1; i--) {
                    if(startCol==endCol) {
                        break; // Avoid double printing in case of single row
                    } //
                    System.out.print(matrix[i][startCol] + " ");
                }


                startCol++;
                endCol--;
                startRow++;                
                endRow--;
            
            }

            System.out.println();
        }
    

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        printSpiral(matrix);
    }
}
