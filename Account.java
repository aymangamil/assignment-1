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
class Account {
     private  int id;
    private  double balance;
      private double annualInterstRate;   
      private int dataCreated ;
      Account(int id,double balance){
          this.balance=balance;
          this.id=id;
      }
      public void getId(int x){
          id=x;
       
      }
     public void getBalance(double y){
          balance=y;
       
     }
       public void getannualInterstRate(double z){
        annualInterstRate=z;
       
     }
       public void DataCreated(){
           System.out.println("id="+id);
           System.out.println("balance="+balance);
           System.out.println("annualInterstRate"+annualInterstRate);
           
       }
       public double withdrow(int a){
          double s= balance-a;
           return s;
       }
         public double depoist(int b){
          double s= balance+b;
           return s;
         }
         
}


