package Exercicios_semana7;

import java.util.Scanner;

public class questao5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] nums = new int[10];
		
		for(int i = 0;i < 10;i++) {
			System.out.print("Digite números: ");
			nums[i] = sc.nextInt();
		}
		
		System.out.print("Digite um numero para busca-lo");
		int num = sc.nextInt();
		
		for(int i = 0;i < 10;i++) {
			if(nums[i] == num) {
				System.out.print("O numero foi encontrado");
				
			} 
		}
	}

}
