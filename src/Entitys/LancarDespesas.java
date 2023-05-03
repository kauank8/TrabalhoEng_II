package Entitys;

import java.sql.Date;

public class LancarDespesas extends Despesas {
	private double valor;
	private int ano;
	private int mes;
	private Date DTpagamento;
	private Date DTVencimento;
	
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public Date getDTpagamento() {
		return DTpagamento;
	}
	public void setDTpagamento(Date dTpagamento) {
		DTpagamento = dTpagamento;
	}
	public Date getDTVencimento() {
		return DTVencimento;
	}
	public void setDTVencimento(Date dTVencimento) {
		DTVencimento = dTVencimento;
	}
	
	
}
