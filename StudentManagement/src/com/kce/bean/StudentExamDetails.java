package com.kce.bean;

public class StudentExamDetails extends Student{
          public int fees;
          private int Admission_no;
          public int course_id;
		  public int attendance;
		  public int total_mark;
		public StudentExamDetails(int id,String name, int age, int dob, String address, int fees, int admission_no,
				int course_id, int attendance, int total_mark) {
			super(id, age, dob, address, name);
			this.fees = fees;
			this.Admission_no = admission_no;
			this.course_id = course_id;
			this.attendance = attendance;
			this.total_mark = total_mark;
		}
		public int getFees() {
			return fees;
		}
		public void setFees(int fees) {
			this.fees = fees;
		}
		public int getAdmission_no() {
			return Admission_no;
		}
		public void setAdmission_no(int admission_no) {
			Admission_no = admission_no;
		}
		public int getCourse() {
			return course_id;
		}
		public void setCourse(int course) {
			course_id = course;
		}
		public int getAttendance() {
			return attendance;
		}
		public void setAttendance(int attendance) {
			this.attendance = attendance;
		}
		public int getTotal_mark() {
			return total_mark;
		}
		public void setTotal_mark(int total_mark) {
			this.total_mark = total_mark;
		}
		@Override
		public String toString() {
			return "StudentExamDetails [ id "+id+" Name= "+name+" Age= "+age+" date of birth "+Dob+" Address= "+address+" fees=" + fees + ", Admission_no=" + Admission_no + ", Course=" + course_id
					+", attendance=" + attendance + ", total_mark=" + total_mark + "]";
		}
		public void DisplayEducationDetails() {
			System.out.println(toString());
		}

		public void Marks() {
			System.out.println(getTotal_mark());
		}

	
		public void Report() {
			if(getTotal_mark()<50)
			{
				System.out.println("Below Average");
			}
			else if(getTotal_mark()==50)
			{
				System.out.println("Average");
			}
			else if(getTotal_mark()>50&&getTotal_mark()<=70)
			{
				System.out.println("Good");
			}
			else if(getTotal_mark()>70&&getTotal_mark()<=90)
			{
				System.out.println("Best");
			}
			else if(getTotal_mark()>90&&getTotal_mark()<=100)
			{
				System.out.println("OutStanding");
			}
			else
			{
				System.out.println("Enter valid Total mark!!!");
			}
		}
	
}
