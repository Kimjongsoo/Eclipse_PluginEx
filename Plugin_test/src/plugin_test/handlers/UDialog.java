package plugin_test.handlers;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UDialog extends JFrame{
	public UDialog() {
		setTitle("Plugin Test");
		setSize(550,400);
		setVisible(true);
	}
	public void setFrame() {
		Container c = getContentPane();
		JPanel pn = new JPanel();
		pn.setBackground(Color.LIGHT_GRAY);
		JButton inputBtn = new JButton("Input Name");
		JTextField tf = new JTextField(10);
		JButton confirmBtn = new JButton("Confirm");
		JButton messageBtn = new JButton("Message");
		pn.add(inputBtn);
		pn.add(confirmBtn);
		pn.add(messageBtn);
		pn.add(tf);
		c.add(pn, BorderLayout.NORTH);
		setVisible(true);
//		inputBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			String name = 
//					JOptionPane.showInputDialog("�̸��� �Է��ϼ���.");
//			if(name != null)
//				tf.setText(name);
//			}
//		});
//		
//		confirmBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//			int result = JOptionPane.showConfirmDialog(null, 
//					"����� ���Դϱ�?", "Confirm", 
//					JOptionPane.YES_NO_OPTION);
//			if(result == JOptionPane.CLOSED_OPTION)
//				tf.setText("Just Closed without Selection");
//			else if(result == JOptionPane.YES_OPTION)
//				tf.setText("Yes");
//			else
//				tf.setText("No");
//			}
//		});
//		messageBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(null, 
//						"�����ϼ���", "Message", 
//						JOptionPane.ERROR_MESSAGE); 
//						}
//					});
//				}
	}
	
}