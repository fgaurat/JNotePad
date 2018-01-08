/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jnotepad;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

/**
 *
 * @author fgaurat
 */
public class NotePad extends JFrame{

    JTextArea area;
    JMenu mnuFile;
    JMenuItem open;
    JMenuBar bar;
    
    public NotePad() throws HeadlessException {
        super("Le titre");
           
        this.area = new JTextArea();
        this.mnuFile = new JMenu("File");
        this.open = new JMenuItem("Open");
        
        this.open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                int returnVal = chooser.showOpenDialog(NotePad.this);
            }
        });
        
        this.mnuFile.add(this.open);
        this.bar = new JMenuBar();        
        this.bar.add(mnuFile);
        
        setJMenuBar(bar);
        this.getContentPane().add(this.area);
        this.setBounds(0,0,1024,768);
        
        this.setVisible(true);
        
        
    }
    
    
    
    
}
