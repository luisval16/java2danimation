/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swingtimer;

import com.board.Board3;
import java.awt.EventQueue;
import javax.swing.JFrame;
import static jdk.nashorn.internal.codegen.ObjectClassGenerator.pack;

/**
 *
 * @author dell
 */
public class ThreadAnimationExample extends JFrame{
    public ThreadAnimationExample() {

        initUI();
    }
    
    private void initUI() {
        
        add(new Board3());

        setResizable(false);
        pack();
        
        setTitle("Star");    
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {                
                JFrame ex = new ThreadAnimationExample();
                ex.setVisible(true);                
            }
        });
    }
}
