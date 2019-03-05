class Powers {
    public static final int n = 32;
    public static int base = 2;

    public static void main(String[] args) {
        for(int i = 0; i <= n; i++) {
            power(base);
            base+=2;
        }
    }

    public static void power(int num) {
        if (num % 2 == 0){
            num*=2;
            System.out.println(num);
        }
    }
}