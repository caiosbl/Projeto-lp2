package projeto.cartao;

import projeto.Cartao;

/**
 * Cartão do tipo Noob.
 * 
 * @author caiosbl
 * @version 1.0
 *
 */

public class Noob implements Cartao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7067049943461310050L;

	/**
	 * Retorna se o cartão pode pegar um item emprestado.
	 * 
	 * @return boolean
	 */
	@Override
	public boolean emprestimoLiberado() {
		return true;
	}

	/**
	 * Valida um período de empréstimo de acordo com o cartão.
	 * 
	 * @param periodo
	 *            Perído de emprestimo
	 * @return boolean
	 */
	@Override
	public boolean validaPeriodo(int periodo) {
		if (periodo > 7) {
			return false;
		}
		return true;
	}

	/**
	 * Retorna em String o tipo do Cartão.
	 * 
	 * @return
	 */
	@Override
	public String getTipo() {
		return "Noob";
	}

}
