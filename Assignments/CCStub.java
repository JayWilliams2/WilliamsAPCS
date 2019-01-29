class CCStub {
	static Boolean cruiseControlSet = false;
	static int speed = 0;
	static final int MAX_SPEED = 45;
	static int warningSpeed = 30;
    static Boolean isGreaterThanMax = speed >= MAX_SPEED;

	public static void main(String[] args) {
        toggleCruiseControl();
        accelerate(10);
        accelerate(15);
        accelerate(25);
        accelerate(30);
        decelerate(40);
	}

	public static void toggleCruiseControl() {
        cruiseControlSet = !cruiseControlSet;
        if (cruiseControlSet){
            System.out.println("Cruise Contol Enabled");
        }
        else{
            System.out.println("Cruise Contol Disabled");
            speed = 0;
        }
	}

	public static void accelerate( int num) {
        // Add random speed increase
        num = (math.random()*(num-1))+1;
        if (cruiseControlSet && speed < MAX_SPEED){
            speed+=num;
            System.out.println("You have accelerated "+ num + "mph");
           //come back and check to see why it still accelerates past
            if (isGreaterThanMax){
                speed = MAX_SPEED;
            }
        }
        else{
            System.out.println("Max Speed Reached");
        }

        reportSpeed();
        if (exceedsWarningThreshold(speed)){
            alert(false);
        }

	}

	public  static void decelerate(int num2) {
        num2 = (math.random()*(num-1))+1;
        if (cruiseControlSet && speed <= MAX_SPEED){
            speed -= num2;
            if (speed <= 0){
                speed = 0;
            }
	    }
        reportSpeed();
        if (exceedsWarningThreshold(speed)){
            alert(true);
        }
    }

	public static void reportSpeed() {
        System.out.println("Your current Speed is: \t" + speed + "mph");

	}

	public static void alert(Boolean isDecelerating) {
        if (isDecelerating){
            System.out.println("Speed Still Exceeds Warning Threshold \t" + speed + "/45mph");
        }
        else{
            System.out.println("Speed No Longer Exceeds Warning Threshold");
        }
	}

	public static Boolean exceedsWarningThreshold(int speed) {
        return speed > warningSpeed;    
	}
}