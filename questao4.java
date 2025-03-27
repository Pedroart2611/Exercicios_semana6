package Exercicios_semana7;

import java.util.Scanner;

public class questao4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[9];
		int count = 0;
		
		for(int i = 0;i < 9;i++) {
			System.out.print("Digite números: ");
			num[i] = sc.nextInt();
			
			if(num[i] % 2 == 0) {
				count++;
			}
		}
		System.out.print("A quantidade de números pares: " + count);
	}

}
