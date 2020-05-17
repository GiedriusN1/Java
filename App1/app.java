import application.finder.*;

class app {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50},
                {100, 200, 300, 400, 500, 99}
            };
        ArrayFinder mx = new  ArrayFinder();
        int rowIndex = mx.find(matrix, 99);

        System.out.println(mx);
    }
}

