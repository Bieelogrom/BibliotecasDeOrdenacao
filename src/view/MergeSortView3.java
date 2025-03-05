package view;

import controller.BubbleSortController;

public class MergeSortView3 {
	public static void main(String[] args) {
		int[] vetor = {101,102,103,125,124,123,104,105,106,122};
		BubbleSortController bs = new BubbleSortController();
		
		int[] vetorOrdenado = bs.ordenarArray(vetor);
		
		for(int i : vetorOrdenado) {
			System.out.print(" "+ i);
		}
	}
}
