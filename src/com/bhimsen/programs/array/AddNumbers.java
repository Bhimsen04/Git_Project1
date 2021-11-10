package com.bhimsen.programs.array;

import java.util.Arrays;
import java.util.List;

public class AddNumbers {
    public static void main(String[] args) {
        // added in file .....
        int[] ar = {1 ,2 ,3};
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(add(ar));
        System.out.println(sum(integers));
        System.out.println("10");
        // hello g

    }

    private static int sum(List<Integer> integers) {
        return integers.stream().mapToInt(Integer::intValue).sum();
    }

    private static int add(int[] ar) {
        return Arrays.stream(ar).sum();
    }
}
