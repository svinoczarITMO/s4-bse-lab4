package aca98b.web3lv2.mBeans;
import javax.management.MXBean;
@MXBean
public interface TimerMBean {
    void setNewHitTime(long hitTime);
    void setAverageIntervalBetweenHits();
    double getAverageIntervalBetweenHits();
}
