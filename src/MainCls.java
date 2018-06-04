import java.util.Date;

/**
 * Created by MANU on 2018/6/4.
 */
public class MainCls {

    /**
     * 为 服务类 提供 额外的函数或者字段 支持
     * @param args
     */
    public static void main(String []args){
        Date dtNow = new Date();
        Date dtNext;
        SubDate dtSub;
        PackDate packDate;

        SourceCls clsSource = new SourceCls("伊琳",27,"女");
        SourceCls clsNext;
        ExtendCls clsExtend;
        PackageCls clsPackage;

        dtSub = new SubDate(dtNow);
        dtNext = dtSub.nextDay();
        clsExtend = new ExtendCls(clsSource);
        clsNext = clsExtend.nextYearSource();
        System.out.println("dtNow is " + dtNow);
        System.out.println("dtSub is " + dtSub);
        System.out.println("dtNext is " + dtNext);
        System.out.println("clsSource AGE is " + clsSource.getAge());
        System.out.println("clsExtend AGE is " + clsExtend.getAge());
        System.out.println("clsNext AGE is " + clsNext.getAge());
        System.out.println("formatClsExtend Tel is " + clsExtend.getTelNum());


        System.out.println(" **************************************** " );
        System.out.println(" **************************************** " );
        System.out.println(" **************************************** " );

        dtNext = new Date();
        clsNext = new SourceCls(clsSource.getName(),clsSource.getAge(),clsSource.getSex());
        packDate = new PackDate(dtNow);
        dtNext = packDate.nextDay();
        clsPackage = new PackageCls(clsSource);
        clsNext = clsPackage.nextYearSource();
        System.out.println("dtNow is " + dtNow);
        System.out.println("packDate is " + packDate);
        System.out.println("daNext is " + dtNext);
        System.out.println("clsSource AGE is " + clsSource.getAge());
        System.out.println("clsPackage AGE is " + clsPackage.getTmpSource().getAge());
        System.out.println("clsNext AGE is " + clsNext.getAge());
        System.out.println("clsPackage Tel is " + clsPackage.getTelNum());
    }
}
