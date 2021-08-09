package com.example.test;
import java.util.Scanner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TranInt2StringApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.next();
		
		int zero = (int)'0';
		int i = 0;
		char[] st  = str.toCharArray();
			for (char d : st) {
				int n = (int)d;
				if (n>= 48 && n <= 57) {
					i = i*10 + (n-zero);
				}
			}
		System.out.println("Integer : " + i);
	}
}
