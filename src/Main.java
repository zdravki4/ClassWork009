import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Main {
	/**
	 * Да се въведат два масива от N елемeнта цели числа. Да се изведат всички
	 * елементи, които се срещат и в двата масива.
	 */
	public static void task1() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array1[] = new int[n];
		int[] array2 = new int[n];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = sc.nextInt();
		}
		for (int i = 0; i < array2.length; i++) {
			array2[i] = sc.nextInt();
		}
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					System.out.println(array2[j]);
				}
			}
		}
	}
	/**
	 * Имате двумерен масив от естествени числа от интервала [0..100].  Да се
	 * състави програма, чрез която се извеждат елементите от масива с
	 * най-малката и най-голямата стойност заедно с индексите, на които се
	 * намират.
	 */
	public static void task2() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array1[][] = new int[n][n];
		Random r = new Random();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int maxI = 0;
		int maxJ = 0;
		int minI = 0;
		int minJ = 0;
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = r.nextInt(101);
			}
		}
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				if (array1[i][j] > max) {
					max = array1[i][j];
					maxI = i;
					maxJ = j;
				}
				if (array1[i][j] < min) {
					min = array1[i][j];
					minI = i;
					minJ = j;
				}
			}
		}
		System.out.println(Arrays.deepToString(array1));
		System.out.println(minI);
		System.out.println(minJ);
		System.out.println(maxI);
		System.out.println(maxJ);
	}
	/**
	 * Даден е масив с 10 елемента. Да се намери максималния измежду елементите
	 * с четен индекс и минималния измежду елементите с нечетен индекс.
	 * 
	 */
	public static void task3() {
		int[] array = { 6, 5, 8, 1, 2, 3, 4, 7, 9, 10 };
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) {
				if (array[i] > max) {
					max = array[i];
				}
			}
			if (i % 2 != 0) {
				if (array[i] < min) {
					min = array[i];
				}
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println(min);
		System.out.println(max);
	}
	public static void main(String[] args) {
		task1();
		task2();
		task3();
	}
}