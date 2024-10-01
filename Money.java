abstract class Money  {
   protected int amount;
   @Override
   public boolean equals(Object object)  {
      Money money = (Money) object;
      return amount == money.amount && getClass().equals(money.getClass());   }   

   static Dollar dollar(int amount)  {
      return new Dollar(amount);
   }
	
   abstract Money times(int multiplier);   
   
   static Money franc(int amount) {
      return new Franc(amount);
    }
}