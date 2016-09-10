/**
 * Created by lin on 2016/8/8.
 */
/*this关键字：当调用一个方法时，会向它自动传递一个隐式实参，它是调用对象(即调用方法的对象)的一个引用。
这个引用就叫做this。考虑下面的程序，来理解this。
 */
public class Pwr {
    double b;
    int e;
    double val;
    Pwr(double base, int exp) {
        this.b = base;
        this.e = exp;
        this.val = 1;                 // 这里，this引用了调用get_pwr()的对象。因此，this.val引用
        if(exp==0) return;       //了对象的val的副本。
        for( ; exp>0; exp--) this.val = this.val * base;
    }
    double get_pwr() {
        return this.val;
    }
}
class DemoPwr {
    public static void main(String args[]) {
        Pwr x = new Pwr(4.0, 2);
        Pwr y = new Pwr(2.5, 1);
        Pwr z = new Pwr(5.7, 0);
        System.out.println(x.b + " 提高了 " + x.e + " 次方等于 " + x.get_pwr());
        System.out.println(y.b + " 提高了 " + y.e + " 次方等于 " + y.get_pwr());
        System.out.println(z.b + " 提高了 " + z.e + " 次方等于 " + z.get_pwr());
    }
}
