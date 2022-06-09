package game;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class gameTest {
    @Test
    public void testGetsWordToGuess(){
        Game game = new Game("Makers");
        assertEquals("M_____",(game.getWordToGuess()).toString());
    }

    @Test
    public void getsRemainingAndInitialAttempts(){
        Game game = new Game("Makers");
        assertEquals(10,game.getRemainingAttempts());
    }
}
