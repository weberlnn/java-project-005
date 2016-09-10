/**
 * Created by lin on 2016/8/7.
 */
/*构造函数:在创建对象时初始化对象。它的名称与类名相同，并且在语法上与方法相似。然而，构造函数没有
显示返回类型。通常，构造函数用来初始化类定义的实例变量，或执行其他创建完整对象所需的启动过程。
无论你是否定义，所以的类都有构造函数，因为java自动提供了一个默认的构造函数数来初始化所有的成员变
为他们的默认值，即0、null和false。当然，你一旦定义了自己的构造函数，就不会再使用默认构造函数了。
 */
public class MyClass {
    int x;
    MyClass() {
        x = 10;
    }//该构造函数把数值10赋给了MyClass的实例变量x。该构造函数在创建对象时由new来调用。
}
class ConsDemo {
    public static void main(String args[]) {
        MyClass t1 = new MyClass();
        //t1对象调用了构造函数MyClass()，并把10赋给了t1.x。
        MyClass t2 = new MyClass();//t2也是这样。在构造完成后，t2.x的值为10。
        System.out.println(t1.x + " " + t2.x);
    }
}