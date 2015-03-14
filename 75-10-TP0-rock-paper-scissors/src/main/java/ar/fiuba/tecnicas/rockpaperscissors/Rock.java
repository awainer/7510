package ar.fiuba.tecnicas.rockpaperscissors;

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


	public boolean equals(Rock aRock){
		return true;
	}

	@Override
	public boolean equals(Object o){
		return false;
	}


}
