package view;

import controller.BubbleSortController;

public class BubbleSortView1 {
	public static void main(String[] args) {
		int[] vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		BubbleSortController bs = new BubbleSortController();
		
		int[] vetorOrdenado = bs.ordenarArray(vetor);
		
		for(int i : vetorOrdenado) {
			System.out.print(" "+ i);
		}
	}
}
