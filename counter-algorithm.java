import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import java.awt.Frame;
import java.awt.GridBagLayout;



public class QuantumOptics extends Frame {
	
	   public static int[] array;
	   public static String x;
	   public static int addcounter(int a) throws FileNotFoundException {
		   File f = new File("Arrivaltime_set.txt");
	       Scanner s = new Scanner(f);
	       int count = -1;
	       int[] array = new int[20000];
	       int i = 0;
	       int j = 0;
	     
	       for(i = 1; s.hasNextInt(); i++){      
	            array[i] = s.nextInt();     
	            
	            if ((array[i] - array[i-1])>=a && (array[i] - array[i-1])<=a+10 ) 
	            {
	            	 count++;

	        }
	       }
	        System.out.println(a + " " + count);
	        
	        Integer.toString(count);
	     
	        return count;
	      
	        
	   }
	   
	   
	   
	   public static void main(String[] args) throws IOException{
        
	   JTextField textfield0, textfield, textfield2, textfield3, textfield4;
	   BufferedImage img = ImageIO.read(new File("background.jpg"));
       JFrame frame = new JFrame("Testing");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setContentPane(new JLabel(new ImageIcon(img)));
       frame.setLayout(new GridBagLayout());

       frame.pack();
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
 
       JTextArea taText = new JTextArea();
       taText.setText("\t \n \n \n \n  ");
       taText.setOpaque(false);
       
       JTextArea taText2 = new JTextArea();
       taText2.setText("\t");
       taText2.setOpaque(false);
       frame.setTitle("Counter Photon Statistics");  
       JPanel panel = new JPanel();
       JButton close = new JButton("Close");
       JButton button = new JButton("Calculate");
       int a = 0;
       int b = 0;
     
       button.setPreferredSize(new Dimension(100, 35));
       panel.setPreferredSize(new Dimension(300, 150));
       
       
       textfield0 = new JTextField("",10);
       textfield = new JTextField("",10);
       textfield0 = new JTextField("",10);
       textfield2 = new JTextField("",10);
       textfield3 = new JTextField("",10);
       textfield4 = new JTextField("",10);
       
       JLabel label = new JLabel ("Click Counter", JLabel.CENTER);
   
    
       label.setForeground(Color.white);
       label.setFont(new Font(label.getFont().getName(), label.getFont().getStyle(), 30));
       
       textfield0.setHorizontalAlignment(JTextField.CENTER);
       textfield.setHorizontalAlignment(JTextField.CENTER);
       textfield2.setHorizontalAlignment(JTextField.CENTER);
       textfield3.setHorizontalAlignment(JTextField.CENTER);
       textfield4.setHorizontalAlignment(JTextField.CENTER);
       button.setHorizontalAlignment(JTextField.CENTER);

       textfield.setBorder(null);
       textfield2.setBorder(null);
       textfield3.setBorder(null);
       
       button.setFocusPainted(true);
       button.setContentAreaFilled(true);
      
       panel.add(label, BorderLayout.NORTH);
       panel.add(taText);
       panel.add(textfield);
       panel.add(textfield2);
       panel.add(button);
       panel.add(textfield3);
       panel.add(close);
     
       panel.setBackground(new Color(0,0,0,0));
       frame.setSize(400, 500);
      
       frame.add(panel);

        
        close.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
     		   
     	});
        
        button.addActionListener(new ActionListener(){
        	   public void actionPerformed(ActionEvent ae){
        		   try {
        			String m = textfield.getText();
        		    String n = textfield2.getText();
        		    
        		    
        		    int u = Integer.parseInt(m);
        		  
					addcounter(u);
//        		    }
        		    
					int f = addcounter(u);
					String text = Integer.toString(f);
					textfield3.setText(text);
				}	catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		   
        	   }
        	});

        }
		private static Container getContentPane() {
			// TODO Auto-generated method stub
			return null;
		}
		private static void setDefaultCloseOperation(int exitOnClose) {
			// TODO Auto-generated method stub
			
		}

}