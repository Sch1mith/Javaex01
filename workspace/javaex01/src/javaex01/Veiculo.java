package javaex01;

public class Veiculo {

	public String marca;
	public String modelo;
	public int ano;
	public String utilidade = "locomo��o";
	
	public Veiculo (String marcaInformada, String modeloInformado, int anoInformado) {
		this.marca = marcaInformada;
		this.modelo = modeloInformado;
		this.ano = anoInformado;
	}
	
	public void acelerar() {
		System.out.println("acelerando");
	}
	
	public void frear() {
		System.out.println("freando");
	}

}
