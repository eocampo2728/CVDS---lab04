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
public class BonusScore implements GameScore {
    /**
     * Metodo que calcula es score del juego, con las siguientes condiciones:
     * Se inicia en 0 puntos y se bonifica con 10 puntos por cada acierto y se penaliza con 5 por cada incorrecta.
     * El puntaje minimo es 0
     * @param correctCount  Aciertos correctos del jugador.
     * @param incorrectCount    Aciertos incorrectos del jugador.
     * @return Retorna el puntaje del juego.
     */
    @override
    public int calculateScore(correctCount int, incorrectCount int){
        
    }
}
