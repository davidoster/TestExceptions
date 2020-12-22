/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexceptions;

import testexceptions.Parent.SomeClass;
import testexceptions.Parent.SomeOtherClass;

/**
 *
 * @author George.Pasparakis
 */
public class TestExceptions { //extends Parent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestExceptions test = new TestExceptions();
//        test.
        
        msg();
        SomeThirdClass someThird = new SomeThirdClass(); // default access modifier on Parent
        
        Parent parent = new Parent();
        // ask from parent object to create a new instance of SomeOtherClass()
        SomeOtherClass someOtherClass = parent.new SomeOtherClass();  // inner
        
        // qualified new of static class
        SomeClass someClass2 = new SomeClass(); // static nested
        SomeClass someClass3 = new SomeClass(); // static nested
        SomeClass someClass4 = new SomeClass(); // static nested
    }
    

//    @Override
    public static void msg() { // throws IOException {
        System.out.println("main");
    }
    
}
