interface Animal{
	//������󷽷�shout()
	void shout();
	
} 
//����Cat��ʵ��Animal�ӿ�
class Cat implements Animal{
	//ʵ�ֳ��󷽷�shout()
	public void shout (){
		System.out.println("��������");
		
	}
	//����sleep()����
	void sleep(){
		System.out.println("è˯������");
		
	}
}

public class Example14{
	public static void main(String args []){
		Cat cat = new Cat();
		animalShout(cat);     //����animalShout()��������cat��Ϊ��������
		
	}
	//���徲̬����animalShout(), ����һ��Animal���͵Ĳ���
	public static void animalShout(Animal animal ){
		Cat cat = (Cat )animal;
		cat.shout();
		cat.sleep();
	}
	
}