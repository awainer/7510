package ar.fiuba.tecnicas.rockpaperscissors;
import ar.fiuba.tecnicas.rockpaperscissors.PlayerChoiceHashes;

class Rock implements PlayerChoice {
	private int type;
	
	public Rock(){
		this.type = PlayerChoiceHashes.ROCK.ordinal();
	}
	
	public PlayerChoice vs(Rock opponent) {
		return opponent; // o this, es lo mismo
	}

	public PlayerChoice vs(Paper opponent) {
		return opponent;
	}

	public PlayerChoice vs(Scissors opponent) {
		return this;
	}

	@Override
	public int hashCode(){
		return this.type;
	}
}
