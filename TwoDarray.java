 public class TwoDarray {
    public static void main(String[] args) {
        int[][] matrix = {
            {45, 12, 89},
            {33, 67, 15},
            {90, 22, 54}
        };

        // 1. Traversal: Processing each element
        System.out.println("--- Traversal ---");
        int r = 0;
        while (r < matrix.length) {
            int c = 0;
            while (c < matrix[r].length) {
                System.out.print(matrix[r][c] + " ");
                c++;
            }
            System.out.println();
            r++;
        }
        System.out.println();

        // 2. Search: Finding the location of an element
        System.out.println("--- Search ---");
        int target = 67;
        boolean found = false;
        int sr = 0;
        while (sr < matrix.length && !found) {
            int sc = 0;
            while (sc < matrix[sr].length) {
                if (matrix[sr][sc] == target) {
                    System.out.println("Element " + target + " found at row " + sr + ", column " + sc);
                    found = true;
                    break;
                }
                sc++;
            }
            sr++;
        }
        if (!found) System.out.println("Element not found.");
        System.out.println();

        // 3. Insertion: Adding a new row to the 2D array
        System.out.println("--- Insertion (Adding a row) ---");
        int insertRowPos = 1;
        int[] newRow = {99, 99, 99};
        int[][] insertedMatrix = new int[matrix.length + 1][3];
        
        int i = 0, j = 0;
        while (i < insertedMatrix.length) {
            if (i == insertRowPos) {
                insertedMatrix[i] = newRow;
            } else {
                insertedMatrix[i] = matrix[j];
                j++;
            }
            i++;
        }
        matrix = insertedMatrix; // Update reference
        print2DArray("After Insertion:", matrix);

        // 4. Deletion: Removing a row from the 2D array
        System.out.println("--- Deletion (Removing a row) ---");
        int deleteRowPos = 2; // Delete the row at index 2
        int[][] deletedMatrix = new int[matrix.length - 1][3];
        
        int m = 0, n = 0;
        while (m < matrix.length) {
            if (m != deleteRowPos) {
                deletedMatrix[n] = matrix[m];
                n++;
            }
            m++;
        }
        matrix = deletedMatrix;
        print2DArray("After Deletion:", matrix);

        // 5. Sorting: Sorting each row individually (Bubble Sort)
        System.out.println("--- Sorting (Row by row) ---");
        int sortRow = 0;
        while (sortRow < matrix.length) {
            int p = 0;
            while (p < matrix[sortRow].length - 1) {
                int q = 0;
                while (q < matrix[sortRow].length - p - 1) {
                    if (matrix[sortRow][q] > matrix[sortRow][q + 1]) {
                        int temp = matrix[sortRow][q];
                        matrix[sortRow][q] = matrix[sortRow][q + 1];
                        matrix[sortRow][q + 1] = temp;
                    }
                    q++;
                }
                p++;
            }
            sortRow++;
        }
        print2DArray("After Sorting:", matrix);

        // 6. Merging: Vertically combining two 2D arrays
        System.out.println("--- Merging (Adding rows from another matrix) ---");
        int[][] matrix2 = {
            {2, 4, 6},
            {8, 10, 12}
        };
        int[][] mergedMatrix = new int[matrix.length + matrix2.length][3];
        
        int r1 = 0;
        while (r1 < matrix.length) {
            mergedMatrix[r1] = matrix[r1];
            r1++;
        }
        int r2 = 0;
        while (r2 < matrix2.length) {
            mergedMatrix[r1] = matrix2[r2];
            r1++;
            r2++;
        }
        print2DArray("After Merging:", mergedMatrix);

        // 7. Reversing: Reversing the order of rows (top to bottom)
        System.out.println("--- Reversing (Reversing row order) ---");
        int top = 0;
        int bottom = mergedMatrix.length - 1;
        while (top < bottom) {
            int[] tempRow = mergedMatrix[top];
            mergedMatrix[top] = mergedMatrix[bottom];
            mergedMatrix[bottom] = tempRow;
            top++;
            bottom--;
        }
        print2DArray("After Reversing Rows:", mergedMatrix);
    }

    // Helper method to print 2D arrays using while loops
    private static void print2DArray(String msg, int[][] mat) {
        System.out.println(msg);
        int r = 0;
        while (r < mat.length) {
            int c = 0;
            while (c < mat[r].length) {
                System.out.print(mat[r][c] + " ");
                c++;
            }
            System.out.println();
            r++;
        }
        System.out.println();
    }
}