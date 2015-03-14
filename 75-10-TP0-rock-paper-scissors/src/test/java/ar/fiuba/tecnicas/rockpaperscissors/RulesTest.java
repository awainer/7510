package ar.fiuba.tecnicas.rockpaperscissors;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import ar.fiuba.tecnicas.rockpaperscissors.Scissors;
import ar.fiuba.tecnicas.rockpaperscissors.Paper;

public class RulesTest {

    private PlayerChoice rock = new Rock();
    private PlayerChoice paper = new Paper();
    private PlayerChoice scissors = new Scissors();

    @Test
    public void rockBeatsScissors() {
        assertEquals(rock, rock.vs(scissors));
    }

    @Test
    public void rockLostWithPaper() {
        assertEquals(paper, rock.vs(paper));
    }

    @Test
    public void rockTieWithRock() {
        assertEquals(rock, rock.vs(rock));
    }

    @Test
    public void paperBeatsRock() {
        assertEquals(paper, paper.vs(rock));
    }

    @Test
    public void paperLostWithScissors() {
        assertEquals(scissors, paper.vs(scissors));
    }

    @Test
    public void paperTieWithPaper() {
        assertEquals(paper, paper.vs(paper));
    }

    @Test
    public void scissorsBeatsPaper() {
        assertEquals(scissors, scissors.vs(paper));
    }

    @Test
    public void scissorsLostWithRock() {
        assertEquals(rock, scissors.vs(rock));
    }

    @Test
    public void scissorsTieWithScissors() {
        assertEquals(scissors, scissors.vs(scissors));
    }
}