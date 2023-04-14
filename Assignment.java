/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author Ayman
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Account s= new Account (220,6000);
  s.getId(22010063);
  s.getBalance(7000);
       s.getannualInterstRate(0.55);   
       s.DataCreated();
        System.out.println("the total is after depoist is="+s.depoist(3000));
          System.out.println("the total is after withdraw is="+s.withdrow(4000));
   
    }
    
}
