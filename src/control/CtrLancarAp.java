package control;

import interfaces.LancarDespesasInterface;

public class CtrLancarAp implements LancarDespesasInterface {

	@Override
	public void BuscarDespesas() {
		// Nesse caso, o polimorfismo, se aplicaria pois essa linha de codigo conteria apenas despesas do tipo
		// Apartamento, ou seja, salão de festa, aluguel de churrasqueira, etc. Enquanto o lancamento de despesas Apartamentos
		// Teria apenas as despesas do geral como: agua, luz, gás,  sendo portanto, o mesmo metodos so que com
		// corpos diferentes.
	}

	@Override
	public void RegistrarDespesas() {
		// Nesse caso, o corpo desse metodo seria baseado em um registro de uma despesa para um ap que teve
		// uma despesa especifica. Enquanto no geral seria registrado nas contas do condominio;
		
	}
	
}
