package employeePay;

public class TempEmployee extends Employee {
	   String hdept;
	   int temphour;
	   public TempEmployee(String name, String sno, String hdept, int temphour) {
	      super(name, sno);
	      this.hdept = hdept;
	      this.temphour = temphour;
	   }
	   @Override
	   public int earnings() {
	      temphour = temphour *3;
	      return temphour;
	   }
	   @Override
	   public String toString() {
	      
	      return super.toString()+"부서 : "+hdept+"근무시간수 : "+temphour+"만원";
	   }
	   
	   

	   

	}
