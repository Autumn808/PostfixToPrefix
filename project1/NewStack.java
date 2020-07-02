package project1;

//class defines a new stack implemented by an array
public class NewStack<T> implements StackInterface<T>
{
    private T[] stack = (T[]) new Object[200];
    private int top = 0;

    @Override
    public void push(T item) throws StackFull
    {
        if (top == stack.length)
            throw  new StackFull();
        stack[top++] = item;
    }

    @Override
    public T pop() throws StackEmpty
    {
        if (isEmpty())
            throw new StackEmpty();
        return stack[--top];
    }

    @Override
    public boolean isEmpty()
    {
        return top == 0;
    }
}
