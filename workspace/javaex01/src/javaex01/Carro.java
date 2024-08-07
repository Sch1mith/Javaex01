package javaex01;

public class Carro extends Veiculo{

	public String tipoDeCombus;
	
	public void acelerar() {
		System.out.println("acelerando o carro");
	}
	
	public Carro (String marcaInformado,String modeloInformado, int anoInformado) {
		super(marcaInformado, modeloInformado, anoInformado);
	}

}
