package Exercicios_semana7;

import java.util.Scanner;

public class questao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] invertido = new int[6];
		
		for(int i = 0; i < 6;i++) {
			System.out.print("Digite os números: ");
			invertido[i] = sc.nextInt();
		}
		for(int i = 5;i != -1;i--) {
			System.out.println("Os números na ordem invertida: " + invertido[i]);
		}
	}

}
