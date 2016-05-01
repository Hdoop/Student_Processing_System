/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatranning;

/**
 *
 * @author ravinder
 */
public class ElectricGuitar extends Instrument {

    String Name="";
    @Override
    public String getName() {
        return Name; 
    }

    @Override
    public void setName(String _name) {
        this.Name=_name;
    }

    @Override
    public void Play() {
        
        System.out.println("Playing "+this.getName());
        System.out.println("Instrument has  "+String.valueOf(numberOfStrings)+" Nos of strings");
    }
    public ElectricGuitar(int _numberOfStrings)
    {
        numberOfStrings=_numberOfStrings;
    }
    public int numberOfStrings;
    
}
