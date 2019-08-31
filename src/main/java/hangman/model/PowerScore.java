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
public class PowerScore implements GameScore{
    /**
     * Metodo que calcula es score del juego, con las siguientes condiciones
     * Se inicia en 0 puntos.
     * El i-esima letra corrcta se bonifica con 5^i.
     * El puntaje minimo es 0.
     * Si se sobrepasa de 500 puntos el puntaje maximo es 500.
     * @param correctCount  Aciertos correctos del jugador.
     * @param incorrectCount    Aciertos incorrectos del jugador.
     * @return Retorna el puntaje del juego.
     */
    @override
    public int calculateScore(correctCount int, incorrectCount int){
        
    }
}
