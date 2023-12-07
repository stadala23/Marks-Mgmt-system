package marksmgmtcode;

/**
 * Main class for the Marks Management application. This class is the entry
 * point for the application, initializing the menu and handling any exceptions.
 */
public class App {
	public static void main(String[] args) {

		try {
			// Initialize and display the main menu of the application
			Menu marksManagementmenu = new Menu();
			marksManagementmenu.displayMenu();
		} catch (Exception e) {
			// General exception handling to catch unexpected runtime errors
			System.out.println("An exception occurred in the application. Details:");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}