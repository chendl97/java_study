import java.util.Scanner; 

public class ScannerDemo {  
    public static void main(String[] args) {  
        Scanner scan = new Scanner(System.in); 
		// 从键盘接收数据  

		//nextLine方式接收字符串
        System.out.println("nextLine方式接收：");
        // 判断是否还有输入
        if(scan.hasNextLine()){   
        	String str2 = scan.nextLine();
        	System.out.println("输入的数据为："+str2);  
        }  

    }  
}

//next()不能得到带有空格的字符串。
 //如果要输入int或float类型的数据，在Scanner类中也有支持，但是在输入之前最好先使用 hasNextXxx() 方法进行验证，再使用 nextXxx() 来读取