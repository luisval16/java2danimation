
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swingtimer;

import com.board.Board2;
import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class UtilityTimerExample extends JFrame{
    
    public UtilityTimerExample(){
    initUI();
    }
    
    private void initUI(){
    
    add(new Board2());
    
        setResizable(false);
        pack();
        
        setTitle("Star");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable(){
        @Override
        public void run(){
        JFrame ex = new UtilityTimerExample();
        ex.setVisible(true);
        }
        });
        
    }
}
