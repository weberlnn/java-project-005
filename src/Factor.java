/**
 * Created by lin on 2016/8/5.
 */
//一个方法可以有多个形参。声明形参时，只需要用逗号将形参分割开即可。Factor类定义了一个名为
//isFactor()的方法，该方法用于确定第一个形参是否是第二个形参的因数。
public class Factor {
    boolean isFactor(int a, int b) {//该方法有两个形参
        if( (b % a) == 0) return true;
        else return false;
    }
}
class IsFact {
    public static void main(String args[]) {
        Factor x = new Factor();//在调用isFactor()时，实参也是用逗号分隔的。
        if(x.isFactor(2,20)) System.out.println("2是因素");//向isFactor()传递两个实参
        if(x.isFactor(3,20)) System.out.println("这不会被显示");
    }
}
