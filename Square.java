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
public class Square implements IShape {
    private float side ;
   public Square(float _side)
   {
       side=_side;
   }
    @Override
    public void Draw() {
        System.out.println("Square Is Drawn");
    }
    
    @Override
    public float getArea() {
       return side*side;
    }
    
}
