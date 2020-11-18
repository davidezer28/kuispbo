/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Davjd
 */
public class MainMenuScreen extends JFrame implements ActionListener {
    JLabel label_awal;
    JButton btn_jurbaru, btn_semuajur, btn_mhsbaru, btn_mhsperjur;
    
    public MainMenuScreen(){
        JFrame frame = new JFrame("Halaman Awal");
        label_awal = new JLabel("Halaman Awal");
        label_awal.setForeground(Color.blue);
        label_awal.setFont(new Font("Serif", Font.BOLD, 20));
        
        btn_jurbaru = new JButton("Insert Jurusan Baru");
        btn_jurbaru.addActionListener(this);
        btn_semuajur = new JButton("Data Semua Jurusan");
        btn_semuajur.addActionListener(this);
        btn_mhsbaru = new JButton("Insert Data Mahasiswa Baru");
        btn_mhsbaru.addActionListener(this);
        btn_mhsperjur = new JButton("Data Mahasiswa Per Jurusan");
        btn_mhsperjur.addActionListener(this);
        
        label_awal.setBounds(150, 30, 400, 30);
        btn_jurbaru.setBounds(100, 70, 200, 30);
        btn_semuajur.setBounds(100, 110, 200, 30);
        btn_mhsbaru.setBounds(100, 150, 200, 30);
        btn_mhsperjur.setBounds(100, 190, 200, 30);
        
        frame.add(label_awal);
        frame.add(btn_jurbaru);
        frame.add(btn_semuajur);
        frame.add(btn_mhsbaru);
        frame.add(btn_mhsperjur);
        
        frame.setSize(700, 350);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        switch(command){
            case "InputJurusan":
                break;
        }
    }
    public static void main(String[] args) {
        new MainMenuScreen();
    }
    
}
