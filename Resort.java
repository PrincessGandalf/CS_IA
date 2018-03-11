import java.util.ArrayList;
import java.util.Scanner;

public class Resort {
	
	private static int choice;
	public static Scanner scan = new Scanner(System.in);
	public static int choiceCounter = 0;
	public static ArrayList<String> types = new ArrayList<String>();
	
	public static void main(String[] args) {
		Tickets tickets = new Tickets();
		Rental rental = new Rental();
		CheckIn checkin = new CheckIn();
		Skier skier = new Skier();
		LeftSlope left = new LeftSlope("Danny", 25000, "Rocky Road", 7, "Intermediate", 4, "Powder");
		RightSlope right = new RightSlope("Lola", 25000, "Skier's Gulch", 8, "Advanced", 4, "Crud");
		
		System.out.println("It's time to create your Skier's profile.");
		System.out.println("What is your name?");
		skier.setName(scan.next());
		System.out.println("How old are you?");
		skier.setAge(scan.nextInt());
		System.out.println("Please choose a level. -Beginner -Intermediate -Expert");
		skier.setLevel(scan.next());
		
		
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
			double rec = 0;
			System.out.println("Welcome to the Mountain!");
			System.out.println("Since your level is " + skier.getLevel() + " we recommend the " + 
					((skier.getLevel().compareTo("Beginner") == 0 || skier.getLevel().compareTo("Intermediate") == 0)
					?" Left Slope.":" Right Slope."));
			System.out.print("If you would like to follow through with our recommendation, choose 1. If not, choose 2.");
			rec = scan.nextInt();
			if(rec == 1) {
				if(skier.getLevel().compareTo("Beginner") == 0 || skier.getLevel().compareTo("Intermediate") == 0)
					left.printAttributes();
				else 
					right.printAttributes();
			} else if (rec == 2) {
				if(skier.getLevel().compareTo("Beginner") == 0 || skier.getLevel().compareTo("Intermediate") == 0)
					left.printAttributes();
				else 
					right.printAttributes();
			} else {
				System.out.println("Error. Please enter choice 1 or 2.");
				rec = scan.nextInt();
			}
			
			
			
		} else if(choice == 4) {
			double radChoice = 0;
			System.out.println("It's ski rental time!");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Choose a ski radius.");
			System.out.println("Options: 10m and higher.");
			radChoice = scan.nextInt();
			if(skier.getLevel().compareTo("Beginner") == 0 || skier.getLevel().compareTo("Intermediate") == 0) {
				types = rental.getSki(radChoice, left.getConditions());
			} else {
				types = rental.getSki(radChoice, right.getConditions());
			}
			
			System.out.println("Here are the types of skiis you should choose from based on the radius, conditions, and level!");
			for(int i = 0; i< types.size(); i++) {
				if(i <= (types.size() - 1) && (types.size() > 1))
					System.out.print(types.get(i) + ", ");
				else if(types.size() > 1 && i == (types.size() - 1)) {
					System.out.print(" and " + types.get(i) + "\n");
				}
				else if(types.size() == 1) {
					System.out.print(types.get(i) + "\n");
				}
			}
 			choiceCounter = choiceCounter++;
		}
	}

}
	
	public static int welcomeHotel() {

		System.out.println("Welcome to the Powder Woods Ski Resort!");
		System.out.println("Please select an option number.");
		
		System.out.println("1. Check In");
		System.out.println("2. Purchase Lift Tickets");
		System.out.println("3. Go to Mountain");
		System.out.println("4. Rent Skis");
		
		return scan.nextInt();
	}

}
