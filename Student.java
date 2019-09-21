//课本P112 编程一

class Student{
	String name;
	double grade;
	public String getName(){
		//获取属性值
		return name;
		
	}
	public void setName(String stuName){
		//设置属性值
		name = stuName;
		
	}
	public double getGrade(){
		return grade;
		
	}
	public void setGrade (double stuGrade){
		grade = stuGrade;
		
	}
	
	//定义一个无参的构造方法
	public Student(){
		
	}
	//定义两参数的构造方法
	public Student(String stuName,double stuGrade){
		name = stuName;
		grade = stuGrade;
	}
	public void speak(){
		System.out.println("大家好，我叫"+ name + ",我的成绩是" + grade +"分！");
	}
}