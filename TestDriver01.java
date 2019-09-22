//���ӿ�
 interface Car{
	//������
	void run();
	
}
//ʵ�ֳ��ӿڵ���
class Aodi implements Car{
	public void run(){
		System.out.println("�µϳ�����");
		
	}
}

class Byd implements Car{
	public void run(){
		System.out.println("���ǵ�����");
		
	}
}

//������

class CarFactory{
	public static Car create(String str){
		if(str.equals("�µ�")){
     		return new Aodi();
		}
		else if(str.equals("���ǵ�")){
			return new Byd();
		}
		return null;
	}
}

//����һ����������
public class TestDriver01{
	public static void main(String[] args){
		Car aodi = CarFactory.create("�µ�");
		Car byd = CarFactory.create("���ǵ�");
		//����
		aodi.run();
		byd.run();
	}
}