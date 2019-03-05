class ArrayPrac{
    public static void main(String args[]){
       int[] numArray = {20, 3, 6, 10, 13, 25, 100, 6, 3, 20, 5102};

        System.out.println( numArray[3] ); //10

        //System.out.println( numArray[11] ); - 20

        System.out.println( numArray[1] );//3

        System.out.println( numArray[7] );//6

        System.out.println( numArray[8] );//3


        System.out.println(numArray[4]);
        System.out.println(numArray[1]);
        System.out.println(numArray[10]);
        System.out.println(numArray[5]);
        System.out.println(numArray[0]);

        int[] fibonacci = {1, 1, 2, 3, 0, 8, 13, 0, 34, 0};
        fibonacci[4] = fibonacci[3] + fibonacci[2];
        fibonacci[7] = fibonacci[6] + fibonacci[5];
        fibonacci[9] = fibonacci[8] + fibonacci[7];

    }
}