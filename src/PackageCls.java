/**
 * Created by MANU on 2018/6/4.
 */
public class PackageCls {
    SourceCls tmpSource;
    String telNum;

    public SourceCls getTmpSource() {
        return tmpSource;
    }

    public void setTmpSource(SourceCls tmpSource) {
        this.tmpSource = tmpSource;
    }

    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    public PackageCls(SourceCls s){
        tmpSource = s;
        telNum = String.valueOf(s.getAge()*2048);
    }

    SourceCls nextYearSource(){
        return new SourceCls(tmpSource.getName(),tmpSource.getAge()+1,tmpSource.getSex());
    }

    @Override
    public String toString() {
        return "PackageCls{" +
                "tmpSource=" + tmpSource +
                ", telNum='" + telNum + '\'' +
                '}';
    }
}
