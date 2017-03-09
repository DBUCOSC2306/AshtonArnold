package chapter5HWproject;
import jsjf.CircularArrayQueue;
import jsjf.LinkedQueue;
import jsjf.exceptions.*;
/**
 *
 * @author jackjt
 */
public class Chapter5HW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CircularArrayQueue C1 = new CircularArrayQueue(5);
        LinkedQueue L1 = new LinkedQueue();
        
     System.out.println("Is this queue empty? " + C1.isEmpty());
     //Add elements
     C1.enqueue(87);
     C1.enqueue(88);
     C1.enqueue(89);
     C1.enqueue(90);
     C1.enqueue(91);
     
     //test size
     int C1Size = C1.size();
     System.out.println("There is " + C1Size + " elements currently in the queue.");
     System.out.println("This is the queue current standing: " + C1.toString());
     System.out.println("Now lets delete some...");
     
     C1.dequeue();
     C1.dequeue();
     C1.dequeue();
     System.out.println("Is this queue empty? " + C1.isEmpty());
     System.out.println("This is the new front: " + C1.first()); 
     //System.out.println("This is the array current standing: " + C1.toString());
     System.out.println("Now lets delete the rest...");
     C1.dequeue();
     C1.dequeue();
     System.out.println("Is this array empty? " + C1.isEmpty());
     
     //C1.dequeue(); //test dequeue() exception
     System.out.println("We're going to test the first element exception " );
     C1.first(); //test first() exception
     
     
     System.out.println("\nNow lets test the LinkedQueue!");
     System.out.println("Lets add some elements to this queue ");
     L1.enqueue(8);
     L1.enqueue(9);
     L1.enqueue(10);
     L1.enqueue(11);
     L1.enqueue(12);
     L1.enqueue(13);
     
     int L1Size = L1.size();
     System.out.println("There is " + L1Size + " elements currently in the queue.");
     System.out.println("This is the queue current standing: " + L1.toString());
     System.out.println("Now lets delete some...");
     
     L1.dequeue();
     L1.dequeue();
     L1.dequeue();
     System.out.println("There is " + L1Size + " elements currently in the queue.");
     System.out.println("This is the queue current standing: " + L1.toString());
     System.out.println("Now lets delete the rest...");
     L1.dequeue();
     L1.dequeue();
     L1.dequeue();
     System.out.println("Is the queue empty? " + L1.isEmpty());
     //L1.dequeue(); //test dequeue() exception
     System.out.println("We're going to test the first element exception " );
     L1.first();
     

        
    }
}

































