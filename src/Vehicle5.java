/**
 * Created by lin on 2016/8/7.
 */
//向Vehicle5类添加一个构造函数：我们通过添加一个可以在创建对象时自动初始化passengers、fuelcap
//和mpg域的构造函数来改善Vehicle类。
public class Vehicle5 {
    int passengers;
    int fuelcap;
    int mpg;
    Vehicle5(int p, int f, int m) { //这是一个Vehicle5的构造函数。
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    //返回范围。
    //int range(){
       // return mpg * fuelcap;}

    //给定距离计算所需燃料。
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
class VehConsDemo{
    public static void main(String args[]){
        //构建完整的Vehicle5。
        Vehicle5 minivan = new Vehicle5(7, 16, 21);
        Vehicle5 sportscar = new Vehicle5(2, 14, 12);
        double gallons;
        int dist = 252;

        gallons = minivan.fuelneeded(dist);
        System.out.println(" 去 " + dist + " 英里货车需要 " + gallons + " 加仑的燃料。 ");

        gallons = sportscar.fuelneeded(dist);
        System.out.println(" 去 " + dist + " 英里跑车需要 " + gallons + " 加仑的燃料。");

    }
}
/*minivan和sportscar都是在创建时被构造函数Vehicle()初始化的。每个对象被初始化为构造函数中指定
那样。这行代码：Vehicle minivan = new Vehicle(7，16，21，);当new创建对象时，值7、16、和21被传
递给了Vehicle()构造函数。因此，minivan的passengers、fuelcap和mpg的副本会分别存储值7、16和21。
 */