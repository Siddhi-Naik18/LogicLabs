package com.java;
import java.util.*;


//Q1
// public class Day1 {
//     public static void reverseString(String s) {
//         String rev = "";
//         for(int i = s.length() - 1; i>=0; i--) {
//             rev = rev + s.charAt(i);
//         }
//         System.out.println(rev);
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string");
//         String s = sc.next();
//         System.out.println(s);
//         reverseString(s);

//     }
// }


//Q2
// public class Day1 {

//     public static void main(String args[]) {
//         int[] arr = {10, -3, 25, 7, 0};

//         int min = 0;
//         for(int i = 0; i<arr.length; i++) {
//             if(arr[i] < min) {
//                 min = arr[i];
//             }
//         }
//         System.out.println(min);

//     }
// }

//Q3
// public class Day1 {
//     public static void findPrime(int a) {
//         if (a <= 1) {
//             System.out.println(false);
//             return;
//         }

//         boolean isPrime = true;
//         for(int i = 2; i<a; i++) {
//             if(a%i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
//         System.out.println(isPrime);
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number");
//         int a = sc.nextInt();
//         System.out.println(a);
//         findPrime(a);

//     }
// }


//Q4
// public class Day1 {
//     public static void countChar(String s) {
//         Map<Character, Integer> charCounts = new HashMap<>();

//             for(int i = 0; i< s.length(); i++) {
//                 charCounts.put(s.charAt(i), charCounts.getOrDefault(s.charAt(i) , 0)+ 1);
//             }
//             System.out.println(charCounts);
//         }
    
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the String");
//         String s = sc.next();
//         System.out.println(s);
//         countChar(s);

//     }
// }


// Q5
public class Day1 {
    public static void reverseString(String s) {
        String rev = "";
        
        for(int i = s.length() - 1; i>=0; i--) {
            char ch = s.charAt(i);
            boolean isLetter = (ch >= 'a' && ch <='z') || (ch >= 'A' && ch <='Z');
            if(isLetter) {
                rev = rev + ch;
            }
        }
        System.out.println(rev);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        System.out.println(s);
        reverseString(s);

    }
}
