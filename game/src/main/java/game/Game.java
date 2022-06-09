package game;

public class Game {


    private  String word;
    private int attempts=10;
    public Game(String word){
        this.word=word;

    }

    public int getRemainingAttempts(){
        return attempts;
    }


    public StringBuilder getWordToGuess() {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < this.word.length(); i++) {
            Character currentLetter = this.word.charAt(i);
            if(i==0){builder.append(currentLetter);}
            else {builder.append("_");}
        }

        return builder;
    }

}
