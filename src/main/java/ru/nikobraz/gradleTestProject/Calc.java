package ru.nikobraz.gradleTestProject;

public class Calc {
    public static void main(String[] args) {
        System.out.println(args);
        int output = sum(44,3);

        System.out.println(output);
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    static int mul(int a, int b) {
        return a * b;
    }
    static int div(int a, int b) {
        return a / b;
    }
}
