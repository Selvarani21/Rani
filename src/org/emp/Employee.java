package org.emp;

public class Employee {
public void empId() {
	System.out.println(" employee id  123");
}
public  void  empName() {
	System.out.println(" employee  name  abc");
	}
public  void  empDob() {
	System.out.println(" employee  dob  7/11/1994");
}
public  void  empPhone() {
	System.out.println(" employee  phone  is  1234567890");
	}

public  void  empAddress() {
	System.out.println(" employee  address  xyz");
	}
 public  static void main  (String [] args ) {
	 Employee  a=new  Employee();
    a.empId();
    a.empName();
	 a. empDob();
	 a.empPhone();
	 a.empAddress();
	 
 }
}
