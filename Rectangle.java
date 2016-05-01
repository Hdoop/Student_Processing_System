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
public class Rectangle implements IShape {
    
    private float len ;
    private float wid;
    public Rectangle(float _len,float _wid)
    {
        len =_len;
        wid=_wid;
    }
    @Override
    public void Draw() {
        System.out.println("Rectangle Is Drawn");
    }
    
    @Override
    public float getArea() {
       return len*wid;
    }
    
}
