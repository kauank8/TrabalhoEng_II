package view;

import control.CtrLancarAp;
import control.CtrLancarGeral;
import interfaces.LancarDespesasInterface;

public class main {

	public static void main(String[] args) {
		// Exemplo da instancia do polimorfismo com interface
		
		//Controle de lancamentos para despesas em apartamentos
		LancarDespesasInterface LAp = new CtrLancarAp();
		LAp.BuscarDespesas();
		LAp.RegistrarDespesas();
		
		//Controle de lancamentos para despesas em Geral;
		LancarDespesasInterface LGeral = new CtrLancarGeral();
		LGeral.BuscarDespesas();
		LGeral.RegistrarDespesas();
		
		// * as implementação estão na classe control LancarDespesasGeral e LancarDespesasAp
		// Juntamente com a explicação das diferenças que teriam em seus corpos;

	}

}
