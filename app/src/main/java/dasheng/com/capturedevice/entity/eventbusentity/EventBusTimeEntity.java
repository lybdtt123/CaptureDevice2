package dasheng.com.capturedevice.entity.eventbusentity;

/**
 * 作者： liuyuanbo on 2018/10/19 14:30.
 * 时间： 2018/10/19 14:30
 * 邮箱： 972383753@qq.com
 * 用途： 选择时间的时候返回的数据
 */

public class EventBusTimeEntity {
    /**
     * 返回的long类型的时间
     */
    public long timeLong;
    /**
     * 返回的没有秒的时间
     */
    public String timeWithoutS;
    /**
     * 年-月-日 时:分:秒
     */
    public String time;
    /**
     * 返回的只有分和秒的时间
     */
    public String timeOnlyMS;
    /**
     * 防止一个页面有好多需要时间的地方无法区分
     */
    public String tag;
    public EventBusTimeEntity(long timeLong, String time, String timeWithoutS, String timeOnlyMS, String tag){
        this.timeLong = timeLong;
        this.timeWithoutS = timeWithoutS;
        this.timeOnlyMS = timeOnlyMS;
        this.time = time;
        this.tag = tag;
    }
}
