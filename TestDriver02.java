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
//���涨��CarFactory��һ���ӿ�
interface CarFactory{
	Car createCar();
	
}
//��������ר����һ�����ͳ�����
   //���ǵϹ�����
class BydFactory implements CarFactory{
	public Car createCar(){
		return new Byd();
		
	}
}
   //�µϹ�����
class AodiFactory implements CarFactory{
	public Car createCar(){
		return new Aodi();
		
	}
}

//������
public class TestDriver02{
	public static void main (String [] args){
		Car c1 = new AodiFactory().createCar();
		Car c2 = new BydFactory().createCar();
		c1.run();
		c2.run();
	}
}