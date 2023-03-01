package Lesson6.HW;

import java.util.Scanner;

public class Summa {
    public static void main(String[] args) {
        //Пользователь вводит с клавиатуры
        //трёхзначное число. Напишите программу, которая
        //читает сумму всех цифр этого числа и выводит её в консоль.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите трехзначное число");
        int number = scanner.nextInt();
        int a = number % 10;
        int b = number / 10 % 10;
        int c = number /100;
        System.out.println("Сумма всех цифр равна " + (a + b + c));



    }
}
