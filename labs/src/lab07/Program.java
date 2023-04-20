package lab07;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		Program program = new Program();
		// TODO Auto-generated method stub
		program.start();
	}
	public void start() {
		int[] numbers = {1, 3, -5, 7, 0, 4, 6, 8};
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println(sum);
		int avg = (sum / numbers.length);
		System.out.println(avg);
		int min = numbers[0];
		int max = numbers[0];
		for (int j = 0; j < numbers.length; j++) {
			if(numbers[j]<min) {
				min = numbers[j];
			}
		}
		System.out.println(min);
		for (int k = 0; k < numbers.length; k++) {
			if(numbers[k]>max) {
				max = numbers[k];
			}
		}
		System.out.println(max);
		int index = 0;
		for (int l = 0; l < numbers.length; l++) {
			if(numbers[l]==0) {
				index = l;
				break;
			}
		}
		System.out.println(index);
		sort(numbers);
	}
	public void sort(int[] numbers) {
		ArrayList<Integer> nos = new ArrayList<>();
		for (int n:numbers) {
			nos.add(n);
		}
		Collections.sort(nos);
		System.out.println(nos);
	}
}
