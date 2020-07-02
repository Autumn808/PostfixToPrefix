/*
Autumn Capasso
UMUC CMSC 350
May 27th, 2020
Project 1
 */
package project1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Gui extends JFrame {
    //J frame
    static JFrame f = new JFrame("Expression Converter");


    //Text Feild
    private JTextField expressIn = new JTextField(20), expressOut = new JTextField(20);
    private JTextField results = new JTextField(20);

    //Buttons
    private final JButton preToPost = new JButton("Prefix to Postfix");
    private final JButton postToPre = new JButton("Postfix to Prefix");

    //evaluation methods
    private PostToPre postTopre = new PostToPre();
    private PreToPost preTopost = new PreToPost();

    private final ActionListener preToPost = event ->
    {
        Integer value = PreToPost.e
    }


}


//main class and action listeners
public static void main(String[] args)
        {
        //create a panel to add buttons and textfeild too
        JPanel p = new JPanel();

        //adds button and text feilds to panel
        p.add(preToPost);
        p.add(postToPre);

        //adds panel to the frame
        f.add(p);

        //setting size of frame
        f.setSize(300, 300);

        //show window
        f.show();
        }
        }


