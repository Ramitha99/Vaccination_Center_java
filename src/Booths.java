import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 

public class Booths {
	static Scanner menuInput = new Scanner (System.in);
	
	static OptionMenu optionMenu = new OptionMenu();
	
	
	static Scanner input = new Scanner(System.in);
	static String patientName ;
	static int boothNum = 1;
	static int stock = 150;
	static String[] BIVC = new String[7];
	static Booth booth = new Booth();
	static ArrayList<String> patients = new ArrayList<String>();
	
	
	
	
	/*
	 * -------------------------------------------- view all booths
	 */
	
	

	
	static void allBooths(){

		
		
		initialise(BIVC); 

			for (int x = 1; x < 7; x++ ) {
			
//				if (BIVC[x].equals("none"))System.out.print("");
////				else {
////					System.out.println("booth " + x + " occupied by " + BIVC[x]);
////				}
//				dash();
//			
//			} 
			
			

			System.out.println("type 1 - Main Menu");
			System.out.println("type 2 - Exit");
			System.out.println();
			dash();
			answer = menuInput.nextInt();
			
			if (answer == 1) {
				optionMenu.getOptionMenu();
			} else if (answer == 2) {
				System.out.println("Thank you for using this program");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.exit(0);
			} 
			else {
				System.out.println("wrong input");
				bye();
			}
			}
		
			}
	
	
	
	/*
	 * ----------------------------------------------- view booths
	 */
	
		
	
	static void viewBooths(){
		
		dash(); 
			
			for (int x = 1; x < 7; x++ ) {
//				if (BIVC[x].equals("none")) {
//					System.out.println("booth " + x + " is empty");
//				} else {
					System.out.println("booth " + x + " occupied by " + BIVC[x]);
//				}
			}
			

			System.out.println();
			
			System.out.println("type 1 - Main Menu");
			System.out.println("type 2 - Exit");
			answer = menuInput.nextInt();
			
			if (answer == 1) {
				optionMenu.getOptionMenu();
			} else if (answer == 2) {
				System.out.println("Thank you for using this program");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.exit(0);
			} 

			else {
				System.out.println("wrong input");
				bye();
			}
			
		
			}
	

	
	/*
	 * ----------------------------------------------- view empty booths
	 */
	
		
	
	static void viewEmptyBooths(){
		
		dash(); 
			
			for (int boothNum = 1; boothNum < 7; boothNum++ ) {
				if (BIVC[boothNum]== null) {
					System.out.println("booth " + boothNum + " is empty");
				}
			}
			

			System.out.println();
			
			System.out.println("type 1 - Main Menu");
			System.out.println("type 2 - Exit");
			answer = menuInput.nextInt();
			
			if (answer == 1) {
				optionMenu.getOptionMenu();
			} else if (answer == 2) {
				System.out.println("Thank you for using this program");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.exit(0);
			} 

			else {
				System.out.println("wrong input");
				bye();
			}
			
		
			}
			
			
	
	
	
	
	/*
	 * --------------------------add patients----------------------
	 */
	
	
	
	
	static void addPatient() {
		dash();
		
		Patient patient1 = new Patient();
		System.out.println("Enter patient First name ");
		patientName = input.next();
		patient1.setFirstName(patientName);
		
		System.out.println("Enter patient Last name");
		String surname = input.next();
		patient1.setLastName(surname);    
		
		System.out.println("Enter patient Age");
		int age = input.nextInt();
		patient1.setAge(age); 
		
		System.out.println("Enter patient City");
		String city = input.next();
		patient1.setCity(city); 
		
		System.out.println("Enter patient Nic");
		int nic = input.nextInt();
		patient1.setNic(nic); 
		
		System.out.println("Vaccination request ('AstraZeneca', 'Sinopharm', 'Pfizer')");
		String prefVaccination = input.next();
		patient1.setPrefVaccination(prefVaccination);
		
		if ("AstraZeneca".equalsIgnoreCase(prefVaccination)) {
			System.out.println("adding....");
				if (BIVC[1] == null) {
					boothNum = 1;
					BIVC[boothNum] = patientName ;
					patients.add(patientName);
				} else if (BIVC[1] != null && BIVC[2] == null) {
					boothNum = 2;
					BIVC[boothNum] = patientName ;
					patients.add(patientName);
				} else {
				 System.out.println("All booths are full. please wait");
				}
			
			
			
//			if (booth.getBooth()[0].getPatient().getFirstName() == null) {
//				booth.getBooth()[0].setPatient(patient1);
//			}
//			else if (booth.getBooth()[1].getPatient().getFirstName() == null) {
//				booth.getBooth()[1].setPatient(patient1);
//			} else {
//				System.out.println("full");
//			}
		}
		
		

		else if ("Sinopharm".equalsIgnoreCase(prefVaccination)) {
			System.out.println("adding...");
			
			if (BIVC[3] == null) {
				boothNum = 3;
				BIVC[boothNum] = patientName ;
				patients.add(patientName);
			} else if (BIVC[3] != null && BIVC[4] == null) {
				boothNum = 4;
				BIVC[boothNum] = patientName ;
				patients.add(patientName);
			} else {
			 System.out.println("All booths are full. please wait");
			}
			
//			if (booth.getBooth()[2].getPatient().getFirstName() == null) {
//				booth.getBooth()[2].setPatient(patient1);
//			}
//			else if (booth.getBooth()[3].getPatient().getFirstName() == null) {
//				booth.getBooth()[3].setPatient(patient1);
//			} else {
//				System.out.println("full");
//			}
		}
		
		
		

		else if ("Pfizer".equalsIgnoreCase(prefVaccination)) {
			System.out.println("adding...");
			
			if (BIVC[5] == null) {
				boothNum = 5;
				BIVC[boothNum] = patientName ;
				patients.add(patientName);
			} else if (BIVC[5] != null && BIVC[6] == null) {
				boothNum = 6;
				BIVC[boothNum] = patientName ;
				patients.add(patientName);
			} else {
			 System.out.println("All booths are full. please wait");
			}
			
			
//			if (booth.getBooth()[4].getPatient().getFirstName() == null) {
//				booth.getBooth()[4].setPatient(patient1);
//			}
//			else if (booth.getBooth()[5].getPatient().getFirstName() == null) {
//				booth.getBooth()[5].setPatient(patient1);
//			} else {
//				System.out.println("full");
//			}
		}
		
		patients.add(patientName);
		stock--;
		System.out.println("stock - " + stock);
		if(stock<20) {
			System.out.println("Our Stock is low ");
		}
		dash();
		
		System.out.println("type 1 - Main Menu");
		System.out.println("type 2 - Add Another Patient");
		System.out.println("type 3 - Exit");
		answer = menuInput.nextInt();
		
		if (answer == 1) {
			optionMenu.getOptionMenu();
		} else if (answer == 3) {
			System.out.println("Thank you for using this program");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.exit(0);
		} 
		else if (answer == 2) {
			addPatient();
		}
		else {
			System.out.println("wrong input");
			bye();
		}
	}
	
	
	
	
	
	
	/*
	 * --------------------------- Remove patients--------------
	 */
	
	
	
	
	static void removePatient() {
		
		dash();
		System.out.print("Enter booth number (1-6) to Remove the patient : " );
		boothNum = input.nextInt();
		BIVC[boothNum] = "none" ;
		System.out.println("Patient has been removed");
		optionMenu.getOptionMenu();
		
	}
	
	
	
	
	/*
	 * ----------------------------view patients in alphabetical order
	 */
	
	
	
	
	
	static void viewPatient() {
		dash();
		Collections.sort(patients, Collections.reverseOrder());
		  
        // print the sorted list
        System.out.println("Patients in alphabetical order  :\n" + patients);
        
        System.out.println();
        bye();
	}
	
	
	
	/*
	 * -----------------------save data---------------
	 */
	
	
	
	static void storeProgram() {
		try {
			FileWriter p_data = new FileWriter ("vc_program_data.txt");
			p_data.write("Patient details");
			p_data.append("patients details " + patients);
			p_data.close();
			System.out.println("Save completed");
			
		} catch (IOException e) {
			System.out.println("oops.... Somthing is wrong  :( ");
			e.printStackTrace();
		}
		
		System.out.println("successful");
		bye();
		
	}
	
	
	
	/*
	 * ------------------------Load data------------
	 */
	static void loadProgram() {
		try {
			FileReader reader = new FileReader ("vc_program_data.txt");
			int data = reader.read();
			while (data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("successful");
		bye();
	}
	
	
	/*
	 * ------------------ view vaccinations----------
	 */
	
	static void viewVaccination() {
		dash();
		System.out.println("Vaccinations in stock : " + stock);
		System.out.println();
		bye();
	}
	
	
	
	
	/*
	 * ------------------- add vaccination to the stock---------
	 */
	static void addVaccination() {
		dash();
		System.out.print("How many vaccinations do you want to add : ");
		int vac = input.nextInt();
		stock = stock + vac;
		dash();
		System.out.println("Vaccinations in stock : " + stock);
		System.out.println();
		bye();
	}
	
		
	
	
	/*
	 * -----------------------------
	 */
	
	
 
	protected static void initialise( String hotelRef[] ) {
		for (int x = 1; x < 7; x++ ) hotelRef[x] = "none";
	}
	
	
	
	
	
	
	
	
	
/*
 * ------------------------------- if user add wrong input----------------	
 */
	
	

	static void bye() {
		dash();
		
		System.out.println("type 1 - Main Menu");
		System.out.println("type 2 - Exit");
		answer = menuInput.nextInt();
		
		if (answer == 1) {
			optionMenu.getOptionMenu();
		} else if (answer == 2) {
			System.out.println("Thank you for using this program");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.exit(0);
		}else {
			System.out.println("wrong input");
			bye();
		}
		
		}
	
		
	
	/*
	 * --------------------------dashes--------------
	 */
	
	static void dash() {
		System.out.println("----------------------------------------"
            + "----------------------------------------"
            + "----------------------------------------");
	}
		

		
		
	static int answer;	
	
}
	


