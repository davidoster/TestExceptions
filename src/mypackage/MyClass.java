/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;



/**
 *
 * @author George.Pasparakis
 */
public class MyClass {
    private static MyClass myClass; // = new MyClass();
    
    private MyClass() {
        
//        myClass = new MyClass();
    }
    
    public static MyClass getInstance() throws InstantiationException, IllegalAccessException {
        if(myClass == null) {
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
