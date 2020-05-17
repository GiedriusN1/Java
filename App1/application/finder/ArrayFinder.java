package application.finder;

public class ArrayFinder {

    public int find(int[] array, int findVal) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == findVal) {
                return i;
            }
        }
        return result;
    }

    public int find(int[][] matrix, int findVal) {
        int result = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int ii = 0; ii < matrix[i].length; ii++) {
                if (matrix[i][ii] == findVal) {
                    return i;
                }
            }
        }
        return result;
    }


    // Method call will not be allowed if call static.
    public String toString() {
        //return getClass().getName()+"@"+Integer.toHexString(hashCode());
        return "Array finder   --- cia turbut reiskia kad nesuveike find metodai?";
    }
}
