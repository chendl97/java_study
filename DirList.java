import java.io.File;


public class DirList {
   public static void main(String args[]) {
      String dirname = "F:/android sdk";
      File f1 = new File(dirname);
      if (f1.isDirectory()) {
         System.out.println( "Directory of " + dirname);
         String s[] = f1.list();
         for (int i=0; i < s.length; i++) {
            File f = new File(dirname + "/" + s[i]);
            if (f.isDirectory()) {
               System.out.println(s[i] + " is a directory");
            } else {
               System.out.println(s[i] + " is a file");
            }
         }
      } else {
         System.out.println(dirname + " is not a directory");
    }

    String name="F:/chendaliang";
    File d=new File(name);
    if(d.mkdir()){
    	System.out.println("directory is created");
    }
    else {
      System.out.println("directory is not created");
      }
  }
}

//一个目录其实就是一个File对象，它包含其他文件和文件夹。 

//如果创建一个File对象并且它是一个目录，那么调用isDirectory( )方法会返回true。 

//可以通过调用该对象上的list()方法，来提取它包含的文件和文件夹的列表。 

/*
   File类中有两个方法可以用来创建文件夹：
    mkdir( )方法创建一个文件夹，成功则返回true，失败则返回false。失败表明File对象指定的路径已经存在，或者由于整个路径还不存在，该文件夹不能被创建。
    mkdirs()方法创建一个文件夹和它的所有父文件夹。

*/