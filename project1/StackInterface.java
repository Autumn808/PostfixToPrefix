/*
Autumn Capasso
UMUC CMSC 350
May 27th, 2020
Project 1
 */
package project1;
//This interface defines the three required operations of a LIFO stack

public interface StackInterface<T>
{
    void push (T item) throws StackFull;
    T pop() throws StackEmpty;
    boolean isEmpty();
}
