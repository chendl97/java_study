package com.imooc.io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class RafDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		File demo = new File("demo");
		if(!demo.exists())
			demo.mkdir();
		File file = new File(demo,"raf.dat");
		if(!file.exists())
			file.createNewFile();
		
		RandomAccessFile raf = new RandomAccessFile(file, "rw");
		//ָ���λ��
		System.out.println(raf.getFilePointer());
		
		raf.write('A');//ֻд��һ���ֽ�
		System.out.println(raf.getFilePointer());
		raf.write('B');
		
		int i = 0x7fffffff;
		//��write����ÿ��ֻ��дһ���ֽڣ����Ҫ��iд��ȥ�͵�д4��
		raf.write(i >>> 24);//��8λ
		raf.write(i >>> 16);
		raf.write(i >>> 8);
		raf.write(i);
		System.out.println(raf.getFilePointer());
		
		//����ֱ��дһ��int
		raf.writeInt(i);
		
		String s = "��";
		byte[] gbk = s.getBytes("gbk");
		raf.write(gbk);
		System.out.println(raf.length());
		
		//���ļ��������ָ���Ƶ�ͷ��
		raf.seek(0);
		//һ���Զ�ȡ,���ļ��е����ݶ������ֽ�������
		byte[] buf = new byte[(int)raf.length()];
		raf.read(buf);
		
		System.out.println(Arrays.toString(buf));
	    for (byte b : buf) {
			System.out.print(Integer.toHexString(b & 0xff)+" ");
		}
	    raf.close();
	}

}
