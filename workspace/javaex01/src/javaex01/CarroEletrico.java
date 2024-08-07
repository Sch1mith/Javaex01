package javaex01;

public class CarroEletrico extends Carro{

	public String TipoDeBateria;
	
	public void carregarBateria() {
		System.out.println("carregando a bateria");
	}
	
	public void acelerar () {
		System.out.println("acelerando o carro elétrico");
	}
	
	public CarroEletrico(String marcaInformado,String modeloInformado, int anoInformado) {
		super(marcaInformado, modeloInformado, anoInformado);
	}

}
