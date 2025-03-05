package controller;

import br.edu.fateczl.gabriel.Bubblesort;

public class BubbleSortController {
	public BubbleSortController() {
		// TODO Auto-generated constructor stub
	}
	
	public int[] ordenarArray(int[] array) {
		Bubblesort bsl = new Bubblesort();
		int[] arrayOrdenado = bsl.ordenarArray(array);
		return arrayOrdenado;
	}
}
