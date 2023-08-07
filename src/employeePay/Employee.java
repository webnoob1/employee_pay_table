package employeePay;

public class Employee {
	   String name;
	   String sno;
	   public Employee(String name, String sno) {
	      
	      this.name = name;
	      this.sno = sno;
	   }
	   @Override
	   public String toString() {
	      
	      return "이름 : "+name+"사원번호 : "+sno;
	   }
	   
	   public int earnings() {
	      
	      return 0;
	      
	   }
	   
	}