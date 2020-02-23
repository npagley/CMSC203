import javax.swing.JOptionPane;

import java.text.DecimalFormat;
import java.util.Random;

public class ToyDriver {

	public static void main(String[] args) {
		
		String name, tname; //Child name and toy name variables
		int age;
		String ans1, ans2, ans3, ans4; //Allow variables for user input
		double total = 0.00; //Keep a running total of transaction cost
		
		JOptionPane.showMessageDialog(null, "Welcome to the Toy Company to choose gifts for young children!");
		
		Toy t = new Toy(); //declare new toy object
		
	do {	name = JOptionPane.showInputDialog("Enter the name of the child: "); //user enters child name
		
			t.setAge(Integer.parseInt(JOptionPane.showInputDialog("How old is the child? "))); //user enters child age
			
		
			tname = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book"); //user chooses toy type
			t.setToy(tname);
			
			while (t.getToy().contentEquals("")) //Loop validating toy name/type
			{
				JOptionPane.showMessageDialog(null, "Invalid Choice\nPlease Choose again");
				
				tname = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
				t.setToy(tname);				
			}
		
				if(t.ageOK() == false) //age-validating if-else statements
				{
					ans1 =	JOptionPane.showInputDialog("Toy is not age-approptiate\n Do you want to buy a different toy? Yes or No?");
		
					if(ans1.equalsIgnoreCase("Yes"))
					{
						tname = JOptionPane.showInputDialog("Choose a toy: a plushie, blocks, or a book");
						t.setToy(tname);
					}
					else
						t.setToy(tname);
				}
				else
				JOptionPane.showMessageDialog(null, "Good Choice!");
		
		t.setCost(tname); //sets cost with value of just the toy
			
			
		ans2 = JOptionPane.showInputDialog("Do you want a card with the gift? Yes or No"); //user chooses to add a card or not
			t.addCard(ans2);
		
		ans3 = JOptionPane.showInputDialog("Do you want a balloon with the gift? Yes or No"); //user chooses to add a balloon or not
			t.addBalloon(ans3);
				
		JOptionPane.showMessageDialog(null,"The gift for " + name + t); //Call ToStr method to display child name, age, toy type and cost
		
		total += t.getCost(); //Add single toy cost to running total
		
		ans4 = JOptionPane.showInputDialog("Do you want another toy? Yes or No"); //User chooses if they would like to purchase another toy
		
	}while (ans4.equalsIgnoreCase("yes"));
	
	Random rand = new Random(); //declare random number object
	int orderNum = rand.nextInt(100000); //generate random 5 digit number
	
	DecimalFormat dollar = new DecimalFormat("#,##0.00"); //Declare decimal format for total cost
	
	JOptionPane.showMessageDialog(null, "Total cost: $" + dollar.format(total) + "\nOrder number: " + orderNum + "\nProgrammer: Noah Pagley");
//Declare total cost of purchase, order number, and name of programmer
	}

}
