import java.math.BigInteger;
import java.util.LinkedList;
import java.util.List;

/**
 * Project name(项目名称)：Object类
 * Package(包名): PACKAGE_NAME
 * Class(类名): getClass_
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/31
 * Time(创建时间)： 14:19
 * Version(版本): 1.0
 * Description(描述)： getClass() 方法返回对象所属的类，是一个 Class 对象。
 * 通过 Class 对象可以获取该类的各种信息，包括类名、父类以及它所实现接口的名字等。
 */

public class getClass_
{
    public static void main(String... args)
    {
        String s = "123";
        System.out.println("类名：" + s.getClass().getName());
        System.out.println("父类名：" + s.getClass().getSuperclass().getName());
        System.out.println("实现的接口：");
        for (int i = 0; i < s.getClass().getInterfaces().length; i++)
        {
            System.out.println(s.getClass().getInterfaces()[i]);
        }
        System.out.println();
        Integer data = 5;
        System.out.println("类名：" + data.getClass().getName());
        System.out.println("父类名：" + data.getClass().getSuperclass().getName());
        System.out.println("实现的接口：");
        for (int i = 0; i < data.getClass().getInterfaces().length; i++)
        {
            System.out.println(data.getClass().getInterfaces()[i]);
        }
        System.out.println();
        BigInteger b = new BigInteger("5479998445566874561423");
        System.out.println(b);
        System.out.println(b.pow(9));
        System.out.println("类名：" + b.getClass().getName());
        System.out.println("父类名：" + b.getClass().getSuperclass().getName());
        System.out.println("实现的接口：");
        for (int i = 0; i < b.getClass().getInterfaces().length; i++)
        {
            System.out.println(b.getClass().getInterfaces()[i]);
        }
        System.out.println();
        List<Integer> list = new LinkedList<>();
        list.add(5);
        System.out.println("类名：" + list.getClass().getName());
        System.out.println("父类名：" + list.getClass().getSuperclass().getName());
        System.out.println("实现的接口：");
        for (int i = 0; i < list.getClass().getInterfaces().length; i++)
        {
            System.out.println(list.getClass().getInterfaces()[i]);
        }
    }
}
