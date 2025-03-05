package controller;

import br.edu.fateczl.gabriel.MergeSort;

public class MergeSortController {
	public MergeSortController() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] ordenarArray(int[] vetor) {
		MergeSort msl = new MergeSort();
		int[] vetorOrdenado = msl.ordenarArray(vetor,0,vetor.length - 1);
		return vetorOrdenado;
	}
}
