//java只允许单一 继承，即一个类只能拥有一个父类
//继承中最常使用的两个关键字是extends和implements。
//所有Java的类均是由java.lang.Object类继承而来的，所以Object是所有类的祖先类，而除了Object外，所有类必须有一个父类。
//一般我们继承基本类和抽象类用extends关键字，实现接口类的继承用implements关键字。

interface Animal{}

class Mammal implements Animal{}

public class Dog extends Mammal{
   public static void main(String args[]){

      Mammal m = new Mammal();
      Dog d = new Dog();

      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
   }
} 
//结果均为true

/*
  Java只支持单继承（继承基本类和抽象类），但是我们可以用接口来实现（多继承接口来实现）,脚本结构如：
  public class Apple extends Fruit implements Fruit1,Fruit2{}
*/
  
