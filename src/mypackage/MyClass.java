/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import exceptions.NoInstance;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author George.Pasparakis
 */
public class MyClass {
    private static MyClass myClass; // = new MyClass();
    
    private MyClass() {}
    
    public static MyClass getInstance() throws InstantiationException, IllegalAccessException {
        if(myClass == null) {
            try {
                // how to call the cosntructor from a method?
                throw new NoInstance("No Instance of MyClass!!!\nCreating new Instance!!!");
            } catch (NoInstance ex) {
                Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(new MyClass());
            myClass = MyClass.class.newInstance();
//            createInstance();
        }
        return(myClass);
    }
    
//    private static void createInstance() {
//        myClass = new MyClass();
//    }
    
    public void myMethod() {
        System.out.println(this);
    }
}
