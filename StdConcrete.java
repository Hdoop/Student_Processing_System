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
public class StdConcrete extends Student {

    public StdConcrete(int _roll,String _name,String _regno)
    {
        setRoll(_roll);
        setName(_name);
        setRegisterationNo(_regno);
    }
    int Roll;
    String Name;
    String RegNo;
    @Override
    public int getRoll() {
        return Roll;
    }

    @Override
    public void setRoll(int _roll) {
        this.Roll =_roll;
    }

    @Override
    public String getName() {
       return Name;
    }

    @Override
    public void setName(String _name) {
        this.Name =_name;
    }

    @Override
    public String getRegisterationNo() {
        return RegNo;
    }

    @Override
    public void setRegisterationNo(String _regno) {
        this.RegNo =_regno;
    }

    @Override
    public void DisplayStudent() {
        System.out.println("Student Information :");
        System.out.println("Name :" +this.Name);
        System.out.println("RegNo :" +this.RegNo);
        System.out.println("RollNo :" +this.Roll);
    }
    
    private Result result;
    public void SetResult(Result _res)
    {
       this.result=_res;        
    }
    public Result getResult()
    {
       return result;   
    }
}
