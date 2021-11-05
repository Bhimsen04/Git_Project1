package com.bhimsen.programs.string;

public class AddNames {
    public static void main(String[] args) {
        System.out.println(addNames("bhimsen" , "Garg"));
    }

    private static String addNames(String firstname, String lastname) {
        return  String.join(" " , firstname , lastname);
    }
}
