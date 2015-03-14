package ar.fiuba.tecnicas.rockpaperscissors;

public class Scissors implements PlayerChoice {

	private int type;
	
	public Scissors(){
		this.type = PlayerChoiceHashes.SCISSORS.ordinal();
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
