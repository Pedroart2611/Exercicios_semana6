package Exercicios_semana7;

import java.util.Scanner;

public class Exercicios {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[5];
		int maiorNum = 0;
		int menorNum = 0;
		
		for(int i = 0;i < 5;i++) {
			System.out.println("Digite um número:");			
			array[i] = sc.nextInt();
			
			if(array[i] > maiorNum) {
				maiorNum = array[i];
			} else if(array[i] < menorNum || menorNum == 0) {
				menorNum = array[i];
			}
		}
		System.out.println("O maior numero é: " + maiorNum);
		System.out.println("O menor número é: " + menorNum);
	}
}
