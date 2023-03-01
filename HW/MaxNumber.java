package Lesson6.HW;

import java.util.Random;

public class MaxNumber {
    public static void main(String[] args) {



    //Создать программу, выводящую на экран случайно сгенерированное
    //трёхзначное натуральное число и его наибольшую цифру.
    //Например:Случайное число - 682, его наибольшая цифра - 8.

    Random random = new Random();
    int number = random.nextInt(100, 1000);
        System.out.println(number);
    int a = number % 10;
    int b = number / 10 % 10;
    int c = number / 100;
    int max;

    if ((a > b) && (a > c)) {

            max = a;
    } else if (b > a && b > c) {

        max = b;
    } else {
        max = c;}
        System.out.println("Наибольшая цифра " + max);


    }}

