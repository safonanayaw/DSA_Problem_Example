//Given an array, find the average of all contiguous subarrays of size ‘K’ in it.
//Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
//BruteForce Approach
public class AverageOfSubArray {
public double[] AverageOfSubArrayOfSizeK(int[] array, int k){
    double[] result = new double[array.length - k + 1];
    for(int i = 0; i <= array.length - k; i++){
        double sum = 0;
        for(int j = i; j < i + k; j++){
//            find sum of next k elements
            sum += array[j];
        }
        result[i] = sum / k;
    }
    return result;
}
//the time complexity of the above algorithm is 0(N*K) where N is
//the number of input array and k is number of next sum elements

//Efficient Approach, SlidingWindow;
    public double[] AverageOfSubArrayOfSizeK2(int[] array, int k){
    double[] result = new double[array.length - k + 1];
    int windowStart = 0;
    double windowSum = 0;
    for(int windowEnd = 0; windowEnd < array.length; windowEnd++){
        windowSum += array[windowEnd];
        if(windowEnd >= k - 1){
            result[windowStart] = windowSum / k;
            windowSum -= array[windowStart];
            windowStart++;
        }
    }
    return result;
    }


}


