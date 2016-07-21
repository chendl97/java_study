package com.imooc.io;

import java.io.*;
import java.util.*;
public class Cdltest2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        File fi=new File("cdl");
        
        if(fi.exists()){
        	System.out.println("目录（文件）已被创建");
        }else{ 
        	fi.mkdir();
        }
        System.out.println(fi.isDirectory());
        
        //如果存在同名的文件或目录，则不会被创建
        if(fi.createNewFile()){
        	System.out.println("文件被创建");
        }else{
        	System.out.println("文件未被创建");
        }
        bufferread();
	}
	
	public static void bufferread() throws IOException{
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		 System.out.print("输入一个字符：");
		 char c =(char)br.read();
		 System.out.println(c);
	}

}
