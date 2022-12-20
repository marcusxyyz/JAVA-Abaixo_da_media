package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many elements will the vector have? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		double sum = 0;
		for (int i=0; i<vect.length; i++) {
			System.out.print("Input a number: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		System.out.println();
		double avg = sum / vect.length;
		System.out.println("MEAN OF VECTOR = " + avg);
		
		
		System.out.println("ELEMENTS BELOW THE AVERAGE:");
		for (int i=0; i<vect.length; i++) {
			if(vect[i] < avg) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
