/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.model;

/**
 *
 * @author 2105057
 */
public interface GameScore {
    
    /**
     * 
     */
    public int calculateScore (int correctCount, int incorrectCount)throws modelException;
    
    public int getInicialScore();
    
}
