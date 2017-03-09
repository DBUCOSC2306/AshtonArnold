package chapter6HWproject;
import jsjf.ArrayOrderedList;
import jsjf.ArrayUnorderedList;
import jsjf.LinkedOrderedList;
import jsjf.LinkedUnorderedList;
import jsjf.exceptions.*;
/**
 *
 * @author jackjt
 */
public class Chapter6HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
	  arrayOrderedList();
        arrayUnorderedList();        
        linkedOrderedList();        
        linkedUnorderedList();
    }
    
    private static void arrayOrderedList()
    {
        ArrayOrderedList<String> arrayOrderedList = new ArrayOrderedList<>();
        System.out.println("Lets test the Array Ordered List. ");
        
        //Test add()
        arrayOrderedList.add("1");
        arrayOrderedList.add("2");
        arrayOrderedList.add("3");
        
        //Test first() and last()
        System.out.println("The is the first: " + arrayOrderedList.first());
        System.out.println("This is the last: " + arrayOrderedList.last());
        
        //Test isEmpty() and toString()
        System.out.println("Is the array empty? " + arrayOrderedList.isEmpty());
        System.out.println("This is what is in the array right now:  " + arrayOrderedList.toString());
        
        //Test removeFirst(), removeLast(), and remove()
        System.out.println("removeFirst(): " + arrayOrderedList.removeFirst());
        System.out.println("removeLast(): " + arrayOrderedList.removeLast());
        System.out.println("Lets remove the second element: " + arrayOrderedList.remove("2"));
                
        //Attempt to remove while empty and handle the exception
        try {
            arrayOrderedList.removeLast();
        }
        catch(EmptyCollectionException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        //Check that the list is actually empty
        System.out.println("Is this array empty? " + arrayOrderedList.isEmpty());
    }
    
    private static void arrayUnorderedList()
    {
        ArrayUnorderedList<String> arrayUnorderedList = new ArrayUnorderedList<>();
        System.out.println("Lets test the Array Unordered List...");
        
        //Test addToFront(), addToRear(), and addAfter()
        arrayUnorderedList.addToFront("1");
        arrayUnorderedList.addToRear("3");
        arrayUnorderedList.addAfter("2", "1");
        
        //Test first() and last()
        System.out.println("First: " + arrayUnorderedList.first());
        System.out.println("Last: " + arrayUnorderedList.last());
        
        //Test isEmpty() and toString()
        System.out.println("Is the array empty? " + arrayUnorderedList.isEmpty());
        System.out.println("This is what is in the array right now: " + arrayUnorderedList.toString());
        
        //Test removeFirst(), removeLast(), and remove()
        System.out.println("removeFirst(): " + arrayUnorderedList.removeFirst());
        System.out.println("removeLast(): " + arrayUnorderedList.removeLast());
        System.out.println("Lets remove the second element: " + arrayUnorderedList.remove("2"));
        
        //Attempt to remove while empty and handle the exception
        try {
            arrayUnorderedList.removeLast();
        }
        catch(EmptyCollectionException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //Check that the list is actually empty
        System.out.println("Is this array empty? " + arrayUnorderedList.isEmpty());
    }
    
    private static void linkedOrderedList()
    {
        LinkedOrderedList<String> linkedOrderedList = new LinkedOrderedList<>();
        System.out.println("Lets test the Linked Ordered List ");
        
        //Test add()
        linkedOrderedList.add("1");
        linkedOrderedList.add("2");
        linkedOrderedList.add("3");
        
        //Test first() and last()
        System.out.println("first(): " + linkedOrderedList.first());
        System.out.println("last(): " + linkedOrderedList.last());
        
        //Test isEmpty() and toString()
        System.out.println("Is the array empty?" + linkedOrderedList.isEmpty());
        System.out.println("This is what is in the array right now: " + linkedOrderedList.toString());
        
        //Test removeFirst(), removeLast(), and remove()
        System.out.println("removeFirst(): " + linkedOrderedList.removeFirst());
        System.out.println("removeLast(): " + linkedOrderedList.removeLast());
        System.out.println("Lets remove the second element: " + linkedOrderedList.remove("2"));
        
        //Attempt to remove while empty and handle the exception
        try {
            linkedOrderedList.removeLast();
        }
        catch(EmptyCollectionException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //Check that the list is actually empty
        System.out.println("Is the array empty? " + linkedOrderedList.isEmpty());
    }
    
    private static void linkedUnorderedList()
    {
        LinkedUnorderedList<String> linkedUnorderedList = new LinkedUnorderedList<>();
        System.out.println("Lets test the Linked Unordered List");
        
        //Test add()
        linkedUnorderedList.addToFront("1");
        linkedUnorderedList.addToRear("3");
        linkedUnorderedList.addAfter("2", "1");
        
        //Test first() and last()
        System.out.println("first(): " + linkedUnorderedList.first());
        System.out.println("last(): " + linkedUnorderedList.last());
        
        //Test isEmpty() and toString()
        System.out.println("Is the array empty? " + linkedUnorderedList.isEmpty());
        System.out.println("This is what is in the array right now: " + linkedUnorderedList.toString());
        
        //Test removeFirst(), removeLast(), and remove()
        System.out.println("removeFirst(): " + linkedUnorderedList.removeFirst());
        System.out.println("removeLast(): " + linkedUnorderedList.removeLast());
        System.out.println("Lets remove the second element: " + linkedUnorderedList.remove("2"));
        
        //Attempt to remove while empty and handle the exception
        try {
            linkedUnorderedList.removeLast();
        }
        catch(EmptyCollectionException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        //Check that the list is actually empty
        System.out.println("Is the array empty? " + linkedUnorderedList.isEmpty());
    }
}

































