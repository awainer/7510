package ar.fiuba.tecnicas.rockpaperscissors;

/**
 *  Esta interfaz debe ser implementada por todas las 
 *  "manos" elegibles por un jugador de piedra, papel o tijera.  
 * @author ari
 **/
interface PlayerChoice {
	/**
	 * 
	 * @param opponent la mano del jugador con el que se enfrenta
	 * @return  this en caso de ser el ganador, opponent en caso de no serlo.
	 */
	public PlayerChoice vs(Rock opponent);
	public PlayerChoice vs(Paper opponent);
	public PlayerChoice vs(Scissors opponent);
}
