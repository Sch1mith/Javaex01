package javaex01;

public class CarroEletrico extends Carro{

	public String TipoDeBateria;
	
	public void carregarBateria() {
		System.out.println("carregando a bateria");
	}
	
	public void acelerar () {
		System.out.println("acelerando o carro el�trico");
	}
	
	public CarroEletrico(String marcaInformado,String modeloInformado, int anoInformado) {
		super(marcaInformado, modeloInformado, anoInformado);
	}

}
