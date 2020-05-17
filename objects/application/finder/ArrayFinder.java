package application.finder;
import java.util.Arrays;
public class ArrayFinder { 
	
    public static int find(int[] array, int findVal) {
        int result = -1;
		 for (int i = 0; i < array.length; i++) {
            if (array[i] == findVal) {
                return i;
            }
        }
        return result;  
    }    


    public static int find(int[][] matrix, int findVal) {
       int result = -1;
		  int i = Arrays.binarySearch(matrix, findVal);
		  return i;
          for (int i = 0; i < matrix.length; i++) {
            for (int ii = 0; ii < matrix[i].length; ii++) {
                if (matrix[i][ii] == findVal) {
                    return i;
                }
            }
        } 
	
     //   return result;  
    }
}