/**
 * Created by lin on 2016/8/4.
 */
class vehicle6{
    int passengers;
    int fuelcap;
    int mpg;
}
/*下面语句还可以写成这样：
Vehicle minivan;      声明引用对象。
minivan = new Vehicle()；分配一个车辆对象。
第一行把minivan声明为对Vehicle类型对象的引用。因此，minivan是一个可以引用对象的变量，但是它本身
不是对象。此时，minivan不引用对象。下一行创建一个新的Vehicle对象，并把对它的引用赋给了minivan。
现在，minivan就与一个对象链接在一起了。
 */
public class TwoVehicles {//class声明只是一个类型描述，它不创建任何实际的对象。
    public static void main(String args[]){
        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();
        int range1, range2 ;
//小型货车给字段赋值。
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
//跑车给字段赋值。
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;
        System.out.println("货车可以携带 " + minivan.passengers + " 范围为 " + range1);
        System.out.println("货车可以携带 " + sportscar.passengers + " 范围为 " + range2);
    }
}
/*如何创建对象：在前面的程序中用于声明一个Vehicle类型的对象。
Vehicle minivan = new Vehicle();  该声明完成两个功能。
1：它声明一个名为minivan的类Vehicle类型的变量。该变量没有定义对象，它只是一个可以引用对象的变量。
2：声明创建了对象的一个实际的副本，并把对象的引用赋给了minivan。这些都是由new运算符完成的。
new运算符为对象动态分配内存（即在运行是分配），并返回一个对它的引用。该应用是由new分配的对象
在内存中的地址。然后，把引用存储在变量中。因此，在java中，必须动态分配所有的类对象。
 */