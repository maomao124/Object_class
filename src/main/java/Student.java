/**
 * Project name(项目名称)：Object类
 * Package(包名): PACKAGE_NAME
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/31
 * Time(创建时间)： 13:49
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Student
{
    private String name;
    private String sex;
    private int age;

    public Student()
    {

    }

    public Student(String name, String sex, int age)
    {
        this.name = name;
        this.sex = sex;
        if (age >= 0)
        {
            this.age = age;
        }
        else
        {
            this.age = 0;
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSex()
    {
        return sex;
    }

    public void setSex(String sex)
    {
        this.sex = sex;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        if (age >= 0)
        {
            this.age = age;
        }
        else
        {
            this.age = 0;
        }
    }

    @Override
    @SuppressWarnings("all")
    public String toString()
    {
        final StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("name：").append(getName()).append('\n');
        stringbuilder.append("sex：").append(getSex()).append('\n');
        stringbuilder.append("age：").append(getAge()).append('\n');
        return stringbuilder.toString();
    }

    @Override
    public boolean equals(Object obj)
    {
        if (((Student) obj).getAge() != this.age)
        {
            return false;
        }
        if (!((Student) obj).getName().equals(this.getName()))
        {
            return false;
        }
        if (!((Student) obj).getSex().equals(this.getSex()))
        {
            return false;
        }
        return true;
    }
}
