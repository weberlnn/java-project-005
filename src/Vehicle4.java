/**
 * Created by lin on 2016/8/5.
 */
/*可以使用一个带形参的方法向Vehicle类添加新的功能：即计算给定距离所需的耗油总量的功能。新方法
的名称为fuelneeded()。该方法获取你要行驶的英里数，返回所需汽油的加仑数。fuelneeded()方法定义：
double fuelneeded (int miles){       注意该方法返回一个double类型的值。这是非常有用的，因
return (double)miles / mpg;  }        为行驶给定里程所需的耗油总量可能不是一个整数。
 */
public class Vehicle4 {//包含fuelneeded()的整个Vehicle类如下。
    int passengers;//乘客数量
    int fuelcap;//加仑燃料容量
    int mpg;//英里每加仑的燃料消耗
    //返回范围
    int range(){
        return mpg * fuelcap;
    }
    //给定距离计算所需的燃料
    double fuelneeded(int miles){
        return (double) miles / mpg;
    }
}
class CompFuel{
    public static void main(String args[]){
        Vehicle4 minivan = new Vehicle4();
        Vehicle4 sportscar = new Vehicle4();
        double gallons;//加仑
        int dist = 252;//距离
        //小型货车给字段赋值
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        //跑车给字段赋值
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;
        gallons = minivan.fuelneeded(dist);
        System.out.println("去 " + dist + " 英里货车需要 " +
                           gallons + " 加仑的燃料。");
        gallons = sportscar.fuelneeded(dist);
        System.out.println("去 " + dist + " 英里赛车需要 " +
                           gallons + " 加仑的燃料。");

    }
}
