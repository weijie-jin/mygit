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

//����һ����������
public class TestDriver {
	public static void main(String[] args){
		Car aodi = new Aodi();   //����һ���µϳ�
		Car byd = new Byd();
		//����
		aodi.run();
		byd.run();
	}
	
}
