/**
 * Created by lin on 2016/8/4.
 */
public class Vehicle2 {
    int passengers;
    int fuelcap;
    int mpg;
//这一行声明了一个名为range的无形参方法。它返回的类型是void。因此，range()不向调用者返回值。
//这一行以方法体的左花括号结尾。read()方法在遇到右花括号时结束。这会导致程序的控制权返回调用者。
    void range() {
        System.out.println("Range is " + fuelcap*mpg);//range()的主体由这一行代码组成。
    }//该语句显示了fuelcap与mpg相乘得到的汽车行驶里程。因为在调用range()时，Vehicle类型的
} //每个对象都有自己的fuelcap和mpg的副本，所以行驶里程的计算使用了调用对象的这些变量的副本。
class AddMeth{
    public static void main(String args[]) {
        Vehicle2 minivan = new Vehicle2();
        Vehicle2 sportscar = new Vehicle2();
        int range1, ranfe2;

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        sportscar.passengers = 2;
        sportscar.fuelcap =14;
        sportscar.mpg = 12;

        System.out.print("Minivan can carry " + minivan.passengers + ". ");
        minivan.range();//(.)运算符：对象在点运算符左边指定，成员则放在点运算符右边。
        System.out.print("Sportscar can carry " + sportscar.passengers + ". ");
        sportscar.range();
    }
}
/*minivan.range();     该语句调用minivan的range()方法。即它在对象后面使用点运算符，调
用与minivan对象相关的range()。当调用方法时，程序控制权被转移到方法。当方法结束时，控制权
转移回调用者，从调用后的一行代码继续执行。
 */