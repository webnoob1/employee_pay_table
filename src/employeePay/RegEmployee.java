package employeePay;


	public class RegEmployee extends Employee {
		   String dept;
		   String regtitle;
		   int regpay;
		   
		   public RegEmployee(String name, String sno, String dept, String regtitle, int regpay) {
		      super(name, sno);
		      this.dept = dept;
		      this.regtitle = regtitle;
		      this.regpay = regpay;
		   }
		   @Override
		   public int earnings() {
		      regpay=regpay+10;
		      return regpay;
		   }

		   @Override
		   public String toString() {
		      
		      return super.toString()+"부서 : "+dept+"담당업무 : "+regtitle+"급여액 : "+regpay+"만원";
		   }

		   
		   
		   
		   
		   
		}