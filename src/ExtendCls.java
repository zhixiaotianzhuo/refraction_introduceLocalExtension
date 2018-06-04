/**
 * Created by MANU on 2018/6/4.
 */
public class ExtendCls extends SourceCls {
    String telNum;

    // 在构造真实的 ExtendCls 对象之前
    public ExtendCls(SourceCls s) {
        super(s.getName(),s.getAge(),s.getSex());
        this.telNum = String.valueOf(s.getAge()*2048);
    }

    public ExtendCls(String nStr, int aInt, String sStr, String telNum) {
        super(nStr, aInt, sStr);
        this.telNum = telNum;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    SourceCls nextYearSource(){
        return new SourceCls(getName(),getAge()+1,getSex());
    }

    @Override
    public String toString() {
        return "ExtendCls{" +
                "telNum='" + telNum + '\'' +
                '}';
    }
}
