package employeePay;

import java.util.Scanner;

import employeePay.Employee;
import employeePay.RegEmployee;

public class TestEmployee {


	public static void main(String[] args) {
	
// 금성회사 급여시스템
	      Scanner in = new Scanner(System.in);
	      System.out.print("입력 자료 수 : ");
	      int n = in.nextInt();
	      Employee[] emp = new Employee[n];
	      for(int i=0;i<n;i++) {
	         System.out.print("사원번호,이름...");
	         String no=in.next();
	         String name=in.next();
	         System.out.print("사원의 근무유형 : (1:CEO, 2:정규직, 3:임시직)");
	         int num = in.nextInt();
	         switch (num) {
	         
	         case 1: {
	            System.out.print("직책, 월 임금...");
	           
	            String us= in.next();
	            int mon = in.nextInt();
	            Staff sa = new Staff(name,no,us,mon);
	            emp[i]=sa;
	            break;
	         }
	         case 2:{
	            System.out.print("부서, 업무, 월 임금...");
	            String us1= in.next();
	            String uss1= in.next();
	            int mon1 = in.nextInt();
	            RegEmployee re = new RegEmployee(name,no,us1,uss1,mon1);
	            emp[i]=re;
	            break;
	            
	         }
	         case 3:{
	            System.out.print("부서, 월 근무시간 수...");
	            String us2= in.next();
	            int mon2 = in.nextInt();
	            TempEmployee te = new TempEmployee(name,no,us2,mon2);
	            emp[i]=te;
	            break;
	            
	         }
	         default: System.out.println("근무유형 오류 재입력 ...");
	         i--;
	            
	         }
	                  
	      }
	      
	      System.out.println("급여 보고서");
	      for(int i =0;i<n;i++) {
	         System.out.println(emp[i]);
	      }
	}
}
	      
	      
	   
	   