import java.util.Scanner;

class Plinko {
    public static final int SINGLE_DISC = 1;
    public static final int MULTI_DISC = 2;
    public static final int TERMINATE = 3;

    public static final int[] VALUES = {1, 3, 2, 0, 5, 0, 2, 3, 1};

    public static int mode = -1;
    public static int startingPosition = -1;
    public static int numDiscs = 1;
    public static int currrentPosition = startingPosition;

    public static void main(String[] args) {
        Scanner scan;
        while(true) {
            //Loop to select mode.
            //This loop is infinite until the user selects the "Quit" option (3)
            Boolean isMultiDisc = false;
            scan = new Scanner(System.in);
            printModeStatement();
            if(scan.hasNextInt()) {
                mode = scan.nextInt();
                if(mode == SINGLE_DISC) {
                    isMultiDisc = false;
                }
                else if(mode == MULTI_DISC) {
                    isMultiDisc = true;
                }
                else if(mode == TERMINATE) {
                    System.out.println("Goodbye");
                    break;
                } else {
                    continue;
                }
            }

            collectSettings(isMultiDisc);
            runPlinko(isMultiDisc);
        }
    }

    public static void runPlinko(Boolean isMultiDisc) {
        for (int n = 1; n <= 6; n++){
            if (!isMultiDisc){
                //printEvenRow(startingPosition);
                for (int k = 1; k <= 1; k++){
                    if (startingPosition == 0){
                        startingPosition++;
                    }
                    else if (startingPosition == 8){
                        startingPosition--;
                    }
                
                
                    if((int)(Math.random()*2) == 0){
                        startingPosition--;
                    }
                    else{
                        startingPosition++;
                    }
                    printEvenRow(startingPosition);
                }
                 for (int k = 1; k <= 1; k++){
                    if (startingPosition == 0){
                        startingPosition++;
                    }
                    else if (startingPosition == 8){
                     startingPosition--;
                    }
                
                
                    if((int)(Math.random()*2) == 0){
                        startingPosition--;
                    }
                    else{
                        startingPosition++;
                    }
                    printOddRow(startingPosition);
                }


               /* if (!isEven(startingPosition)){
                    printOddRow(startingPosition);
                }  
                else if (isEven(startingPosition)){
                    printEvenRow(startingPosition);
                }*/              
            }
            
            

        }
        if (isMultiDisc){
            int[] discArr = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
            for (int y = 1; y<=numDiscs; y++){
                for (int k = 1; k <= 1; k++){
                    if (startingPosition == 0){
                        startingPosition++;
                    }
                    else if (startingPosition == 8){
                        startingPosition--;
                    }
                    
                    
                    if((int)(Math.random()*2) == 0){
                        startingPosition--;
                    }
                    else{
                        startingPosition++;
                    }
                }
                for (int k = 1; k <= 1; k++){
                    if (startingPosition == 0){
                        startingPosition++;
                    }
                    else if (startingPosition == 8){
                        startingPosition--;
                    }
                    
                    
                    if((int)(Math.random()*2) == 0){
                        startingPosition--;
                    }
                    else{
                        startingPosition++;
                    }
                }
                discArr[startingPosition]++;
            }
            System.out.print("The number of discs in slot 0:");
            System.out.println(discArr[0]);
            System.out.print("The number of discs in slot 1:");
            System.out.println(discArr[1]);
            System.out.print("The number of discs in slot 2:");
            System.out.println(discArr[2]);
            System.out.print("The number of discs in slot 3:");
            System.out.println(discArr[3]);
            System.out.print("The number of discs in slot 4:");
            System.out.println(discArr[4]);
            System.out.print("The number of discs in slot 5:");
            System.out.println(discArr[5]);
            System.out.print("The number of discs in slot 6:");
            System.out.println(discArr[6]);
            System.out.print("The number of discs in slot 7:");
            System.out.println(discArr[7]);
            System.out.print("The number of discs in slot 8:");
            System.out.println(discArr[8]);
            System.out.println("Stop");    
        
        }

    }

    public static void printOddRow(int discPosition) {
        for(int i = 0; i <= 16; i++) {
            if(discPosition == i) {
                System.out.print("O");
            }
            else if(isEven(i)) {
                System.out.print(".");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.print("\n");
    }

    

    public static void printEvenRow(int discPosition) {
        //Print the visualization of an even numbered row with the disc in the provided position.
        for(int i = 0; i <= 16; i++) {
            if(discPosition == i) {
                System.out.print("O");
            }
            else if(isEven(i)) {
                System.out.print(" ");
            }
            else {
                System.out.print(".");
            }
        }
        System.out.print("\n");
    }



    public static void collectSettings(Boolean isMultiDisc) {
        Scanner scan;
        Boolean isValidInput = false;
        while(!isValidInput) {
            scan = new Scanner(System.in);
            System.out.print("Pick a slot to drop the disc(s) (0-8): ");
            if(scan.hasNextInt()){
                startingPosition = scan.nextInt() * 2;
                if(0 <= startingPosition && startingPosition <= 16) {
                    isValidInput = true;
                }
            }
        }

        //How many discs will be dropped?
        isValidInput = false;
        if(isMultiDisc) {
            while(!isValidInput) {
                scan = new Scanner(System.in);
                System.out.print("Enter # of discs to drop: ");
                if(scan.hasNextInt()){
                    numDiscs = scan.nextInt();
                    if(numDiscs > 0) {
                        isValidInput = true;
                    }
                }
            }
        }
    }

    public static Boolean isEven(int x) {
        return x % 2 == 0;
    }

    public static void printModeStatement() {
        System.out.print(
            "Select a mode:\n"
            + "\t(1) Single disc\n"
            + "\t(2) Multiple discs\n"
            + "\t(3) Quit\n"
        );
    }
}