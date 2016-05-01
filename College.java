/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatranning;

import java.util.ArrayList;

/**
 *
 * @author ravinder
 */
public class College {
    
    ArrayList list =new ArrayList();
    public College()
    {
        list.add(new StdConcrete(1001, "Ravinder Singh", "123RDX"));
        list.add(new StdConcrete(1002, "Rahul", "1223RDX"));
        list.add(new StdConcrete(1003, "Preety", "1213RDX"));
        list.add(new StdConcrete(1004, "Sandeep", "12223RDX")); 
        list.add(new StdConcrete(1006, "Harry", "1213RDX"));
        list.add(new StdConcrete(1005, "Peter", "12223RDX")); 
        
        
        
        
    }
    
    public void SetResult()
    {
        ArrayList result =new ArrayList();
        result.add(new Result("Passed A+",2015,1001));
        result.add(new Result("Position A++",2015,1002));
        result.add(new Result("Fail A-",2015,1003));
        result.add(new Result("Passed B+",2015,1004));
        result.add(new Result("Passed B++",2015,1005));
        result.add(new Result("Passed A+",2015,1006));
       for(Object std : list)
       {
            for(Object res : result)
            {
               if(((StdConcrete)std).getRoll()==((Result)res).RollNo)
               {             
               ((StdConcrete)std).SetResult((Result)res);
                    break;
               }

            }
       }
    }
    public Result GetResult(int RollNo)
    {
       for(Object std : list)
       {
           if(((StdConcrete)std).getRoll()==RollNo)
           {
                return ((StdConcrete)std).getResult();
           }
           return null;
        }
       return null;
    }
    public void DisplayCollegeStd()
    {
       for(Object std : list)
       {
           
           ((StdConcrete)std).DisplayStudent();
            System.out.println("-----------------------------");
            
       }
    }
}
