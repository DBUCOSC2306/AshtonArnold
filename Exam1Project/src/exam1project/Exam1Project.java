/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam1project;
 
import jsjf.ArrayStack; 
import jsjf.LinkedStack;
import jsjf.exceptions.*;

/**
 *
 * @author jackjt
 */
public class Exam1Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        arrayStackTest();
        linkedStackTest();
    }
    private static void arrayStackTest()
    {
        ArrayStack<String> arrayStack = new ArrayStack<>();
        System.out.println("***ARRAY STACK***");
        
        
        arrayStack.push("12");
        arrayStack.push("45");
        arrayStack.push("897");
        
        System.out.println("This stack contains: " + arrayStack.toString());
        System.out.println("Popped: " + arrayStack.pop());
        System.out.println("Let's take a Peek: " + arrayStack.peek());
        

        System.out.println("Is this empty? " + arrayStack.isEmpty());
        System.out.println("This stack NOW contains: " + arrayStack.toString());
       
        arrayStack.pop();
        arrayStack.pop();
        
        try {
            arrayStack.pop();
        }
        catch(EmptyCollectionException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        

        System.out.println("Is this empty? " + arrayStack.isEmpty());
    }
    
    private static void linkedStackTest()
    {
        LinkedStack<String> linkedStack = new LinkedStack<>();
        System.out.println("***LINKED STACK***");
        
    
        linkedStack.push("78975");
        linkedStack.push("69");
        linkedStack.push("1001");
        
        System.out.println("This Stack contains:  " + linkedStack.toString());
        System.out.println("Popped: " + linkedStack.pop());
        System.out.println("Let's take a Peek: " + linkedStack.peek());
        

        System.out.println("Anything in there?  " + linkedStack.isEmpty());
        System.out.println("This Stack NOW contains:  " + linkedStack.toString());
        

        linkedStack.pop();
        linkedStack.pop();
        

        try {
            linkedStack.pop();
        }
        catch(EmptyCollectionException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        
        //Check that the stack is actually empty.
        System.out.println("Anything in there?  " + linkedStack.isEmpty());
}
}
