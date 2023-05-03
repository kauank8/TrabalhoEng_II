package control;

import interfaces.LancarDespesasInterface;

public class CtrLancarGeral implements LancarDespesasInterface {

	//Eventos
	
	@Override
	public void BuscarDespesas() {
		// Nesse caso, o polimorfismo, se aplicaria pois essa linha de codigo conteria apenas despesas do tipo
		// Geral ou seja,agua, luz, gás, etc. Enquanto o lancamento de despesas Apartamentos
		// Teria apenas as despesas de Aps como salão de festa, aluguel de churrasqueira, sendo portanto, o mesmo metodos so que com
		// corpos diferentes.
		
	}

	@Override
	public void RegistrarDespesas() {
		// Nesse caso, o corpo desse metodo seria baseado em um registro de uma despesa para o condominio. Enquanto
		// Para os apartamentos teria seu registro associado a sua despesa variada.
	}
	
	
}
