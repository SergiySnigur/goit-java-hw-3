  class ATM {
    public int countBanknotes(int sum) {

        int[] money = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int result = 0;
        int index = 0;
        if(sum > 0) {

            while (index < money.length) {
            int note = money[index++];
                while (sum - note >=0){
                    sum -= note;
                    result++;
                }
            }
         }

        return result;
    }
  
  
  
   public static void main(String[] args) {

     ATM atm = new ATM();
     System.out.println(atm.countBanknotes(200));
  
  }

}