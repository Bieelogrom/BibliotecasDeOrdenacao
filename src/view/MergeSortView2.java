package view;

import controller.MergeSortController;

public class MergeSortView2 {
	public static void main(String[] args) {
		int[] vetor = {44,43,42,41,40,39,38};
		MergeSortController msl = new MergeSortController();
		
		int[] vetorOrdenado = msl.ordenarArray(vetor);
		
		for(int i : vetorOrdenado) {
			System.out.print(" "+ i);
		}
	}
}
