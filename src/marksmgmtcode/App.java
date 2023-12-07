package marksmgmtcode;

public class App {
	public static void main(String[] args) {
		
		try {
			
		
		Menu marksManagementmenu = new Menu();
		marksManagementmenu.displayMenu();
		}
		catch(Exception e) {
			System.out.println("There seems to be Some Exception Occurred in the code."
					+ " The Exception Message and Stack Trace is as Follows. Pls Check");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}