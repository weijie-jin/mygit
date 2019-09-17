 class Student{

	private String name;
	private double grade;
	public Student (){
		
	}
	public Student (String name,double grade){
		this.name = name;
		this.grade = grade;
		
	}
	public String getName(){
		return name;
		
	}
	public void setName(String name){
		this.name = name;
		
	}
	public double getGrade(){
		return grade;
		
	}
	public void setGrade(double grade){
		this.grade = grade;
		
	}
	public void speak(){
	System.out.println("大家好,我叫"+name+",我的成绩"+grade+"分");
	
	}
}
public class Test1{
	public static void main(String[] args){
		Student stu1 = new Student("陈杰",90);
		Student stu2 = new Student();
        stu2.setName("李芳");
        stu2.setGrade(100);
		
		stu1.speak();
		stu2.speak();
    }
}
 