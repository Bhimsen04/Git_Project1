package com.bhimsen.programs.string;

public class AddNames {
    public static void main(String[] args) {
        System.out.println(addNames("bhimsen" , "Garg"));
        System.out.println(addNames("Hello" , "g"));
        System.out.println(addNames("Rajat" , "garg"));
    }

    private static String addNames(String firstname, String lastname) {
        return  String.join(" " , firstname , lastname);
    }
}
