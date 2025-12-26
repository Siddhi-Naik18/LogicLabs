package com.java;
import java.util.*;

//Q1
// public class Day2 {

//     public static void ctof(int value) {
//         int b = (int)((double)value * 1.8 + 32);
//         System.out.println("Fahrenheit: " + b);
//     }

//     public static void ftoc(int value) {
//         int b = (int)((value - 32)*(5.0/9));
//         System.out.println("Celcius: " + b);
//     }

//     public static void main(String args[]) {
        
//         System.out.println("Enter your choice: ");
//         System.out.println("1. Celcius to Fahrenheit");
//         System.out.println("2. Fahrenheit to Celcius");
//         Scanner sc = new Scanner(System.in);
//         int choice = sc.nextInt();

//         switch(choice) {
//             case 1:
//                 System.out.println("Enter the value: ");
//                 int c = sc.nextInt();
//                 ctof(c);
//                 break;
//             case 2:
//                 System.out.println("Enter the value: ");
//                 int f = sc.nextInt();
//                 ftoc(f);
//                 break;
//         }
//     }
// }


//Q2
// public class Day2 {

//     public static int percentage(int[] arr) {
//         int sum = 0;

//         for(int i = 0; i<5; i++) {
//             sum += arr[i];
//         }

//         int percentage = ((sum)*100)/500;
//         return percentage;
//     }
//     public static void main(String args[]) {
//         System.out.println("Enter the marks: ");
//         Scanner sc = new Scanner(System.in);
//         int[] marks = new int[5];

//         for(int i = 0; i<5; i++) {
//             marks[i] = sc.nextInt();
//         }
        
//         int percent = percentage(marks);
//         System.out.println("Percentage: " + percent);
//         if(percent >= 90) {
//             System.out.println("Grade : A");
//         }
//         else if(percent >= 75) {
//             System.out.println("Grade : B");
//         }
//         else if(percent >= 60) {
//             System.out.println("Grade : C");
//         }
//         else if(percent >= 40) {
//             System.out.println("Grade : D");
//         }
//         else if(percent < 40) {
//             System.out.println("Grade : F");
//         }


//     }
// }


// Q3
// public class Day2 {
//     public static void main(String args[]) {
//         for(int i = 0; i<=4; i++) {
//             for(int j = 0; j<i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


//Q4
// public class Day2 {
//     public static void main(String args[]) {
//         System.out.println("Enter the string: ");
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String rev = "";
        
//         for(int i = s.length() - 1; i>=0 ; i--) {
//             rev = rev + s.charAt(i);
//         }
//         System.out.println(rev);
//     }
// }


// Q5
// public class Day2 {
//     public static void main(String args[]) {
//         System.out.println("Enter the array: ");
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[5];
//         for(int i = 0; i<5; i++) {
//             arr[i] = sc.nextInt();
//         }

//         Arrays.sort(arr);
//         System.out.println("Second largest element: " + arr[3]);

//     }
// }


// Q6
// public class Day2 {

//     public static void checkPalindrome(String s) {
//         s = s.toLowerCase();
//         String rev = "";

//         for(int i = s.length() - 1; i>=0; i--) {
//             rev = rev + s.charAt(i);
//         }

//         boolean isPalindrome = false;
        
//         if (s.equals(rev)) {
//             isPalindrome = true;
//         }

//         if(isPalindrome) {
//             System.out.println("Palindrome");
//         }
//         else {
//             System.out.println("Not a Palindrome");
//         }
    
//     }
//     public static void main(String args[]) {
//         System.out.println("Enter the string: ");
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();

//         checkPalindrome(s);
//     }
// }


//Q7
// public class Day2 {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of n: ");
//         int n = sc.nextInt();
//         System.out.println("Enter the numbers: ");

//         int[] arr = new int[n];
//         for(int i = 0; i<n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int evenSum = 0;
//         int oddSum = 0;
//         for(int i = 0; i<n; i++) {
//             if(arr[i]%2 == 0) {
//                 evenSum += arr[i];
//             }
//             else {
//                 oddSum += arr[i];
//             }
//         }

//         System.out.println("Even Sum: " + evenSum);
//         System.out.println("Odd Sum: " + oddSum);
//     }
// }


//Q8
// public class Day2 {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of n: ");
//         int n = sc.nextInt();
//         System.out.println("Enter the numbers: ");

//         int[] arr = new int[n];
//         for(int i = 0; i<n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int evenSum = 0;
//         int oddSum = 0;
//         for(int i = 0; i<n; i++) {
//             if(arr[i]%2 == 0) {
//                 evenSum += arr[i];
//             }
//             else {
//                 oddSum += arr[i];
//             }
//         }

//         System.out.println("Even Sum: " + evenSum);
//         System.out.println("Odd Sum: " + oddSum);
//     }
// }


//Q8
// public class Day2 {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the string: ");

//         String s = sc.nextLine().toLowerCase();
        
//         Map<String, Integer> wordCounts = new HashMap<>();
//         String[] words = s.trim().split("\\s+");

//         for(String word : words) {
//             wordCounts.put(word, wordCounts.getOrDefault(word,0 ) + 1);

//         }

//         System.out.println(wordCounts);
//     }
// }


//Q9
// public class Day2 {

//     public static void factorial(int n) {
//         int fact = 1;

//         for(int i = 1; i<=n; i++) {
//             fact = fact*i;
//         }

//         System.out.println(fact);
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number: ");

//         int n = sc.nextInt();

//         factorial(n);
    
        
//     }
// }

//Q10


public class Day2 {

    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int balance = 1000;
        int choice;

        do {
            System.out.println("\n ATM MENU");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: " + balance);
                    break;
                case 2:
                    System.out.println("Enter the amount: ");
                    int deposit = sc.nextInt();

                    if(deposit > 0) {
                        balance += deposit;
                        System.out.println("New Balance: " + balance);
                    }
                    else {
                        System.out.println("Invalid amount");
                    }
                    break;
                case 3:
                    System.out.print("Enter amount: ");
                    int withdraw = sc.nextInt();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("New Balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance or invalid amount");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        }

        while (choice != 4);        
        
    }
}