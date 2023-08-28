package Easy;

import java.util.Scanner;

public class Bitwise_for_Dummies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int p = sc.nextInt();
		int q = sc.nextInt();
		int x = sc.nextInt();
		int f = a & b;
		int g = a | b;
		int h = a ^ b;
		int i = p << q;
		int j = p >> q;
		int k = ~x;

		System.out.println(f + "\n" + g + "\n" + h + "\n" + i);
		System.out.print(j + "\n" + k);

	}

}
