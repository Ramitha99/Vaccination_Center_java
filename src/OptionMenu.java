import java.util.Scanner;


public class OptionMenu extends Booths{
	
	 static Scanner menuInput = new Scanner (System.in);
	
	public void greeting() {
		dash();
		System.out.println("Welcome to the vaccination program");
		dash();
		System.out.println();
	}

	
	public void getOption() {
		getOptionMenu();
	}
	
	
	public void getOptionMenu() {
		dash();
		
		System.out.println("Please read the option menu");
		System.out.println();
		System.out.println("Type 000 - booth list");
		System.out.println("Type 100 or VVB - View all booths are occupied or not");
		System.out.println("Type 101 or VEB - View all Empty booths");
		System.out.println("Type 102 or APB - Add Patient to a booth");
		System.out.println("Type 103 or RPB - Remove Patient from a booth");
		System.out.println("Type 104 or VPS - View Patiens Sorted in alphebetical order");
		System.out.println("Type 105 or SPD - Store program data into file");
		System.out.println("Type 106 or LPD - Load program data from file");
		System.out.println("Type 107 or VRV - View remaining vaccinations");
		System.out.println("Type 108 or AVS - Add vaccination to the stock");
		System.out.println("Type 999 or EXT - Exit");
		System.out.print("Choice : ");
		System.out.println();
		dash();
		
		selection = menuInput.nextLine();
		
		switch (selection) {
		case "000":
//			initialise(BIVC); 
			System.out.println();
			System.out.println("This is the list of all booths");
			dash();
			System.out.println("Booth 1");
			System.out.println("Booth 2");
			System.out.println("Booth 3");
			System.out.println("Booth 4");
			System.out.println("Booth 5");
			System.out.println("Booth 6");
//			
			allBooths();
		
		
		case "100":
		case "VVB":
			System.out.println();
			viewBooths();
			break;
			
		case "101":
		case "VEB":
			System.out.println();
			viewEmptyBooths();
			break;
			
		case "102":
		case "APB":
			System.out.println();
			addPatient();
			break;
			
		case "103":
		case "RPB":
			System.out.println();
			removePatient();
			break;
			
		case "104":
		case "VPS":
			System.out.println();
			viewPatient();
			break;
			
		case "105":
		case "SPD":
			System.out.println();
			storeProgram();
			break;
			
		case "106":
		case "LPD":
			System.out.println();
			loadProgram();
			break;
			
		case "107":
		case "VRV":
			System.out.println();
			viewVaccination();
			break;
			
		case "108":
		case "AVS":
			System.out.println();
			addVaccination();
			break;
			
		case "999":
		case "EXT":
			System.out.println();
			dash();
			System.out.println("Than you for using VC program. bye!");
			System.exit(0);
			break;
			
		default:
			System.out.println();
			System.out.println("\n" + "Invalid Choice." + "\n");
			getOptionMenu();
				
			
		
		}
		
		
	}
	
	 static String selection;
}


