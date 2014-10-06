package Graph;

import java.awt.*; 
import javax.swing.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
public class UserInput {
	
	
	public void initUI(){
		createFrame();
	}
	
	private static void createFrame(){
		//1. Create the frame.
		String[] keys = { "C", "Db/C#", "D", "Eb", "E", "F", "Gb/F#", "G", "Ab", "A", "Bb", "B/Cb" };
		
		
		JFrame frame = new JFrame("Main Screen");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel textLabel = new JLabel("Enter Equation");
		JLabel keyLabel = new JLabel("Enter Key");
		
		
		JTextField equation = new JTextField(25);
		JComboBox keyList = new JComboBox(keys);
		
		
		JPanel panel1 = new JPanel (new FlowLayout(2));
		JPanel panel2 = new JPanel (new FlowLayout(2));
		JPanel panel3 = new JPanel (new FlowLayout(2));
		
		panel1.add(textLabel);
		panel1.add(equation);
		panel2.add(keyLabel);
		panel2.add(keyList);
		
		frame.add(panel1);
		frame.add(panel2);
		
		frame.setLayout(new FlowLayout());
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	

	
	
}
