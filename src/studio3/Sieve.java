package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many numbers do you want in the sieve? ");
		int n = in.nextInt();
		boolean[]list = new boolean[n];
		boolean sieve = false; 
		boolean isPrime = false; 
		int runs = 0;
		int j;
		while(!sieve) {
			for(int i = p; i < list.length; i+=p) {
				if(runs > 0) {
					list[i] = true;
				}
			}
			j = 1;
			if(p <= Math.sqrt(n)) {
				sieve = true;
			}
			while(isPrime == false) {
				if(list[p+j] == false) {
					System.out.println(p + j + " is prime");
					isPrime = true;
					p = p + j;
				}
				j++;
			}
			isPrime = false;
		

	}
		System.out.println(Arrays.toString(list));
		for(int i = 0; i < list.length; i++) {
			if(list[i] == false) {
				System.out.println(i);
			}
		}
}
}

