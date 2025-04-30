package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] nums1 = {1, 2, 3};
        Integer[] nums2 = {4, 5, 6};
        Integer[] mergedNums = GenericArrayUtility.mergeArrays(nums1, nums2);
        System.out.println("Merged Integer Array: " + Arrays.toString(mergedNums));

        String[] words1 = {"apple", "banana"};
        String[] words2 = {"cherry", "date"};
        String[] mergedWords = GenericArrayUtility.mergeArrays(words1, words2);
        System.out.println("Merged String Array: " + Arrays.toString(mergedWords));
    }
}
