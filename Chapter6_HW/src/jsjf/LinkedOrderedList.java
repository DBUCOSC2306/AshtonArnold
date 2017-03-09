package jsjf;

import jsjf.exceptions.*;

/**
 * LinkedOrderedList represents a singly linked implementation of an 
 * ordered list.
 *
 * @author Lewis and Chase
 * @version 4.0
 */
public class LinkedOrderedList<T> extends LinkedList<T> 
         implements OrderedListADT<T>
{
    /**
     * Creates an empty list.
     */
    public LinkedOrderedList()
    {
        super();
    }

    /**
     * Adds the specified element to this list at the location determined by
	 * the element's natural ordering. Throws a NonComparableElementException 
	 * if the element is not comparable.
     *
     * @param element the element to be added to this list
     * @throws NonComparableElementException if the element is not comparable
	 */
    public void add(T element)
    {
        count++;
        
        if (isEmpty())
        {
            head = tail = new LinearNode<T>(element);
            return;
        }
        
        Comparable<T> temp = (Comparable<T>)element;
        LinearNode<T> prev = null;
        LinearNode<T> cursor = head;
        
        while (cursor != null && temp.compareTo(cursor.getElement()) > 0)
        {
            prev = cursor;
            cursor = cursor.getNext();
        }
        
        LinearNode<T> newNode = new LinearNode<T>(element);
        
        if (prev == null)
        {
            newNode.setNext(head);
            head = newNode;
            tail = head.getNext();
            return;
        }
        
        prev.setNext(newNode);
        newNode.setNext(cursor);
    }
}
