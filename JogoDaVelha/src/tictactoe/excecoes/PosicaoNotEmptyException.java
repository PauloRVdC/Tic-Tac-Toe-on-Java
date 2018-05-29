package tictactoe.excecoes;

/**
 * Essa classe eh utilizada para verificacao da excecao quando o jogador tenta utilizar 
 * um espaco nao vazio
 * @author Enrique Augusto
 * @author Paulo Ricardo
 * @version 1.0
 */

public class PosicaoNotEmptyException extends Exception {
	public String toString() {
		return "Posi��o n�o vazia! Refa�a sua jogada em uma posi��o v�lida!";
	}
}