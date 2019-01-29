class DiceGame{

    public static void main(String[] args){
        int d4 = getD4();
        int d6 = getD6();
        int d20 = getD20();
        int n = 1; 
        char alpha = 'A';
        char omega = 'Z';
       // System.out.println("You Rolled:\t" + d4);
       // System.out.println("You Rolled:\t" + d6);
       // System.out.println("You Rolled:\t" + d20);
      /* while (n < 101){
           System.out.println("You Rolled:\t" + getD20() + " for your " + n + "th roll");
           //System.out.println(getD20());
           n++;
       }*/
       /* while (n < 101){
            System.out.println(n);
            n++;
        }*/
        /*while (n < 121){
            if (n % 3 == 0){
                System.out.println(n);
            }
            n++;
        }*/
        while (alpha <= omega){
            System.out.println(alpha);
            alpha++;
        }
        
    }

    public static int getD4(){
        int rD4 = (int)(Math.random()*4) + 1;
        return rD4;
    }

    public static int getD6(){
        int rD6 = (int)(Math.random()*6) + 1;
        return rD6;
    }

    public static int getD20(){
        int rD20 = (int)(Math.random()*20) + 1;
        return rD20;
    }
}