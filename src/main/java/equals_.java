/**
 * Project name(项目名称)：Object类
 * Package(包名): PACKAGE_NAME
 * Class(类名): equals_
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/31
 * Time(创建时间)： 13:55
 * Version(版本): 1.0
 * Description(描述)：
 * ==运算符是比较两个引用变量是否指向同一个实例，equals() 方法是比较两个对象的内容是否相等，通常字符串的比较只是关心内容是否相等。
 */

public class equals_
{
    public static boolean validateLogin(String username, String password)
    {
        boolean result = false;
        if (username.equals("name") && password.equals("123"))
        {                                         // 比较两个 String 对象
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }

    public static void main(String... args)
    {
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(19);
        stu1.setSex("男");
        Student stu2 = new Student("张三", "男", 19);
        System.out.println(stu2.equals(stu1));
        Student stu3 = new Student("张三", "女", 17);
        System.out.println(stu3.equals(stu1));

        String username = "name";
        String password = "123";
        boolean result = validateLogin(username, password);
        if (result)
        {
            System.out.println("登录成功！");
        }
        else
        {
            System.out.println("用户名或密码有误！");
        }
        password = "456";
        result = validateLogin(username, password);
        if (result)
        {
            System.out.println("登录成功！");
        }
        else
        {
            System.out.println("用户名或密码有误！");
        }
    }
}
