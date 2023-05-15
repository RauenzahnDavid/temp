package frontend;

import java.awt.*;
import javax.swing.*;

import global.Storage;

import java.awt.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;



public class GameGUI extends JFrame implements ActionListener{

	private JButton Village, Expedition;
	private Menu menu;
	private Storage villageStorage, expeditionStorage;
	
	public GameGUI (String title){
		
		this.setTitle(title);
		
		Village = new JButton(" Village ");
	    Village.addActionListener(this);
	    Village.setBackground(Color.GRAY);
	    Expedition = new JButton(" Expedition ");
	    Expedition.addActionListener(this);
	    Expedition.setBackground(Color.GRAY);
		
	    JPanel buttons = new JPanel(new GridLayout(1, 2, 5, 0));
	    buttons.add(Village);
	    buttons.add(Expedition);
	    add(buttons, BorderLayout.PAGE_START);
	    
	    
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton buttonPress = (JButton)e.getSource();
		
		if (buttonPress == Village) {
			
			menu = new Menu("Village", villageStorage);
			add(menu, BorderLayout.CENTER);
			
		}
		if (buttonPress == Expedition) {
			
			menu = new Menu("Expedition", expeditionStorage);
			
		}
		
			
	}
	
}
	
