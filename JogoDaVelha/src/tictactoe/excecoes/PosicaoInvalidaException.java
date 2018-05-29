package tictactoe.excecoes;

/**
 * Essa classe eh utilizada para verificacao da excecao quando o jogador tenta utilizar 
 * um espaco nao valido na matriz (maior que 9 ou menor que 1)
 * @author Enrique Augusto
 * @author Paulo Ricardo
 * @version 1.0
 */

public class PosicaoInvalidaException extends Exception {
	public String toString() {
		return "Posi��o fora das 9 casas de jogo! Refa�a sua jogada em uma posi��o v�lida!";
	}
}