package third_package;

public class MultidimensionalArray {

    public static void main(String[] args) {

        int[][] numbers = {
            {5, 10},
            {15, 20}
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }
    }
}
