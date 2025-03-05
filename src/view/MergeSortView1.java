package view;

import controller.MergeSortController;

public class MergeSortView1 {
	public static void main(String[] args) {
		int[] vetor = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
		MergeSortController msl = new MergeSortController();
		
		int[] vetorOrdenado = msl.ordenarArray(vetor);
		
		for(int i : vetorOrdenado) {
			System.out.print(" "+ i);
		}
	}
}
