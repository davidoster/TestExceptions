/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexceptions;

import mypackage.MyClass;
import testexceptions.Parent.SomeClass;

/**
 *
 * @author George.Pasparakis
 */
public class TestExceptions { //extends Parent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        MyClass myClass = MyClass.getInstance();
        myClass.myMethod();
        MyClass myClass2 = MyClass.getInstance();
        myClass2.myMethod();
        MyClass myClass3 = myClass2.getInstance();
        myClass3.myMethod();
//        
        
        
        
//        TestExceptions test = new TestExceptions();
////        test.
//        
//        msg();
//        SomeThirdClass someThird = new SomeThirdClass(); // default access modifier on Parent
//        
//        Parent parent = new Parent();
//        // ask from parent object to create a new instance of SomeOtherClass()
//        SomeOtherClass someOtherClass = parent.new SomeOtherClass();  // inner
        
        // qualified new of static class
//        SomeClass someClass2 = new SomeClass(); // static nested
//        SomeClass someClass3 = new SomeClass(); // static nested
//
//        someClass2.setCount(10);        
//        System.out.println("the count by 3 is: " + someClass3.getCount());
////        System.out.println("the count by 2 is: " + someClass2.getCount());
//
//        SomeClass someClass4 = new SomeClass(); // static nested
//        System.gc(); // garbage collector
    }
    

//    @Override
    public static void msg() { // throws IOException {
        System.out.println("main");
    }
    
}
