package com.layed;

	public class Empl {
		String name;
		int age;
		String job;
		int sal;
		Empl(){
			
		}
		Empl(String na,int ag, String jo,int sa){
			name=na;
			age=ag;
			job=jo;
			sal=sa;
		}   
		public void create() {
			new EmplConnection(name,age,job,sal);
		}	
		public void raiseSalary() {
			new EmplConnection(sal);
		}
	}


