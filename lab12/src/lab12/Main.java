package lab12;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int a[] = new int[10], i, num;
		for (i=0;i<10;i++) {
			a[i] = 1+(int) + (Math. random()*100);
			}
		System.out.print("Enter index to search: ");
		Scanner m = new Scanner (System. in);
		num = m.nextInt();
		try{
			System. out.println("Value found in: " + a[num]);
			}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bound");
			}
		}
	}