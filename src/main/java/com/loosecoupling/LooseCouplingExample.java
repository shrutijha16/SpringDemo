package com.loosecoupling;

public class LooseCouplingExample {
    public static void main(String[]args){
    UserDataBaseProvider uservariable= new UserDatabase();
    UserManager manager=  new UserManager(uservariable);
    System.out.println(manager.getUserinfo());

}
}
