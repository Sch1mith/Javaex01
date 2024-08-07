package javaex01;

public class JavaAtividade01 {

	public static void main(String[] args) {
		
		Veiculo trem = new Veiculo ("Stadler", "Cremalheira ", 2016);
		Veiculo monza = new Carro ("Chevrolet", "monza", 1982);
		Veiculo model_x = new CarroEletrico ("Tesla", "Model_X", 2015);
		
		trem.acelerar();
		trem.frear();
		
		monza.acelerar();
		monza.frear();
		
		model_x.acelerar();
		model_x.frear();
		
	}

}
