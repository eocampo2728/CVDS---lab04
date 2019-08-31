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
public class OriginalScore implements GameScore{
    
    /**
     * Metodo que calcula es score del juego, con las siguientes condiciones
     * Se inicia en 100 puntos y por cada letra incorrecta se restan 10 puntos.
     * El puntaje minimo es 0
     * @param correctCount  Aciertos correctos del jugador.
     * @param incorrectCount    Aciertos incorrectos del jugador.
     * @return Retorna el puntaje del juego.
     */
    @override
    public int calculateScore(correctCount int, incorrectCount int){
        
    }
    
}
