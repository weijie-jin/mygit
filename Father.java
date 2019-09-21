class Father{
	private static String name = "zhangjun";
	//定义一个静态内部类
	 static class Child {
		void introFather(){
			System.out.println("我的父亲是" +name);
			
		}
	}
}