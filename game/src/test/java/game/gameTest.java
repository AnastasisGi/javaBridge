package game;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class gameTest {
    @Test
    public void testGetsWordToGuess() {
        WordChoser mockedWordChoser = mock(WordChoser.class);
        when(mockedWordChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        Game game = new Game(mockedWordChoser);
        assertEquals("D________", (game.getWordToGuess(null)).toString());
    }

    @Test
    public void getsRemainingAndInitialAttempts() {
        WordChoser mockedWordChoser = mock(WordChoser.class);
        when(mockedWordChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        Game game = new Game(mockedWordChoser);
        assertEquals(10, game.getRemainingAttempts());
    }

    @Test
    public void guessLetterTestToReturnFalseAndGetRemainingAttempts(){
        WordChoser mockedWordChoser = mock(WordChoser.class);
        when(mockedWordChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        Game game = new Game(mockedWordChoser);
        assertEquals(false,game.guessLetter('O'));
        assertEquals(9,game.getRemainingAttempts());
    }

    @Test
    public void guessLetterTestToReturnTrueAndGetRemainingAttempts(){
        WordChoser mockedWordChoser = mock(WordChoser.class);
        when(mockedWordChoser.getRandomWordFromDictionary()).thenReturn("MAKERS");
        Game game = new Game(mockedWordChoser);
        assertEquals(true,game.guessLetter('M'));
        assertEquals(10,game.getRemainingAttempts());
    }
}
