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
     * @throws modelException   Valores invalidos.
     * @return Retorna el puntaje del juego.
     */
    public int calculateScore(int correctCount, int incorrectCount)throws modelException{
        if(correctCount <0 || incorrectCount <0 ){
            throw new modelException("Parametros Invalidos.");
        }
        int resp = 0;
        for(int i=0; i<correctCount;i++){
            resp += Math.pow(5,i+1);
        }
        resp -= incorrectCount*8;
        if (resp < 0){
            resp = 0;
        }else if(resp > 500){
            resp = 500;
        }
        return resp;
    }
    
    public int getInicialScore(){
        return 0;
    }
}
