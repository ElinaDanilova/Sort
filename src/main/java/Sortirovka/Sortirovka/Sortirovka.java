package Sortirovka.Sortirovka;

public class Sortirovka {
	static void Sort(int[] array){
	     
	    for(int i = array.length-1 ; i > 0 ; i--){
	        for(int j = 0 ; j < i ; j++){
	          
	            if( array[j] > array[j+1] ){
	                int k = array[j];
	                array[j] = array[j+1];
	                array[j+1] = k;
	            }
	        }
	    }}
public static void main(String[] args) {

	int[] array= new int[17];
			for (int i = 0; i < array.length; i++) {
	    array[i] = (int)(Math.random() * 40);
	    System.out.print(array[i]+" ");
	}
			System.out.println();
			Sort(array);
			for (int i = 0; i < array.length; i++){
				System.out.print(array[i]+" ");
			}

	}

}
