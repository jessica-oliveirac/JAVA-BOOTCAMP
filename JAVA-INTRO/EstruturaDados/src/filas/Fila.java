package filas;

public class Fila {
	private No refNoEntradaFila;
	
	public Fila() {
		this.refNoEntradaFila = null;	
	}
	
	public void enqueue(No novoNo) {
		novoNo.setRefNo(refNoEntradaFila);
		refNoEntradaFila = novoNo;
	}	
	
	public No first() {
		if (!this.isEmpty()) {
			No primeiroNo = refNoEntradaFila;
			while(true) {
				if(primeiroNo.getRefNo() != null) {
					
				}
			}
		}
		return null;
	}
	//retorna o primeiro nó
	
	public boolean isEmpty() {
		return refNoEntradaFila == null? true : false;
	}
}
