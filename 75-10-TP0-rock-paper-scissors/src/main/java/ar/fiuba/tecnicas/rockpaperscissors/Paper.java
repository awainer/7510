package ar.fiuba.tecnicas.rockpaperscissors;

class Paper implements PlayerChoice {
	private int type;
	
	public Paper(){
		this.type = PlayerChoiceHashes.PAPER.ordinal();
	}

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
	public int hashCode(){
		return this.type;
	}
}
