public class Fees {
   static private int totalFees=10000;
   private int feesSubmitted;
   private String month;


   public int getArreas(){
       return totalFees-feesSubmitted;
   }

   public boolean isSubmitted(){
       return !(this.feesSubmitted==0);
   }

    public int getFeesSubmitted() {
        return feesSubmitted;
    }

    public static int getTotalFees() {
        return totalFees;
    }

    public static void setTotalFees(int totalFees) {

        Fees.totalFees = totalFees;
    }

    public void setFeesSubmitted(int feesSubmitted) {
       //this.submitted=true;
        this.feesSubmitted = feesSubmitted;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

   public Fees() {}
   public Fees( int feesSubmitted, String month) {
       this.feesSubmitted = feesSubmitted;
       this.month = month;
     //  this.submitted=true;
   }

    @Override
    public String toString() {
        return "Month="+month+" Fees="+this.feesSubmitted+ " Dues="+getArreas();
    }
}
