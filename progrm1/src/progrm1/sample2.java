package progrm1;

public class sample2 {
	private String name;
	private int rollno;
	private String gender;
	private int age;
	sample2(String name,int rollno,String gender,int age)
	{
		this.name=name;
		this.rollno=rollno;
		this.gender=gender;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
