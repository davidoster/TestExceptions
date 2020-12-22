/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author George.Pasparakis
 */
public class NoInstance extends Exception {

    public NoInstance() {
        System.out.println("Possible No Instance error");
    }

    public NoInstance(String string) {
        super(string);
        System.out.println(string);
    }
    
}
