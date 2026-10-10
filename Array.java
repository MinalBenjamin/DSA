public class Array {
    public static void main(String[] args) {
        int[] arr = {45, 12, 89, 33, 67};
        
        // 1. Traversal: Processing each element in the array[cite: 1]
        System.out.println("--- Traversal ---");
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println("\n");

        // 2. Search: Finding the location of an element with a given value[cite: 1]
        System.out.println("--- Search ---");
        int target = 33;
        int searchIndex = 0;
        boolean found = false;
        while (searchIndex < arr.length) {
            if (arr[searchIndex] == target) {
                System.out.println("Element " + target + " found at index: " + searchIndex);
                found = true;
                break;
            }
            searchIndex++;
        }
        if (!found) System.out.println("Element not found.");
        System.out.println();

        // 3. Insertion: Adding a new element to an array[cite: 1]
        System.out.println("--- Insertion ---");
        int insertPos = 2; // Insert at index 2
        int newValue = 99;
        int[] insertedArr = new int[arr.length + 1];
        int j = 0, k = 0;
        while (j < insertedArr.length) {
            if (j == insertPos) {
                insertedArr[j] = newValue;
            } else {
                insertedArr[j] = arr[k];
                k++;
            }
            j++;
        }
        arr = insertedArr; // Update array reference
        printArray("After Insertion: ", arr);

        // 4. Deletion: Removing an element from an array[cite: 1]
        System.out.println("--- Deletion ---");
        int deletePos = 3; // Delete element at index 3
        int[] deletedArr = new int[arr.length - 1];
        int m = 0, n = 0;
        while (m < arr.length) {
            if (m != deletePos) {
                deletedArr[n] = arr[m];
                n++;
            }
            m++;
        }
        arr = deletedArr;
        printArray("After Deletion: ", arr);

        // 5. Sorting: Organizing the elements in some order (Bubble Sort)[cite: 1]
        System.out.println("--- Sorting ---");
        int p = 0;
        while (p < arr.length - 1) {
            int q = 0;
            while (q < arr.length - p - 1) {
                if (arr[q] > arr[q + 1]) {
                    // Swap
                    int temp = arr[q];
                    arr[q] = arr[q + 1];
                    arr[q + 1] = temp;
                }
                q++;
            }
            p++;
        }
        printArray("After Sorting: ", arr);

        // 6. Merging: Combining two arrays into a single array[cite: 1]
        System.out.println("--- Merging ---");
        int[] arr2 = {5, 10, 15};
        int[] mergedArr = new int[arr.length + arr2.length];
        int x = 0;
        // Copy first array
        while (x < arr.length) {
            mergedArr[x] = arr[x];
            x++;
        }
        int y = 0;
        // Copy second array
        while (y < arr2.length) {
            mergedArr[x] = arr2[y];
            x++;
            y++;
        }
        printArray("After Merging: ", mergedArr);

        // 7. Reversing: Reversing the elements of an array[cite: 1]
        System.out.println("--- Reversing ---");
        int left = 0;
        int right = mergedArr.length - 1;
        while (left < right) {
            // Swap elements at left and right indices
            int temp = mergedArr[left];
            mergedArr[left] = mergedArr[right];
            mergedArr[right] = temp;
            left++;
            right--;
        }
        printArray("After Reversing: ", mergedArr);
    }

    // Helper method to print arrays using a while loop
    private static void printArray(String msg, int[] array) {
        System.out.print(msg);
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println("\n");
    }
}