/**
 * Created by lin on 2016/8/8.
 */
/*调用finalize()是在垃圾回收之前，理解这一点非常重要。当对象不在作用域中时，是不会调用它的。这就
意味着你不知道何时执行finalize()，甚至finalize()是否会执行。例如，如果你的程序在垃圾回收发生之前
结束，那么就不会执行finalize()因此，这就需要把它作为一个“后备”过程来确保对某些资源的合理处理，或
用于特殊用途的应用程序，而不是程序在普通操作中使用的方法。
 */
//演示垃圾收集和finalize()方法
public class FDemo {
    int x;
    FDemo(int i) {
        x = i;
    }
    //当对象被回收
    protected void finalize() {
        //这里，protected关键字是一个防止类以外的代码访问finalize()的说明符。
        System.out.println("Finalizing " + x);
    }
    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}
/*构造函数设置实例变量x为一个已知值。本例中，x用作一个对象ID。finalize()方法在回收对象时显示x的值。
值得我们特别注意的是generator()，该方法创建，然后销毁了一个FDemo对象。
 */
class Finalize {
    public static void main(String args[]) {
        int count;
        FDemo ob = new FDemo(0);
/*现在，生成大量对象。在某些情况下，垃圾收集会发生。注意：您可能需要增加对象的数量生成为了
迫使垃圾收集。
*/
        for(count=1; count < 100000; count++)
            ob.generator(count);
    }
}
/*该类创建了一个名为ob的初始FDemo对象，然后通过在ob上调用generator()创建100000个对象。这就产生
了创建和销毁100000个对象的效果。在这一过程中间的不同点上，垃圾回收就会发生。而发生的频度与时间由
若干因素决定，如空闲内存的初始总数和操作系统。然而，在某个时刻，你会看到由finalize()产生的消息。
如果你没有看到这些消息，可以尝试通过增加for循环中统计数的值来增加产生的对象数。
 */