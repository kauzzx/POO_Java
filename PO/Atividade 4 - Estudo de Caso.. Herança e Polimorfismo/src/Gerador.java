/**
 * Classe Gerador extends da classe ProdutoWEG
 * 
 * @author Kauê Schaefer de Andrade
 *
 */

public class Gerador extends ProdutoWEG {
	/** Propriedade tipo de combustível do gerador */
	private String tipoDeCombustivel;
	/** Propriedade autonomia do gerador */
	private String autonomia;
	
	/**
	 * Método construtor
	 */
	public Gerador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Método para retornar o tipo de combustível do gerador
	 * 
	 * @return tipoDeCombustivel
	 */
	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}
	/**
	 * Procedimento para verificar o tipo de combustível do gerador
	 * 
	 * @param tipoDeCombustivel
	 */
	
	
	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	/**
	 * Método para retornar a autonomia do gerador
	 * 
	 * @return autonomia
	 */
	public String getAutonomia() {
		return autonomia;
	}
	/**
	 * Procedimento para verificar a autonomia do gerador
	 * 
	 * @param autonomia
	 */
	public void setAutonomia(String autonomia) {
		this.autonomia = autonomia;
	}
	
	
}
