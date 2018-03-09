import java.util.Scanner;

public class Resort {
	
	private static int choice;
	public static Scanner scan = new Scanner(System.in);
	private int numSkiiers = 0;
	public static int choiceCounter = 0;
	
	public static void main(String[] args) {
		Tickets tickets = new Tickets();
		Rental rental = new Rental();
		CheckIn checkin = new CheckIn();
		Skier skiier = new Skier();
		
	while(choiceCounter <=4) {
		choice  = welcomeHotel();
		if(choice == 1) {
			double rate = 250.00;
			checkin.setRate(rate);
			System.out.println("How many nights are you staying?");
			int nites = scan.nextInt();
			checkin.setNumNights(nites);
			System.out.println("What is your credit card number?");
			String num = scan.next();
			checkin.setCreditcard(num);
			System.out.println("What is your name?");
			String name = scan.next();
			checkin.setName(name);
			System.out.println("How many guests are you bringing?");
			int guest = scan.nextInt();
			checkin.setNumGuest(guest);
			System.out.println(name + ", the cost of staying at the resort for all "
					+ "of your guests is $" + checkin.calcRate());
			checkin.creditClassify();
			choiceCounter = choiceCounter++;
		} else if(choice == 2) {
			double cost = 0;
			int days = 0;
			int age = 0;
			System.out.println("Enter your name.");
			String name = scan.next();
			checkin.setName(name);
			System.out.println("How many guests will be skiing?");
			int guest = scan.nextInt();
			checkin.setNumGuest(guest);
			System.out.println("It's time to purchase lift tickets!");
			System.out.println("How many days will you be skiing?");
			days = scan.nextInt();
			tickets.setDays(days);
			for(int i = 0; i<checkin.getNumGuest(); i++) {
				age = 0;
				System.out.print("Enter the age of Guest " + (i+1));
				age = scan.nextInt();
				cost = cost + (tickets.calcTicCost(age, 10, 15) * days);
			}
			System.out.println(name + ", the total cost of the tickets for all "
					+ "guests is $" + cost);
			choiceCounter = choiceCounter++;
		} else if(choice == 3) {
			
			choiceCounter = choiceCounter++;
		}
	}

}
	
	public static int welcomeHotel() {
		int choice  = 0;
		System.out.println("Welcome to the Powder Woods Ski Resort!");
		System.out.println("Please select an option number.");
		
		System.out.println("1. Check In");
		System.out.println("2. Purchase Lift Tickets");
		System.out.println("3. Rent Skis");
		System.out.println("3. Go to Mountain");
		
		return scan.nextInt();
	}

}
