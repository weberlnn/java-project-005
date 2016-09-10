/**
 * Created by lin on 2016/8/4.
 */
public class Vehicle {
    int passengers;//乘客数量。
    int fuelcap;//加仑燃料容量。
    int mpg;//英里每加仑的燃油消耗。
}
class Vehicledemo{
    public static void main(String args[]) {
       Vehicle minivan= new Vehicle();
        int range;
        //小型货车在给字段赋值。
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        //计算范围假设加满油。
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("小货车可以携带 " + minivan.passengers + "范围为 " + range);
    }
}
/*在编译该程序时，你会发现创建了两个扩展名为.class的文件，一个用于Vehicle，另一个则用于VehicleDemo。
java编译器将自动的把每个类放到它自己的.class文件中。不用把Vehicle和VehicleDemo类放入同一个源文件中。
可以把类分别放在名为Vehicle.java和VehicleDemo.java的文件中。
 */