//车接口
 interface Car{
	//车会跑
	void run();
	
}
//实现车接口的类
class Aodi implements Car{
	public void run(){
		System.out.println("奥迪车在跑");
		
	}
}

class Byd implements Car{
	public void run(){
		System.out.println("比亚迪在跑");
		
	}
}
//下面定义CarFactory是一个接口
interface CarFactory{
	Car createCar();
	
}
//定义两个专门造一种类型车的类
   //比亚迪工厂类
class BydFactory implements CarFactory{
	public Car createCar(){
		return new Byd();
		
	}
}
   //奥迪工厂类
class AodiFactory implements CarFactory{
	public Car createCar(){
		return new Aodi();
		
	}
}

//测试类
public class TestDriver02{
	public static void main (String [] args){
		Car c1 = new AodiFactory().createCar();
		Car c2 = new BydFactory().createCar();
		c1.run();
		c2.run();
	}
}