package project1;

import java.util.StringTokenizer;

public class PreToPost
{
    private final LinkedStack<Integer> stack = new LinkedStacK();

    public Integer evaluateExpression(String expression) throws DivideByZero
    {
        //tokenizing the string
        String token;
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/()",true);
    }
}
