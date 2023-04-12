package com.java.leetcodde;

public class SmallestPositiveMissingNumber {
    public static int missingNumber(int arr[],int size) {
        int n = arr.length;
        int N = 1000010;
        boolean[] present = new boolean[N];
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] <= n)
                present[arr[i]] = true;
            min = Math.max(min, arr[i]);
        }
        for (int i = 1; i < N; i++)
            if (!present[i])
                return i;
        return min + 1;
    }


}
