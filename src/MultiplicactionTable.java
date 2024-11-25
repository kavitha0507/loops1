public class MultiplicactionTable {
    public static void main(String[] args) {
         {
                int size = 12 ;// You can change this value for a larger or smaller table

                // Outer loop for rows
                for (int i = 1; i <= size; i++) {
                    // Inner loop for columns
                    for (int j = 1; j <= size; j++) {
                        // Print the product of i and j, followed by a tab
                        System.out.print(i * j + "\t");
                    }
                    // Move to the next line after printing all columns in a row
                    System.out.println();
                }
            }
        }
    }

