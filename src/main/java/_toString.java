import java.util.Scanner;

/**
 * Project name(项目名称)：Object类
 * Package(包名): PACKAGE_NAME
 * Class(类名): toString
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/31
 * Time(创建时间)： 13:46
 * Version(版本): 1.0
 * Description(描述)： toString() 方法返回该对象的字符串，当程序输出一个对象或者把某个对象和字符串进行连接运算时，
 * 系统会自动调用该对象的 toString() 方法返回该对象的字符串表示。
 * Object 类的 toString() 方法返回“运行时类名@十六进制哈希码”格式的字符串，但很多类都重写了 Object 类的 toString() 方法，
 * 用于返回可以表述该对象信息的字符串。
 * 哈希码（hashCode），每个 Java 对象都有哈希码属性，哈希码可以用来标识对象，提高对象在集合操作中的执行效率。
 */

public class _toString
{
    public static void main(String... args)
    {
        _toString s = new _toString();
        System.out.println(s);
        System.out.println(s.toString());
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(19);
        stu1.setSex("男");
        System.out.println(stu1);
    }
}
