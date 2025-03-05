package view;

import controller.BubbleSortController;

public class BubbleSortView2 {
	public static void main(String[] args) {
		int[] vetor = {44,43,42,41,40,39,38};
		BubbleSortController bs = new BubbleSortController();
		
		int[] vetorOrdenado = bs.ordenarArray(vetor);
		
		for(int i : vetorOrdenado) {
			System.out.print(" "+ i);
		}
	}
}
