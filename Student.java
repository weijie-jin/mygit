//�α�P112 ���һ

class Student{
	String name;
	double grade;
	public String getName(){
		//��ȡ����ֵ
		return name;
		
	}
	public void setName(String stuName){
		//��������ֵ
		name = stuName;
		
	}
	public double getGrade(){
		return grade;
		
	}
	public void setGrade (double stuGrade){
		grade = stuGrade;
		
	}
	
	//����һ���޲εĹ��췽��
	public Student(){
		
	}
	//�����������Ĺ��췽��
	public Student(String stuName,double stuGrade){
		name = stuName;
		grade = stuGrade;
	}
	public void speak(){
		System.out.println("��Һã��ҽ�"+ name + ",�ҵĳɼ���" + grade +"�֣�");
	}
}