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
	System.out.println("��Һ�,�ҽ�"+name+",�ҵĳɼ�"+grade+"��");
	
	}
}
public class Test1{
	public static void main(String[] args){
		Student stu1 = new Student("�½�",90);
		Student stu2 = new Student();
        stu2.setName("�");
        stu2.setGrade(100);
		
		stu1.speak();
		stu2.speak();
    }
}
 