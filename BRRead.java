// 使用 BufferedReader 在控制台读取字符

import java.io.*;

public class BRRead {
   public static void main(String args[]) throws IOException
   {
      char c;
      String str;
      // 使用 System.in 创建 BufferedReader 
      BufferedReader br = new BufferedReader(new 
                         InputStreamReader(System.in)); // 重要

      System.out.println("Enter characters line, 'end' to quit.");
      // 读取字符
      do {
         str =  br.readLine();         
         System.out.println(str);
      } while(!str.equals("end"));
   }
}

/**
*read方法的语法：int read() throws IOException    
* 每次调用read()方法，它从输入流读取一个字符并把该字符作为整数值返回。 当流结束的时候返回-1。该方法抛出IOException。
*为了获得一个绑定到控制台的字符流，你可以把System.in包装在一个BufferedReader 对象中来创建一个字符流。 
*
*/