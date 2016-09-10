/**
 * Created by lin on 2016/8/5.
 */
/*调用方法时，可以向方法传递一个或多个值。向方法传递的值称为实参(argument)。在方法中接受实参的
变量被称为形参。形参声明在方法名后的圆括号中。形参声明语法与用于变量的语法是一样的。形参位于自己
方法的作用域中，起着接受实参的特殊任务，它的工作方式与局部变量十分相似。
下面是一个使用了一个形参的简单示例。在ChkNum类中，如果传递给isEven()的值是偶数，它就
返回true，否则返回false。因此，isEven()有一个boolean返回类型。
 */
public class ChkNum {//使用形参。
    boolean isEven(int x) {//x是isEven()的整数形参
        if((x % 2) == 0) return true;
        else return false;
    }
}
class ParmDemo {
    public static void main(String args[]) {
        ChkNum e = new ChkNum();
        if(e.isEven(10)) System.out.println("10是偶数.");//传递实参给isEven()
        if(e.isEven(9)) System.out.println("9是偶数.");
        if(e.isEven(8)) System.out.println("8是偶数.");
    }
}
