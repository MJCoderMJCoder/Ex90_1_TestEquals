package com.testequals;
//equals()比较的是两个对象的值；而“==”比较的是两个存储对象在内存中的首地址
public class TestEquals {

	public static void main(String[] args) {
		String name1 = new String("张三"); //name1和name2值相同，但地址不同；
		String name2 = new String("张三"); //因为在创建对象时，都用new赋予了新的地址空间
		String name3 = "张三";
		String name4 = "张三";
		System.out.println(name1.equals(name2)); //值相等，地址不同
		System.out.println(name1.equals(name3)); //值相等，地址不同
		System.out.println(name3.equals(name4)); //值相等，地址相同
		System.out.println(name1 == name2); //值相等，地址不同
		System.out.println(name1 == name3); //值相等，地址不同
		System.out.println(name3 == name4); //值相等，地址相同
	}

}
