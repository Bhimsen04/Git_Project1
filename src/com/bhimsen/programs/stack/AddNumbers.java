package com.bhimsen.programs.stack;

public class AddNumbers {
    public static void main(String[] args) {
        int i = 5;
        System.out.println(add(i));
        System.out.println("stack class from Git");
    }

    private static int add(int i) {
        if(i > 0)
            return i + add(i-1);
        return 0;
    }

}
