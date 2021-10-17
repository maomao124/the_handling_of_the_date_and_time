import java.util.Date;

/**
 * Project name(项目名称)：时间日期的处理
 * Package(包名): PACKAGE_NAME
 * Class(类名): test_date
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/17
 * Time(创建时间)： 12:46
 * Version(版本): 1.0
 * Description(描述)：
 * 在 Java 中获取当前时间，可以使用 java.util.Date 类和 java.util.Calendar 类完成。
 * 其中，Date 类主要封装了系统的日期和时间的信息，Calendar 类则会根据系统的日历来解释 Date 对象。下面详细介绍这两个类的具体使用。
 * Date 类
 * Date 类表示系统特定的时间戳，可以精确到毫秒。Date 对象表示时间的默认顺序是星期、月、日、小时、分、秒、年。
 * 1. 构造方法
 * Date 类有如下两个构造方法。
 * Date()：此种形式表示分配 Date 对象并初始化此对象，以表示分配它的时间（精确到毫秒），使用该构造方法创建的对象可以获取本地的当前时间。
 * Date(long date)：此种形式表示从 GMT 时间（格林尼治时间）1970 年 1 月 1 日 0 时 0 分 0 秒开始经过参数 date 指定的毫秒数。
 * Date 类的无参数构造方法获取的是系统当前的时间，显示的顺序为星期、月、日、小时、分、秒、年。
 * Date 类带 long 类型参数的构造方法获取的是距离 GMT 指定毫秒数的时间，60000 毫秒是一分钟，
 * 而 GMT（格林尼治标准时间）与 CST（中央标准时间）相差 8 小时，
 * 也就是说 1970 年 1 月 1 日 00:00:00 GMT 与 1970 年 1 月 1 日 08:00:00 CST 表示的是同一时间。
 * 因此距离 1970 年 1 月 1 日 00:00:00 CST 一分钟的时间为 1970 年 1 月 1 日 00:01:00 CST，
 * 即使用 Date 对象表示为 Thu Jan 01 08:01:00 CST 1970。
 * 2. 常用方法
 * Date 类提供了许多与日期和事件相关的方法，其中常见的方法如表 1 所示。
 * 表1 Date类中的常用方法
 * 方法	描述
 * boolean after(Date when)	判断此日期是否在指定日期之后
 * boolean before(Date when)	判断此日期是否在指定日期之前
 * int compareTo(Date anotherDate)	比较两个日期的顺序
 * boolean equals(Object obj)	比较两个日期的相等性
 * long getTime()	返回自 1970 年 1 月 1 日 00:00:00 GMT 以来，此 Date 对象表示的毫秒数
 * String toString()	把此 Date 对象转换为以下形式的 String: dow mon dd hh:mm:ss zzz yyyy。
 * 其中 dow 是一周中的某一天(Sun、Mon、Tue、Wed、Thu、Fri 及 Sat)
 */

public class test_date
{
    public static void main(String...args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        Date d = new Date();
        System.out.println(d.toString());
        System.out.println(d);
        System.out.println(d.getYear());
        System.out.println(d.getMonth());
        System.out.println(d.getDate());
        System.out.println(d.getHours());
        System.out.println(d.getMinutes());
        System.out.println(d.getSeconds());
        System.out.println(d.getTimezoneOffset());
        System.out.println(d.toLocaleString());
        System.out.println("等待1秒：");
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        Date d2 = new Date();
        System.out.println("判断此日期是否在指定日期之后:");
        System.out.println(d.after(d2));
        System.out.println("判断此日期是否在指定日期之前:");
        System.out.println(d.before(d2));
        System.out.println("比较两个日期的顺序:");
        System.out.println(d.compareTo(d2));
        System.out.println(d2.compareTo(d));
        System.out.println("比较两个日期的相等性:");
        System.out.println(d.equals(d2));
        System.out.println("返回自 1970 年 1 月 1 日 00:00:00 GMT 以来，此 Date 对象表示的毫秒数:");
        System.out.println(d.getTime());
        System.out.print("两时间相差");
        System.out.print(d2.getTime() - d.getTime());
        System.out.println("毫秒");
        System.out.println();
        System.out.println("带参数的构造函数(参数为5000)：");
        Date d3 = new Date(5000);
        System.out.println(d3.toString());
        System.out.println(d3);
        System.out.println(d3.getYear());
        System.out.println(d3.getMonth());
        System.out.println(d3.getDate());
        System.out.println(d3.getHours());
        System.out.println(d3.getMinutes());
        System.out.println(d3.getSeconds());
        System.out.println(d3.getTimezoneOffset());
        System.out.println(d3.toLocaleString());
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
