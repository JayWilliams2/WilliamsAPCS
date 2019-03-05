class IteratingData{
    public static void main(String args[]){
         /*int[] nums = new int[201];
         int j = -100;
         for (int i = 0; i<=200; i++){
             nums[i] = j++;
             System.out.println(nums[i]);
         }
         for (int k = 0; k <= 200; k++){
             System.out.println((int)Math.sqrt((int)Math.pow(nums[k],2)));
         }*/
         /*int[] numArr = new int[50];
         for (int l = 2; l <= 40; l++){
             numArr[0] = 0;
             numArr[1] = 1;
             numArr[l] = numArr[l-2] + numArr[l-1];
         }*/
         for (int value: odds){
             if (value % 2 == 0){

             }
             else {
                 System.out.println(value);
             }
         }
         
    }
    
}