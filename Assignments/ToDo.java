import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class ToDo{
    public static final int ADD_ITEM = 1;
	public static final int REMOVE_ITEM = 2;
    public static final int MOVE_ITEM = 3;
	public static final int TERMINATE = 4;
    public static int mode = -1;
    public static List<String> todoList = new ArrayList<String>();
    //public todoList = new ArrayList<String>();
	
	public static void main(String[] args) {
		
        Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                int mode = scan.nextInt();
                if(mode == ADD_ITEM) {
					addItem();
                }
                else if(mode == REMOVE_ITEM) {
					removeItem();
                }
                else if (mode == MOVE_ITEM){
                    moveItem();
                }
                else if(mode == TERMINATE) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    continue;
                }
            } else {
                continue;
            }
        }
	}

	public static void addItem() {
		//TODO: Implement the add item function
        /*for (int i = 0; i<= todoList.size(); i++){
            System.out.println("- " + todoList.get(i));
            if (i == todoList.size()){
                System.out.println("What would you like to add");
                Scanner scan = new Scanner(System.in);
                String newItem = scan.nextLine();
                todoList.add(newItem);
            }

        }*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an item to add to your list.");
        String input = scan.nextLine();


	}

	public static void removeItem() {
		//TODO: Implement the remove item function
        Scanner scan;
        scan = new Scanner (System.in);
        while (true){
            System.out.println("enter index");
            if (scan.hasNextInt()){
                int idx = scan.nextInt();
                if (idx >0 && idx <= todoList.size()){
                    todoList.remove(idx);
                    break;
                }
            }
        }
	}

	public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) Enter Item\n"
            + "\t(2) Remove Item\n"
            + "\t(3) Move Item\n"
            + "\t(4) Quit\n"
        );
    }

    /* public static void printList(){
        System.out.println("");
        for (int i = 0; i <= todoList.size(); i++){
            Sysytem.out.println("[" + i + "]" );
            System.out.println("")
        }
    }*/

    public static void moveItem(){
        Scanner scan = new Scanner(System.in);
        int start = -1;
        int dest = -1;
        while(true) {
            System.out.print("Enter the index of the item you'd like to move: ");
            if(scan.hasNextInt()) { //is it a valid integer?
                start = scan.nextInt();
                if(start >= 0 && start < todoList.size()) { //is it a valid start index?
                    break;
                }
            }
        }

        while(true) {
            System.out.print("Enter the index of the desired destination: ");
            if(scan.hasNextInt()) {
                dest = scan.nextInt();
                if(dest >= 0 && dest <= todoList.size()) { //is it a valid destination index?
                    break;
                }
            }
        }
    }
}
