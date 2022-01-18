package com.company;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
public class Task02 {

    public static String povtorenie(String s, int n){
        String repS = "";
        for(char ch : s.toCharArray()){
            for(int i=0; i<n; i++){
                repS+=ch;
            }
        }
        return repS;
    }
    public static int raznitsaMaxMin(int s[]){
        int minS = Integer.MAX_VALUE;
        int maxS = Integer.MIN_VALUE;
        for(int n : s){
            if(n>maxS){
                maxS = n;
            }
            if(n<minS){
                minS = n;
            }
        }
        return maxS-minS;
    }
    public static boolean tseloeIliNet(int arr[]){
        return Arrays.stream(arr).sum() % arr.length == 0;
    }
    public static int[] cumulativeSum(int arr[]){
        int[] arrL = new int[arr.length];
        int sum = 0;
        for(int i=0; i < arr.length; i++){
            sum+=arr[i];
            arrL[i] = sum;
        }
        return arrL;
    }
    public static int kolvoDesiatichihZnakov(String s){

        return (s.indexOf('.') > -1) ? s.length() - s.indexOf('.') - 1 : 0;
    }
    public static long Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return Fibonacci(n - 2) + Fibonacci(n - 1);
    }
    public static boolean isValid(String s) {
        return s.length()==5 && s.matches("[0-9]+");
    }
    public static boolean isStrangePair(String s1, String s2) {
        if (s1.equals("") && s2.equals("")) return true;
        return s1.length() > 0 && s2.length() > 0 && s1.charAt(0) == s2.charAt(s2.length() - 1) && s2.charAt(0) == s1.charAt(s1.length() - 1);
    }
    public static boolean isPrefix(String s1, String s2) {
        return s1.indexOf(s2.substring(0,s2.length()-2)) == 0;
    }

    public static boolean isSuffix(String s1, String s2) {
        return s1.lastIndexOf(s2.substring(1,s2.length()-1)) >=0 ;
    }
    public static int boxSeq(int n) {
        int res = 0;
        for(int i=1; i<=n; i++){
            if(i%2 > 0) res+=3;
            else res-=1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of func (1-10): "); // выбор нужной функции чтобы не запускать сразу все
        int i = in.nextInt();
        if (i==1) {
            System.out.println(povtorenie("mice", 5));
            System.out.println(povtorenie("hello", 3));
            System.out.println(povtorenie("stop", 1));
        }
        if (i==2) {
            System.out.println(raznitsaMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
            System.out.println(raznitsaMaxMin(new int[]{44, 32, 86, 19}));
        }
        if (i==3) {
            System.out.println(tseloeIliNet(new int[]{1, 3}));
            System.out.println(tseloeIliNet(new int[]{1, 2, 3, 4}));
            System.out.println(tseloeIliNet(new int[]{1, 5, 6}));
            System.out.println(tseloeIliNet(new int[]{1, 1, 1}));
            System.out.println(tseloeIliNet(new int[]{9, 2, 2, 5}));
        }
        if (i==4) {
            for(int n : cumulativeSum(new int[]{1, 2, 3})){
                System.out.print(n + " ");
            }
            System.out.println();
            for(int n : cumulativeSum(new int[]{1, -2, 3})){
                System.out.print(n + " ");
            }
            System.out.println();
            for(int n : cumulativeSum(new int[]{3, 3, -2, 408, 3 , 3})){
                System.out.print(n + " ");
            }
            System.out.println();
        }
        if (i==5) {
            System.out.println(kolvoDesiatichihZnakov("43.20"));
            System.out.println(kolvoDesiatichihZnakov("400"));
            System.out.println(kolvoDesiatichihZnakov("3.1"));
        }
        if (i==6) {
            System.out.println(Fibonacci(3));
            System.out.println(Fibonacci(7));
            System.out.println(Fibonacci(12));
        }
        if (i==7) {
            System.out.println(isValid("59001"));
            System.out.println(isValid("853a7"));
            System.out.println(isValid("732 32"));
            System.out.println(isValid("393939"));
        }
        if (i==8) {
            System.out.println(isStrangePair("ratio", "orator"));
            System.out.println(isStrangePair("sparkling", "groups"));
            System.out.println(isStrangePair("bush", "hubris"));
            System.out.println(isStrangePair("", ""));
        }
        if (i==9) {
            System.out.println(isPrefix("automation", "auto-"));
            System.out.println(isSuffix("arachnophobia", "-phobia"));
            System.out.println(isPrefix("retrospect", "sub-"));
            System.out.println(isSuffix("vocation", "-logy"));
        }
        if (i==10) {
            for(int m=0; m<7; m++){
                System.out.println(boxSeq(m));
            }
        }
        else System.out.println("No, 1-10!");
    }
}
