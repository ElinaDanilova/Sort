package Sortirovka.Sortirovka;
import java.util.*;
public class Sortirovka2 {

	public static void main(String[] args) {
		
		int array[] = new int[10];
		for(int i = 0; i <  array.length; i++) {
			array[i] =  (int)(Math.random() * 50);
			System.out.print(array[i] + "  ");
		}
		System.out.print("\nОтсортированный массив: \n");
		
		Arrays.sort(array);
	
		for(int i = 0; i <  array.length; i++) {
			System.out.print(array[i] + "  ");
		}
	}

}
