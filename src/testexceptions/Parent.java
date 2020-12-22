/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testexceptions;

/**
 *
 * @author George.Pasparakis
 */
public class Parent {
//    A. sub
//    B. inner
//    C. nested

    static int count = 0;

    // static nested
    public static final class SomeClass {

        public SomeClass() {
            count++;
            System.out.println("count: " + count);
        }
    }

    // inner
    public class SomeOtherClass {

    }

    public static void msg() {
        System.out.println("parent");
    }
}

// what on earth is this???
// nested?
class SomeThirdClass {

}
