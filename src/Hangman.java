/**
 * The Hangman class represents a game of Hangman.  A game must include the secret word, letters being guessed,
 * and the number of errors made.
 */

public class Hangman {
    private String secretWord;
    private int length;
    private String currentStr;
    private boolean endGame=false;
    private String compareStr;


    /**
     *Method for the Hangman class.  This stores the secret word made by one user in a variable and prints
     * out dashes representing each letter in the word so that it is easier for the other player to envision it.
     * @param secretWord represents the secret word one player made and the other player has to guess.
     */
    public Hangman(String secretWord){
        length=secretWord.length();
        this.secretWord=secretWord;
        currentStr="";
        for (int i =0; i<secretWord.length();i++){
            currentStr+="-";
        }
        compareStr=secretWord;
    }

    /**
     * Method for the Hangman class.  This checks whether the letter guessed is in the secret word or not.
     * @param letter represents the letter being guessed.
     * @return returns true if the letter is in the secret word and false if the letter is not in the secret word.
     */
    public boolean letterIsInWord(String letter){
        if (secretWord.contains(letter)){
            return true;
        }
        else{
            return false;
        }

    }

    /**
     * Method for the Hangman class.  If the user guesses a letter correctly, each dash representing the letter is
     * replaced with the actual letter.  Shows every instance of the letter in the word.
     * @param letter represents the letter being guessed.
     */

    public void currentWord(String letter){


        int place;
        if(letter.length()>1){
            System.out.println(letter);
        }
        else{

        while (compareStr.indexOf(letter)!=-1){
            place=compareStr.indexOf(letter);
            compareStr=compareStr.substring(0,place)+"~"+compareStr.substring(place+1);
            currentStr=currentStr.substring(0,place)+letter+currentStr.substring(place+1);
        }
        System.out.println("Word: " +currentStr);}
    }

    /**
     * Method for the Hangman class.  Prints out a hangman based on the number of mistakes made.  If number of
     * mistakes reach seven, variable endGame is set to true and the game will end.
     * @param mistakes represents the number of mistakes made.
     */

    public void printMan(int mistakes){
        if(mistakes==0){
            System.out.println("  ______");
            System.out.println(" |      |");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println("---");
        }
        if(mistakes==1){
            System.out.println("  _______");
            System.out.println(" |       |");
            System.out.println(" |       _");
            System.out.println(" |      |_| ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println("---");
        }
        if(mistakes==2){
            System.out.println("  _______");
            System.out.println(" |       |");
            System.out.println(" |       _");
            System.out.println(" |      |_| ");
            System.out.println(" |       |");
            System.out.println(" |       |");
            System.out.println(" |       |");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println("---");

        }
        if(mistakes==3){
            System.out.println("  _______");
            System.out.println(" |       |");
            System.out.println(" |       _");
            System.out.println(" |      |_| ");
            System.out.println(" |       |");
            System.out.println(" |      /|");
            System.out.println(" |     / |");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println("---");

        }
        if(mistakes==4){
            System.out.println("  _______");
            System.out.println(" |       |");
            System.out.println(" |       _");
            System.out.println(" |      |_| ");
            System.out.println(" |       |");
            System.out.println(" |      /|\\");
            System.out.println(" |     / | \\");
            System.out.println(" |       ");
            System.out.println(" |       ");
            System.out.println("---");

        }
        if(mistakes==5){
            System.out.println("  _______");
            System.out.println(" |       |");
            System.out.println(" |       _");
            System.out.println(" |      |_| ");
            System.out.println(" |       |");
            System.out.println(" |      /|\\");
            System.out.println(" |     / | \\");
            System.out.println(" |      /");
            System.out.println(" |     / ");
            System.out.println("---");

        }
        if(mistakes==6){
            System.out.println("  _______");
            System.out.println(" |       |");
            System.out.println(" |       _");
            System.out.println(" |      |_| ");
            System.out.println(" |       |");
            System.out.println(" |      /|\\");
            System.out.println(" |     / | \\");
            System.out.println(" |      / \\");
            System.out.println(" |     /   \\");
            System.out.println("---");
            endGame=true;

        }
    }






}
