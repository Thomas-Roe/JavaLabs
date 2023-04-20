package Loops;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 10) {
			System.out.printf("%d squared = %d\n", i, i*i);
			i++;
		}
		int j = 0;
		do
		{
			System.out.printf("%d squared = %d\n", j, j*j);
			j++;
		} while (j < 10);
		for (int k = 0; k < 10; k++) {
			System.out.printf(k + "\n");
		}
	}

}
