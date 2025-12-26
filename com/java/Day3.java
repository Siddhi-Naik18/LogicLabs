package com.java;

import java.util.ArrayList;
import java.util.Scanner;

//Q1
public class Day3 {

    public static int evaluate(String s) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Character> ops = new ArrayList<>();

        for(int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') continue;

            else if (Character.isDigit(ch)) {
                int num = 0;

                while(i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num*10 + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                numbers.add(num);
            }

            else if(ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                    ops.add(ch);
            }

            else {
                System.out.println("Invalid character");
                return 0;
            }     
        }
        System.out.println(numbers);
        System.out.println(ops);

        int i = 0;
        while (i < ops.size()) {
            if (ops.get(i) == '*' ) {
                int num = numbers.get(i) * numbers.get(i+1);
                numbers.set(i, num);
                numbers.remove(i + 1);
                ops.remove(i);
            } 
            else if (ops.get(i) == '/') {
                int num = numbers.get(i) / numbers.get(i+1);
                numbers.set(i, num);
                numbers.remove(i + 1);
                ops.remove(i);
            } 
            else {
                i++;
            }
            
        }

        int j = 0;
        while (j < ops.size()) {
            if (ops.get(j) == '+' ) {
                int num = numbers.get(j) + numbers.get(j+1);
                numbers.set(j, num);
                numbers.remove(j + 1);
                ops.remove(j);
            }
            else if ( ops.get(j) == '-') {
                int num = numbers.get(j) - numbers.get(j+1);
                numbers.set(j, num);
                numbers.remove(j + 1);
                ops.remove(j);
            }
            else {
                j++;
            }
        }
        System.out.println(numbers);
        System.out.println(ops);

        return numbers.get(0);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine().toLowerCase();

        int result = evaluate(s);
        System.out.println("Result: " + result);

    }
  
}
