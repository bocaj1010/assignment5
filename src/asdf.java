

	
	import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


/**
 * This class is where the JPanel is created and manipulated.
 * @author Jacob
 *
 */
	public class asdf extends JFrame{
		
		
		private JLabel lblScore[];
		private JTextField txtScore[], txtWeight[];
		private JButton btnCalculate;
		private JPanel pnlButton, pnlScore;
		
		private final int SIZE = 4;
		
		
/**
* Setting the size, color and text for the first two Jtextfields.
* */
		public asdf() {
			pnlButton = new JPanel();
			pnlScore = new JPanel();

			lblScore = new JLabel[2];
			
			lblScore[0] = new JLabel();
			lblScore[1] = new JLabel();
			
			lblScore[0].setBackground(Color.MAGENTA);
			lblScore[0].setText("TestScore");
			lblScore[0].setBackground(Color.PINK);
			lblScore[1].setText("Weight");
			pnlScore.add(lblScore[0]);
			pnlScore.add(lblScore[1]);

			txtScore = new JTextField[SIZE];
			txtWeight = new JTextField[SIZE];
			
		
/**
 * Setting the txtscore, txtweight, backround color and field size for last 8 jtextfields.
 */
			for(int i=0; i<SIZE; i++) {
				txtScore[i] = new JTextField();
				txtScore[i].setBackground(Color.YELLOW);
				txtScore[i].setSize(12,50);
				pnlScore.add(txtScore[i]);
				
			
				
				
				
				txtWeight[i] = new JTextField();
				txtWeight[i].setBackground(Color.CYAN);
				txtWeight[i].setSize(12,50);
				pnlScore.add(txtWeight[i]);			
			}
			
			btnCalculate = new JButton("Calculate!");

			pnlScore.setBackground(Color.GREEN);
			pnlButton.setBackground(Color.ORANGE);
			
			GridLayout gLayout = new GridLayout(5,2);
			pnlScore.setLayout(gLayout);
			//add labels and text fields to the center of the frame
			
			
			add(pnlScore, BorderLayout.CENTER);
			
			//add calculate button to the bottom of the frame
			pnlButton.add(btnCalculate);
			add(pnlButton, BorderLayout.SOUTH);
			
			
			
			


			
			
			
			/**
			 * Giving the calculate button a function by dividing the txtscores by the txtweight and calculating the total weighted average.
			 */
			btnCalculate.addActionListener(new ActionListener() {

		
				@Override
				public void actionPerformed(ActionEvent e) {
					double result = 0;
					double weight = 0;
					double avg = 0;
					double totalAvg = 0;
					
					for(int i=0; i<SIZE; i++) {
						
						
					
					avg += Double.valueOf(txtScore[i].getText()) * Double.valueOf(txtWeight[i].getText());
					
					
					
				
						
					}
					totalAvg = avg/8;
					
					System.out.println(totalAvg);
				}
					
					
				

			});
			
			setTitle("Score Calculator");
			setVisible(true);
			setSize(500,500);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLocationRelativeTo(null);//Windows open in the center of the screen
		}
	}

