/*
Autumn Capasso
UMUC CMSC 350
May 27th, 2020
Project 1
 */
package project1;

//this class defines a stack made with a linked list and throws an exception if a pop is attempted when the stack is empty
public class LinkedStack<T> implements StackInterface<T>
{
    private static class Node<T>
    {
        T data;
        Node<T>previous;
    }
    private Node<T> top;

    //creates the push method
    @Override
    public void push(T item)
    {
        Node<T> newTop = new Node():
        newTop.data = item;
        newTop.previous = top;
        top = newTop;
    }

    //creates the pop method
    @Override
    public T pop() throws StackEmpty
    {
        if (top == null)
            throw new StackEmpty();
        T item = top.data;
        return item;
    }

    //when stack is empty
    @Override
    public boolean isEmpty() {
        return top == null;
    }
}
