package aca98b.web3lv2.mBeans;
import javax.management.MXBean;

import aca98b.web3lv2.beans.OneElement;

@MXBean
public interface CounterMBean {

    void addHit(OneElement hit);
    int getCounterAll();
    int getCounterFalse();

}
