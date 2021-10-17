import java.util.Calendar;

/**
 * Project name(项目名称)：时间日期的处理
 * Package(包名): PACKAGE_NAME
 * Class(类名): test_Calendar
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/17
 * Time(创建时间)： 13:11
 * Version(版本): 1.0
 * Description(描述)： Calendar 类
 * Calendar 类是一个抽象类，它为特定瞬间与 YEAR、MONTH、DAY_OF—MONTH、HOUR 等日历字段之间的转换提供了一些方法，
 * 并为操作日历字段（如获得下星期的日期） 提供了一些方法。
 * 创建 Calendar 对象不能使用 new 关键字，因为 Calendar 类是一个抽象类，但是它提供了一个 getInstance() 方法来获得 Calendar类的对象。
 * getInstance() 方法返回一个 Calendar 对象，其日历字段已由当前日期和时间初始化。
 * Calendar c = Calendar.getInstance();
 * 当创建了一个 Calendar 对象后，就可以通过 Calendar 对象中的一些方法来处理日期、时间。Calendar 类的常用方法如表 2 所示。
 * 表 2 Calendar类的常用方法
 * 方法	描述
 * void add(int field, int amount)	根据日历的规则，为给定的日历字段 field 添加或减去指定的时间量 amount
 * boolean after(Object when)	判断此 Calendar 表示的时间是否在指定时间 when 之后，并返回判断结果
 * boolean before(Object when)	判断此 Calendar 表示的时间是否在指定时间 when 之前，并返回判断结果
 * void clear()	清空 Calendar 中的日期时间值
 * int compareTo(Calendar anotherCalendar)	比较两个 Calendar 对象表示的时间值（从格林威治时间 1970 年 01 月 01 日
 * 00 时 00 分 00 秒至现在的毫秒偏移量），大则返回 1，小则返回 -1，相等返回 0
 * int get(int field)	返回指定日历字段的值
 * int getActualMaximum(int field)	返回指定日历字段可能拥有的最大值
 * int getActualMinimum(int field)	返回指定日历字段可能拥有的最小值
 * int getFirstDayOfWeek()	获取一星期的第一天。根据不同的国家地区，返回不同的值
 * static Calendar getInstance()	使用默认时区和语言坏境获得一个日历
 * static Calendar getInstance(TimeZone zone)	使用指定时区和默认语言环境获得一个日历
 * static Calendar getInstance(TimeZone zone,
 * Locale aLocale)	使用指定时区和语言环境获得一个日历
 * Date getTime()	返回一个表示此 Calendar 时间值（从格林威治时间 1970 年 01 月 01 日 00 时
 * 00 分 00 秒至现在的毫秒偏移量）的 Date 对象
 * long getTimeInMillis()	返回此 Calendar 的时间值，以毫秒为单位
 * void set(int field, int value)	为指定的日历字段设置给定值
 * void set(int year, int month, int date)	设置日历字段 YEAR、MONTH 和 DAY_OF_MONTH 的值
 * void set(int year, int month, int date, int hourOfDay,
 * int minute, int second)	设置字段 YEAR、MONTH、DAY_OF_MONTH、HOUR、 MINUTE 和 SECOND 的值
 * void setFirstDayOfWeek(int value)	设置一星期的第一天是哪一天
 * void setTimeInMillis(long millis)	用给定的 long 值设置此 Calendar 的当前时间值
 * Calendar 对象可以调用 set() 方法将日历翻到任何一个时间，当参数 year 取负数时表示公元前。
 * Calendar 对象调用 get() 方法可以获取有关年、月、日等时间信息，参数 field 的有效值由 Calendar 静态常量指定。
 * Calendar 类中定义了许多常量，分别表示不同的意义。
 * Calendar.YEAR：年份。
 * Calendar.MONTH：月份。
 * Calendar.DATE：日期。
 * Calendar.DAY_OF_MONTH：日期，和上面的字段意义完全相同。
 * Calendar.HOUR：12小时制的小时。
 * Calendar.HOUR_OF_DAY：24 小时制的小时。
 * Calendar.MINUTE：分钟。
 * Calendar.SECOND：秒。
 * Calendar.DAY_OF_WEEK：星期几。
 * 例如，要获取当前月份可用如下代码：
 * int month = Calendar.getInstance().get(Calendar.MONTH);
 * 如果整型变量 month 的值是 0，表示当前日历是在 1 月份；如果值是 11，则表示当前日历在 12 月份。
 */

public class test_Calendar
{
    public static void main(String... args)
    {
        Calendar c = Calendar.getInstance();
        System.out.println("现在时刻：" + c.getTime()); // 获取当前时间
        int year = c.get(Calendar.YEAR);
        System.out.println("现在是" + year + "年");
        int month = c.get(Calendar.MONTH);
        month = month + 1;               //月份从 0 开始，所以加 1
        System.out.println("现在是" + month + "月");
        int day = c.get(Calendar.DATE);
        System.out.println("现在是" + day + "日");
        int week = c.get(Calendar.DAY_OF_WEEK);
        week = week - 1;                    //星期日为第一天
        if (week == 0)
        {
            System.out.println("星期天");
        }
        else
        {
            System.out.println("星期" + week);
        }
        int hour = c.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour + "小时");
        int minute = c.get(Calendar.MINUTE);
        System.out.println(minute + "分");
        int second = c.get(Calendar.SECOND);
        System.out.println(second + "秒");
        int millisecond = c.get(Calendar.MILLISECOND); // 获取毫秒数
        System.out.println(millisecond + "毫秒");
        int dayOfMonth = c.get(Calendar.DAY_OF_MONTH); // 获取今天是本月第几天
        System.out.println("今天是本月的第 " + dayOfMonth + " 天");
        int dayOfWeekInMonth = c.get(Calendar.DAY_OF_WEEK_IN_MONTH); // 获取今天是本月第几周
        System.out.println("今天是本月第 " + dayOfWeekInMonth + " 周");
        int many = c.get(Calendar.DAY_OF_YEAR); // 获取今天是今年第几天
        System.out.println("今天是今年第 " + many + " 天");
        Calendar c1 = Calendar.getInstance();
        c1.set(2013, 9, 23, 11, 3, 39);
        System.out.println(c1.getTime());
        int year1 = c1.get(Calendar.YEAR);
        System.out.println(year1 + "年");
        int month1 = c1.get(Calendar.MONTH);
        month1 = month1 + 1;               //月份从 0 开始，所以加 1
        System.out.println(month1 + "月");
        int day1 = c1.get(Calendar.DATE);
        System.out.println(day1 + "日");
        int hour1 = c1.get(Calendar.HOUR_OF_DAY);
        System.out.println(hour1 + "小时");
        int minute1 = c1.get(Calendar.MINUTE);
        System.out.println(minute1 + "分");
        int second1 = c1.get(Calendar.SECOND);
        System.out.println(second1 + "秒");
    }
}
