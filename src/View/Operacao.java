package View;

public class Operacao {
	
	//Classe ainda não implementada no sistema
	
	
	private Double soma;
	private Double subtracao;
	private Double multiplicacao;
	private Double divisao;
	private Double Porcentagem;
	
	
	
	public Double getPorcentagem() {
		return Porcentagem;
	}
	public void setPorcentagem(Double porcentagem) {
		Porcentagem = porcentagem;
	}
	public Double getSoma(Double x, Double y) {
		
		soma= x + y;
		
		return soma;
	
	}
	public void setSoma(Double soma) {
		this.soma = soma;
	}
	public Double getSubtracao(Double x, Double y) {
		
		subtracao = x - y;
		
		return subtracao;
	}
	public void setSubtracao(Double adicao) {
		this.subtracao = adicao;
	}
	public Double getMultiplicacao(Double x, Double y) {
		
		multiplicacao = x * y;
		
		
		return multiplicacao;
	}
	public void setMultiplicacao(Double multiplicacao) {
		this.multiplicacao = multiplicacao;
	}
	public Double getDivisao(Double x, Double y) {
		
		divisao = x / y;
		
		
		return divisao;
	}
	public void setDivisao(Double divisao) {
		this.divisao = divisao;
	}
	
	






}


