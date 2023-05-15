package frontend;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import global.Storage;

import java.util.ArrayList;

public class Menu extends JPanel implements ActionListener{

	private JTextField woodDisplay, stoneDisplay, clayDisplay, hideDisplay, leatherDisplay;
	
	ArrayList<JTextField> storageList = new ArrayList<>();
	
	GridBagLayout gridBag = new GridBagLayout();
	GridBagConstraints fakeBag = new GridBagConstraints();
	
	public Menu (String type, Storage storage) {
		
		woodDisplay = new JTextField();
		woodDisplay.setBackground(Color.WHITE);
		woodDisplay.setFont(new Font ("Monospaced", Font.BOLD, 16));
		woodDisplay.setEditable(false);
		woodDisplay.setHorizontalAlignment(JTextField.CENTER);
		
		stoneDisplay = new JTextField();
		clayDisplay = new JTextField();
		hideDisplay = new JTextField();
		leatherDisplay = new JTextField();
		
		woodDisplay.setText("placeholder");
		stoneDisplay.setText("placeholder");
		clayDisplay.setText("placeholder");
		hideDisplay.setText("placeholder");
		leatherDisplay.setText("placeholder");
		
		storageList.add(woodDisplay);
		storageList.add(stoneDisplay);
		storageList.add(clayDisplay);
		storageList.add(hideDisplay);
		storageList.add(leatherDisplay);
		
		setLayout(gridBag);
		fakeBag.fill = GridBagConstraints.BOTH;
		
		if (type == "Village") {
			
			this.add(woodDisplay, fakeBag);
			
		}
		if (type == "Expedition") {
			
		}
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		JButton buttonPress = (JButton)e.getSource();
		
	}

	
	
}
