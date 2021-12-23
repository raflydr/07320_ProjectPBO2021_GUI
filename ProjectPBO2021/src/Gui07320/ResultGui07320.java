/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui07320;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import Controller07320.AllObjectController07320;

public class ResultGui07320 {
    JFrame result;
    JButton back;
    
    public ResultGui07320(){
        result = new JFrame("GUI");
        result.setSize(1000, 700);
        result.getContentPane().setBackground(Color.CYAN);
        
        JLabel judul = new JLabel("Hasil Klaster");
        judul.setBounds(300, 30, 400, 50);
        judul.setFont(new Font ("Times New Roman", Font.BOLD, 40));
        result.add(judul);
        
        JTextArea area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);
        scroll.setBounds(30, 150, 900, 400);
        result.add(scroll);
        
        area.setText(AllObjectController07320.recordcontroller.ViewDataRecord()+AllObjectController07320.clustercontroller.ViewDataCluster());
        
        back = new JButton ("Back");
        back.setBounds(30, 600, 80, 30);
        back.setBackground(Color.red);
        result.add(back);
        
        result.setLocationRelativeTo(null);
        result.setLayout(null);
        result.setVisible(true);
        
        result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        back.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed (ActionEvent ae){
                RecordGui07320 recordgui = new RecordGui07320();
                result.dispose();
            }
        });
        
    }
}
