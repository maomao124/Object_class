/**
 * Project name(项目名称)：Object类
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/31
 * Time(创建时间)： 13:45
 * Version(版本): 1.0
 * Description(描述)： Java 所有的类都是 Object 类的子类，所以任何 Java 对象都可以调用 Object 类的方法
 * Object 类的常用方法
 * 方法	            说明
 * Object clone()	创建与该对象的类相同的新对象
 * boolean equals(Object)	比较两对象是否相等
 * void finalize()	当垃圾回收器确定不存在对该对象的更多引用时，对象垃圾回收器调用该方法
 * Class getClass()	返回一个对象运行时的实例类
 * int hashCode()	返回该对象的散列码值
 * void notify()	激活等待在该对象的监视器上的一个线程
 * void notifyAll()	激活等待在该对象的监视器上的全部线程
 * String toString()	返回该对象的字符串表示
 * void wait()	在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待
 */

public class test
{
    public static void main(String[] args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        _toString.main();
        System.out.println("------------------");
        equals_.main();
        System.out.println("------------------");
        getClass_.main();
        System.out.println();
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
