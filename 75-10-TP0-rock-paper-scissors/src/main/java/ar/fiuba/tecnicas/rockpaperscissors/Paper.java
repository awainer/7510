package ar.fiuba.tecnicas.rockpaperscissors;

class Paper implements PlayerChoice {

	public PlayerChoice vs(Rock opponent) {
		return this;
	}

	public PlayerChoice vs(Paper opponent) {
		return this;
	}

	public PlayerChoice vs(Scissors opponent) {
		return opponent;
	}

	@Override
	public int hashCode() {
		return PlayerChoiceHashes.PAPER.ordinal();
	}
}
