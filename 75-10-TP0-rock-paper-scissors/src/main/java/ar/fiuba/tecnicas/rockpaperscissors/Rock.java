package ar.fiuba.tecnicas.rockpaperscissors;

import ar.fiuba.tecnicas.rockpaperscissors.PlayerChoiceHashes;

class Rock implements PlayerChoice {

	public PlayerChoice vs(Rock opponent) {
		return this;
	}

	public PlayerChoice vs(Paper opponent) {
		return opponent;
	}

	public PlayerChoice vs(Scissors opponent) {
		return this;
	}

	@Override
	public int hashCode() {
		return PlayerChoiceHashes.ROCK.ordinal();
	}
}
