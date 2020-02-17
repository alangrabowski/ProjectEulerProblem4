package com;

public class Problem4 {
    public static boolean isPalindrome (int check) {

        String x = Integer.toString(check);
        StringBuilder sb = new StringBuilder(x);
        String reverseX = sb.reverse().toString();
        return x.equals(reverseX);
    }
    
    public static void main(String[] args) {
        int x, max=0;
        for (int i=100; i<=1000; i++){
            for (int j=100; j<=1000; j++){
                x = i*j;
                if (isPalindrome(x)&&x>=max){
                max=x;
                }
            }
        }
        System.out.println(max);
    }
}
