/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatranning;

import java.util.Arrays;

/**
 *
 * @author ravinder
 */
public class JavaTranning {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        IShape tri =new Rectangle(23,34);
        tri.Draw();
        
        float area_rec =tri.getArea();
       System.out.println("Area Of Rectangle Is :"+area_rec) ;
        
        IShape sqr =new Square(5);
        sqr.Draw();
        float area_sqr =sqr.getArea();
        System.out.println("Area Of Square Is :"+area_sqr) ;
        
        
        Instrument tester =new StringedInstrument(6);
        tester.setName("Stringed Instrument");
        tester.Play();
        
        tester =new ElectricGuitar(6);
        tester.setName("Electric Guitar");
        tester.Play();
        
        tester =new ElectricBassGuitar(6);
        tester.setName("Electric Bass Guitar");
        tester.Play();
        
        
//       try
//       {
//           
//         String str ="Hello How are you ? Wishing you a very very bright future";
//		String temp ="";
//         	for(int i=0;i<=str.length();i++)
//		{
//			temp +=str.charAt(i);
//		}
//           
//       }
//       catch(StringIndexOutOfBoundsException ex)
//       {
//             System.out.println("Exception Handled: "+ex.toString());
//       }
       
    }
    /*
    String []array = new String[]{"Ravinder Knows","C#","Sql Server","Hadoop","Java"};
       System.out.println(Arrays.deepToString(array));
       
       try
       {
           System.out.println(array[6].toString());
           
       }
       catch(IndexOutOfBoundsException ex)
       {
             System.out.println("Exception Handled: "+ex.toString());
       }*/
    
    public static String GetData()
    {
        return null;
    }
    
}
