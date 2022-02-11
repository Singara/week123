package org.college;

import org.college.College1;

import org.department.Department;

    class Student extends Department {
	public void studentName()
	{
		System.out.println("Singa");
	}
public void studentDept()
{
	System.out.println("MT");
}
public void studentId()
{
	System.out.println(95);
}
	public static void main(String[] args) {
	College1 y=new College1();
	Department z= new Department();
	Student c= new Student();
	c.studentName();
	c.studentDept();
	c.studentId();
	y.college1();
	y.collegeCode();
	y.collegeRank();
	z.department();
	}

}
