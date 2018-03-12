import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Resort {
	
	private static int choice;
	public static Scanner scan = new Scanner(System.in);
	public static int choiceCounter = 0;
	public static ArrayList<String> types = new ArrayList<String>();
	public static ArrayList<MenuItems> men = new ArrayList<MenuItems>();
	
	public static void main(String[] args) {
		Skier skier = new Skier();
		Tickets tickets = new Tickets();
		Rental rental = new Rental();
		CheckIn checkin = new CheckIn();
		Hotel hotel = new Hotel(roomChooser(), "Suite");
		LeftSlope left = new LeftSlope("Danny", 25000, "Rocky Road", 7, "Intermediate", 4, "Powder");
		RightSlope right = new RightSlope("Lola", 25000, "Skier's Gulch", 8, "Advanced", 4, "Crud");
		double stayCost;
		double cost = 0;
		int foodNum = 0;
		double foodCost = 0;
		boolean yes = true;
		
		MenuItems menI = new MenuItems("Burger and Fries", 7.50);
		men.add(menI);
		MenuItems menII = new MenuItems("Chicken Tenders", 5.50);
		men.add(menII);
		MenuItems menIII = new MenuItems("Steak and Mashed Potatoes", 18.50);
		men.add(menIII);
		MenuItems menIV = new MenuItems("Caesar Salad", 6.50);
		men.add(menIV);
		MenuItems menV = new MenuItems("Bison Chili with Garlic Toast", 15.50);
		men.add(menV);
		
		System.out.println("It's time to create your Skier's profile.");
		System.out.println("What is your name?");
		skier.setName(scan.next());
		System.out.println("How old are you?");
		skier.setAge(scan.nextInt());
		System.out.println("Please choose a level. -Beginner -Intermediate -Expert");
		skier.setLevel(scan.next());
		
		
	while(choiceCounter <4) {
		choice  = welcomeHotel();
		if(choice == 1) {
			double rate = 250.00;
			checkin.setRate(rate);
			System.out.println("How many days are you staying?");
			int nites = scan.nextInt();
			checkin.setNumNights(nites);
			System.out.println("What is your credit card number?");
			String num = scan.next();
			checkin.setCreditcard(num);
			checkin.setName(skier.getName());
			System.out.println("How many guests are you bringing, including yourself?");
			int guest = scan.nextInt();
			checkin.setNumGuest(guest);
			System.out.println(skier.getName() + ", the cost of staying at the resort for all "
					+ "of your guests is $" + checkin.calcRate() + "0");
			checkin.creditClassify();
			choiceCounter++;
		} else if(choice == 2) {
			int days = 0;
			int age = 0;
			checkin.setName(skier.getName());
			System.out.println("How many guests will be skiing, including yourself?");
			int guest = scan.nextInt();
			checkin.setNumGuest(guest);
			System.out.println("It's time to purchase lift tickets!");
			System.out.println("How many days will you be skiing?");
			days = scan.nextInt();
			tickets.setDays(days);
			for(int i = 0; i<checkin.getNumGuest(); i++) {
				age = 0;
				System.out.print("Enter the age of Guest " + (i+1) + " ");
				age = scan.nextInt();
				cost = cost + (tickets.calcTicCost(age, 10, 15) * days);
			}
			System.out.println(checkin.getName() + ", the total cost of the tickets for all "
					+ "guests is $" + cost + "0");
			choiceCounter++;
		} else if(choice == 3) {
			double rec = 0;
			System.out.println("Welcome to the Mountain!");
			System.out.println("Since your level is " + skier.getLevel() + " we recommend the " + 
					((skier.getLevel().compareTo("Beginner") == 0 || skier.getLevel().compareTo("Intermediate") == 0)
					?"Left Slope.":"Right Slope."));
			System.out.print("If you would like to follow through with our recommendation, choose 1. If not, choose 2. ");
			rec = scan.nextInt();
			while(rec != 1 && rec !=2) {
				System.out.println("Error. Please enter choice 1 or 2.");
				rec = scan.nextInt();
			}
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
			} 
			
			choiceCounter++;
			
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
			System.out.println("Options: 10m and higher. ");
			radChoice = scan.nextInt();
			if(skier.getLevel().compareTo("Beginner") == 0 || skier.getLevel().compareTo("Intermediate") == 0) {
				types = rental.getSki(radChoice, left.getConditions(), skier.getLevel());
			} else {
				types = rental.getSki(radChoice, right.getConditions(), skier.getLevel());
			}
			
			System.out.println("Here are the types of skis you should choose from based on the radius, conditions, and level!");
			for(int i = 0; i< types.size(); i++) {
				if(i < (types.size() - 1) && (types.size() > 1))
					System.out.print(types.get(i) + ", ");
				else if(types.size() > 1 && i == (types.size() - 1)) {
					System.out.print("and " + types.get(i) + "\n");
				}
				else if(types.size() == 1) {
					System.out.print(types.get(i) + "\n");
				}
			}
 			choiceCounter++;
		}
	}
	
	System.out.println("Now that you are all set up, your room number is " + hotel.getRoom() + ", and it is a " + hotel.getRoomType());
	System.out.println("If you would like to order Room Service at any time from 7am - 11pm, dial 1. The menu items are as follows.");
	for(int k = 0; k<men.size(); k++) {
		System.out.println((k+1) + ". " + men.get(k).getFood() + ", $" + men.get(k).getCost() + "0");
	}
	
	int choiceFood = 0;
	while(yes) {
		System.out.println("What menu item would you like? Enter the number.");
		foodNum = scan.nextInt() - 1;
		foodCost = foodCost + men.get(foodNum).getCost();
		System.out.println("How many of this item did you order?");
		foodCost = foodCost * scan.nextInt();
		System.out.println("To continue logging orders, press 1. To end, press 2.");
		choiceFood = scan.nextInt();
		if(choiceFood == 1) 
			yes = true;
		else
			yes = false;
	}
	
	System.out.print("The total amout that you spent on food is $" + foodCost + "0");
	
	stayCost = cost + (checkin.getNumNights() * checkin.getRate()) + foodCost;
	System.out.println("The total cost of your stay, including hotel fees and lift tickets, is $" + stayCost + "0");

}
	
	public static int welcomeHotel() {
		if(choiceCounter == 0) {
			System.out.println("Welcome to the Powder Woods Ski Resort!");
			System.out.println("Please select an option number.");
		}
		else
			System.out.println("Please select another option number.");
		
		System.out.println("1. Check In");
		System.out.println("2. Purchase Lift Tickets");
		System.out.println("3. Go to Mountain");
		System.out.println("4. Rent Skis");
		
		return scan.nextInt();
	}
	
	public static String roomChooser() {
		int randInt = 0;
		String wordInt = "";
		String[] num1 = {"5", "4", "3", "2", "1"};
		Random rand = new Random();
		
		randInt = (rand.nextInt(29)+1);
		if(randInt < 10)
			wordInt = "0" + randInt;
		else
			wordInt = randInt + "";
		
		return (num1[rand.nextInt(4)] + wordInt);
		
	}

}
