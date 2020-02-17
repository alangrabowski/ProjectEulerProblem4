package com;

public class Problem4 {
    public static boolean isPalindrome (int check) {

        String x = Integer.toString(check);
        StringBuilder sb = new StringBuilder(x);
        String reverseX = sb.reverse().toString();
        return x.equals(reverseX);
    }   //this method takes some number, converts it into String, reverses it and checks if the reversed String is the
        //same as the first one

    public static void main(String[] args) {
        int x, max=0;
        for (int i=100; i<=999; i++){
            for (int j=100; j<=999; j++){
                x = i*j;
                if (isPalindrome(x)&&x>=max){
                max=x;
                }
            }
        }//program checks every combination of multiplying two 3-digit numbers in search of highest palindrome.
        System.out.println(max);
    }
}
