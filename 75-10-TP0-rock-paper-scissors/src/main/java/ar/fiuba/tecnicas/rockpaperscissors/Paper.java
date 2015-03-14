package ar.fiuba.tecnicas.rockpaperscissors;

class Paper implements PlayerChoice {
	private int type;
	
	public Paper(){
		this.type = PlayerChoiceHashes.PAPER.ordinal();
	}

	public PlayerChoice vs(Rock opponent) {
		// TODO Auto-generated method stub
		return null;
	}

	public PlayerChoice vs(Paper opponent) {
		// TODO Auto-generated method stub
		return null;
	}

	public PlayerChoice vs(Scissors opponent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int hashCode(){
		return this.type;
	}
}
