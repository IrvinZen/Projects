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
public class Automovil extends ATransporte implements ITransporte{

    private int combustible;
    public Automovil(int combustible)
    {
        //this.combustible = combustible;
        System.out.println(this.EncenderMotor(combustible));
    }
    public Automovil()
    {
        System.out.println(this.EncenderMotor());
    }

    Automovil(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String Apagar() {
        return "Apagar Automovil";
    }

    @Override
    public String SistemaFrenos() {
        return "Frena Automovil";
    }

    @Override
    public String SistemaElectrico() {
        return "Enciende Radio Automovil";
    }
    
    public String Acelerar(int combustible){
        return "Acelera"; //agregar if
    }

    private String EncenderMotor(int combustible, String matricula)
    {
        if(combustible<1)
        {
            return "Enciende Motor";
        }
        else
        {
            return "NO Enciende Motor";
        }
        
    }
    
    private String EncenderMotor()
    {
        return "Enciende Motor";
    }
    
    @Override
    public String Manejo() {
        return "Manejo Automovil";
    }

    private boolean EncenderMotor(int combustible) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
