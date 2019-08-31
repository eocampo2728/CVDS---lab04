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
     * @throws modelException   Valores invalidos.
     * @return Retorna el puntaje del juego.
     */
    public int calculateScore(int correctCount, int incorrectCount)throws modelException {
        if(correctCount <0 || incorrectCount <0 ){
            throw new modelException("Parametros Invalidos.");
        }
        int resp = 0;
        int puntaje = 100;
        resp = puntaje - (incorrectCount*10);
        if (resp < 0){
            resp = 0;
        }
        return resp;
    }
    
}
