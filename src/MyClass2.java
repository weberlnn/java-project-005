/**
 * Created by lin on 2016/8/7.
 */
//一个带形参的构造函数：只需在构造函数名称后的圆括号内声明形参即可。
public class MyClass2 {
    int x;
    MyClass2(int i){ //该构造函数有一个形参
        x = i;
    }
}
class ParmConsDemo{
    public static void main(String args[]) {
        //构造函数MyClass2()定义了一个名为i的形参，他用于初始化实例变量x。
        //因此，当执行代码:MyClass t1 = new MyClass(10)时，10就传递给了i，然后再由i赋给x。
        MyClass2 t1 = new MyClass2(10);
        MyClass2 t2 = new MyClass2(88);
        System.out.println(t1.x + " " + t2.x);
    }
}
