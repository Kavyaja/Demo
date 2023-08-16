package com.hibernate.DemoHib;

public class Student {
	

		private int id;
		private String name;
		private String department;
		private long mobile;
		private String place;
		
		public Student()
		{
			
		}
		
		public Student(int id, String name, String department, long mobile, String place) {
			super();
			this.id = id;
			this.name = name;
			this.department = department;
			this.mobile = mobile;
			this.place = place;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public long getMobile() {
			return mobile;
		}

		public void setMobile(long mobile) {
			this.mobile = mobile;
		}

		public String getPlace() {
			return place;
		}

		public void setPlace(String place) {
			this.place = place;
		}
		
	}


