package employeePay;

public class Staff extends Employee {
	   
	   String title;
	   int staffpay;
	   
	   public Staff(String name, String sno,String title ,int staffpay) {
	      super(name, sno);
	      this.title= title;
	      this.staffpay=staffpay;
	      
	      // TODO Auto-generated constructor stub
	   }
	   
	   @Override
	   public int earnings() {
	      staffpay = staffpay +20;
	      return staffpay;
	   }

	   @Override
	   public String toString() {
	      
	      return super.toString()+"직책 : "+ title+ "급여액 : "+(staffpay+20)+"만원";
	   }
	   
	   

	   
	}