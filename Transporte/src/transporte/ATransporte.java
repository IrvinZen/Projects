/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporte;

/**
 *
 * @author Aula 209
 */
public abstract class ATransporte {
    
    public abstract String Apagar();
    public abstract String Manejo();
    
    private String EncenderMotor(int combustible)
    {
        return "Enciende Motor";
    }
    
}
