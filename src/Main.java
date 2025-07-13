import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        var averageArray = new AverageOfSubArray();
//        double[] result = averageArray.AverageOfSubArrayOfSizeK(array, 5);
        double[] result = averageArray.AverageOfSubArrayOfSizeK2(array, 5);

        System.out.println(Arrays.toString(result));
    }
}