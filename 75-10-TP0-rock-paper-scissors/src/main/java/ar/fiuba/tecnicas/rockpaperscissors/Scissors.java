package ar.fiuba.tecnicas.rockpaperscissors;

public class Scissors implements PlayerChoice {

	private int type;

	public Scissors() {
		this.type = PlayerChoiceHashes.SCISSORS.ordinal();
	}

	public PlayerChoice vs(Rock opponent) {
		return opponent;
	}

	public PlayerChoice vs(Paper opponent) {
		return this;
	}

	public PlayerChoice vs(Scissors opponent) {
		return this;
	}

	@Override
	public int hashCode() {
		return this.type;
	}
}
