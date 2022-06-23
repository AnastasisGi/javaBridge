package game;

import java.util.ArrayList;

public class Game {


    private  String word;
    private int attempts=10;

    private ArrayList<Character>guessedLetterArray=new ArrayList<>();



    public Game(WordChoser wordChoser){
        this.word=wordChoser.getRandomWordFromDictionary();

    }

    public int getRemainingAttempts(){
        return attempts;
    }


    public String getWordToGuess(Character letter) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < this.word.length(); i++) {
            Character currentLetter = this.word.charAt(i);
            if(i==0){builder.append(currentLetter);}
            else {

                if (guessedLetterArray.indexOf(currentLetter)!=-1) {

                    builder.append(currentLetter);


                } else {
                    builder.append("_");
                }
                }

            }
        return builder.toString();
    }




        public Boolean guessLetter(Character letter){

            if (this.word.indexOf(letter)!=-1){
              guessedLetterArray.add(letter);
              return true;
            } else {
                attempts--;
                return false;
            }

        }






}
