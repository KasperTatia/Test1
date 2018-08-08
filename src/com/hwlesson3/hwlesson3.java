package com.hwlesson3;
//C помощью циклов нарисовать такую фигуру:
//*
//**
//***
//****
//***
//**
//*
//Максимальная высота вводится с клавиатуры (в данном примере высота 4)

import java.util.Scanner;

public class hwlesson3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число:");
		int num = sc.nextInt();
		for (int i = 0; i < (num * 2); i++) {
			if (i < num)
				for (int j = 0; j < i; j++) {
					System.out.print("*");
				}
			else if (i == num)
				for (int j = 0; j < num; j++) {
					System.out.print("*");
				}
			else
				for (int j = 0; j < (num - (i - num)); j++) {
					System.out.print("*");
				}
			System.out.println("");
		}
		sc.close();
	}

}