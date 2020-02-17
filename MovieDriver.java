import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String ans;
		
		Movie a = new Movie();
				
		do{
			System.out.println("Please enter the title of a movie: ");
		
		
		String title = input.nextLine();
		a.setTitle(title);
		
		System.out.println("Please enter the rating of this movie: ");
		
		String rate = input.nextLine();
		a.setRating(rate);
		
		System.out.println("Please enter how many tickets were sold in theaters: ");
		
		int tickets = input.nextInt();
		a.setSoldTickets(tickets);
		
		System.out.println(a.toString());
		
		input.nextLine();
		
		System.out.println("Would you like to enter another movie? Y or N ");
		ans = input.nextLine();
		
		}while(ans.equals("Y")||ans.equals("y"));
		
	}

}
