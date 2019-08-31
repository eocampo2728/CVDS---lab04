package hangman.model;

/**
 *Clases de equivalencia:
 *OriginalScore: 
 *  Invalidos:
 *      correctCount <= 0
 *      incorrecCount <= 0
 *  Valores validos:
 *      correctCount >= 0
 *      incorrecCount >= 0
 *  Minimos y maximos de variables:
 *      puntajeMinimo = 0
 *      puntajeInicial = 100
 * 
 *BonusScore:
 *  Invalidos:
 *      correctCount <= 0
 *      incorrecCount <= 0
 *  Valores validos:
 *      correctCount >= 0
 *      incorrecCount >= 0
 *  Minimos y maximos de variables:
 *      puntajeMinimo = 0
 *      puntajeInicial = 0
 * 
 *PowerBonusScore:
 *  Invalidos:
 *      correctCount <= 0
 *      incorrecCount <= 0
 *  Valores validos:
 *      correctCount >= 0
 *      incorrecCount >= 0
 *  Minimos y maximos de variables:
 *      puntajeMinimo = 0
 *      puntajeInicial = 0
 *      puntajeMaximo = 500
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2105057
 */
public class GameScoreTest {
    
    //Invalidos
    @Test
    public void noDeberiaCalcularConOriginalScore(){
        OriginalScore score = new OriginalScore();
        boolean valid;
        try{
            valid = true;
            int respuesta = score.calculateScore(-5, 1);
        }catch(Exception e){
            valid = false;
            assertFalse(valid);
        }
    }
    
    @Test
    public void noDeberiaCalcularConBonusScore(){
        BonusScore score = new BonusScore();
        boolean valid;
        try{
            valid = true;
            int respuesta = score.calculateScore(-5, 1);
        }catch(Exception e){
            valid = false;
            assertFalse(valid);
        }
    }
    
    @Test
    public void noDeberiaCalcularConPowerScore(){
        PowerScore score = new PowerScore();
        boolean valid;
        try{
            valid = true;
            int respuesta = score.calculateScore(-5, 1);
        }catch(Exception e){
            valid = false;
            assertFalse(valid);
        }
    }
    
    //Validos.
    @Test
    public void deberiaCalcularConOriginalScore(){
        OriginalScore score = new OriginalScore();
        assertEquals(score.calculateScore(5,3),70);    
    }
    
    @Test
    public void deberiaCalcularConBonusScore(){
        BonusScore score = new BonusScore();
        assertEquals(score.calculateScore(5,3),35);
    }
    
    @Test
    public void deberiCalcularConPowerBonusScore(){
        PowerScore score = new PowerScore();
        assertEquals(score.calculateScore(5,3),500);
    }
    
    //Minimos y maximos
    
    @Test
    public void deberiaConsiderarLosLimitesDeOriginalScore(){
        OriginalScore score = new OriginalScore();
        assertEquals(score.calculateScore(3,11),0); 
    }
    
    @Test
    public void deberiaConsiderarLosLimitesDeBonusScore(){
        BonusScore score = new BonusScore();
        assertEquals(score.calculateScore(2,5),0); 
    }
    
    @Test
    public void deberiaConsiderarLosLimitesDePowerScore(){
        PowerScore score = new PowerScore();
        assertEquals(score.calculateScore(4,2),500); 
    }
}
