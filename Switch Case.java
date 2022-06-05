package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	System.out.print("hello world\nvedant\nsheoran");
    String name = "anushka";
    int age = 18;
    System.out.print(age);
    int a = 10;
    int b = 23;
    int sum = a+b;
    int mul = a*b;
        System.out.print(mul);
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button) {
            case 1 -> System.out.println("namaste");
            case 2 -> System.out.println("hello");
            case 3 -> System.out.println("banjouver");
            default -> System.out.println("invalid ");
        }

    }
