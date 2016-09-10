/**
 * Created by lin on 2016/8/5.
 */
/*在程序中，注意当range()被调用时，是将它放在赋值语句的右边。而左边是一个接收range()返回值的变量。
因此，在下列代码行执行后，minivan对象的行驶里程就存储到了range1中：  range1 = minivan.range();
 */
public class Vehicle3 {//返回值
    int passengers;
    int fuelcap;
    int mpg;
    int range() {
        return fuelcap * mpg;
    }
}
class RetMeth {
    public static void main(String args[]){
        Vehicle3 minivan = new Vehicle3();
        Vehicle3 sportscar = new Vehicle3();
        int range1, range2;
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("货车可乘客 " + minivan.passengers +
                           " 的范围 " + range1 + " 英里");
        System.out.println("货车可乘客 " + sportscar.passengers +
                           " 的范围 " + range2 + " 英里");
    }
}
/*注意，现在range()有一个int类型的返回值。这就意味着要向调用者返回一个整数值。方法的返回类型之
所以重要，是因为方法返回的数据类型必须与方法指定的返回类型兼容。因此，如果你想让一个方法返回double
类型的数据，那么它的返回类型必须是double类型。
 */