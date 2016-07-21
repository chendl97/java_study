package com.imooc.io;

import java.io.*;
import java.util.*;


abstract class  Animal{
	public abstract void eat();
	public abstract void bark();
}

public class Cdltest {
    String name;
	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		String str="陈大良abc";
		//Gbk编码方式。eclipse默认；中文占两个字节，英文占一个
		byte[] b=str.getBytes();
		for (byte c : b) {
			System.out.print(Integer.toHexString(c &0xff)+" ");
		}
		System.out.println();
		//utf-8编码方式，中文占3个字节，英文占一个字节
		byte[] b1=str.getBytes("utf-8"); 
		for (byte c : b1) {
			System.out.print(Integer.toHexString(c&0xff)+" ");
		}
		
		System.out.println();
		//utf-16be编码方式 ，java编码方式，均占两个字节
		byte[] b2 =str.getBytes("utf-16be");
        for (byte c : b2) {
			System.out.print(Integer.toHexString(c&0xff)+" ");
		} 
        System.out.println();
        //Cdltest dx=new Cdltest("chen daliang");
        //dx.iotest();
        
        //多态
        Animal dogs=new Dog();
        Animal cats=new Cat();
        dogs.bark();
        dogs.eat();
        cats.bark();
        cats.eat();
	}
	
	public  void iotest(){
		Scanner s=new Scanner(System.in);
		System.out.println("请输入字符串：");
		if(s.hasNextLine()){
			String inp=s.nextLine();
			System.out.println("字符串:"+inp);
		}else{
			System.out.println("不是字符串");
		}
		System.out.println("请输入字符串：");
		if(s.hasNextLine()){
			String inp1=s.nextLine();
			System.out.println("字符串"+inp1);
		}else{
			System.out.println("不是字符串");
		}
		
		
	}
	
	public Cdltest(String name){
		this.name=name;
	    	
	}

}

//一个类继承一个抽象类必须重写它的抽象方法，否则就声明为抽象类
class Cat extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("猫吃鱼");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("猫叫");
		
	}
	
}

class Dog extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃肉");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("狗叫");
	}
	
}

