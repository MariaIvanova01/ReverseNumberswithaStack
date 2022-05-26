package com.company;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String num : input) {
            stack.push(Integer.parseInt(num));
        }

        for (Integer el : stack) {
            System.out.printf("%s ",stack.pop());
        }
    }
}
