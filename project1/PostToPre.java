/*
Autumn Capasso
UMUC CMSC 350
May 27th, 2020
Project 1
 */
package project1;

import java.util.*;

public class PostToPre
    //This class is the class that converts a equation from Postfix to Prefix
{
    private final LinkedStack<Integer> = new LinkedStack();

    public Integer evalPost(String expression) throws DivideByZero
    {
        String token;
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/()", true)
                while (tokenizer.hasMoreTokens())
                {
                    token = tokenizer.nextToken();
                    if(Character.isDigit(token.charAt(0)))
                        stack.push(Integer.parseInt(token));
                    else if (!token.equals(" "))
                        evaluate(stack, token);
                }
                return stack.pop();
    }

    private static void evaluate(LinkedStack<Integer>stack,String token)
    {
        int result = 0,right = stack.pop() left = stack.pop();
        char operation = token.charAt(0);

        //switch statement that helps evaluate for all the different operators
        switch (operation)
        {
            case '+':
                result = left + right;
                break;
            case '_':
                result = left - right;
                break;
            case '*':
                result = left * right;
                break;
            case '/':
                result = left / right;
                break;
            case '%':
                result = left % right;
                break;
        }
        stack.push(result);
    }
}
