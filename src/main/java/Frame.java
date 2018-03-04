package port;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Frame implements ActionListener {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JTextField text, info;
	private JButton button;
		
	public Frame() {
		frame = new JFrame("TEST");
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		label = new JLabel("Nume Vapor");
		label.setFont(new Font("", Font.BOLD, 20));
		label.setBounds(20, 20, 150, 50);
		
		text = new JTextField();
		text.setBounds(170, 35, 100, 25);
		info = new JTextField();
		info.setEditable(false);
		info.setBackground(Color.WHITE);
		info.setBounds(100, 100, 300, 100);
		
		button = new JButton("Cauta vapor");
		button.setFont(new Font("", Font.BOLD, 20));
		button.setBounds(300, 35, 150, 25);
		button.addActionListener(this);
		
		panel.add(label);
		panel.add(text);
		panel.add(info);
		panel.add(button);
		
		frame.add(panel);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			String numeVapor = text.getText();
			
			if(Test.port.search(numeVapor)) {
				info.setText(Test.port.info);
				panel.add(info);
				frame.add(panel);
			}
			else
				JOptionPane.showMessageDialog(null, "Vaporul cautat nu exista!", "ERROR", JOptionPane.ERROR_MESSAGE);
				
		}	
	}

}
