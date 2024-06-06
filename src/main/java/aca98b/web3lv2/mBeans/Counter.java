package aca98b.web3lv2.mBeans;

import aca98b.web3lv2.beans.OneElement;
import javax.management.Notification;
import javax.management.NotificationBroadcasterSupport;

public class Counter extends NotificationBroadcasterSupport implements CounterMBean {

    private int countAll = 0;
    private int countFalse = 0;

    @Override
    public void addHit(OneElement hit) {
        countAll++;
        if (hit.getResult().equals("false")){
            countFalse++;
            Notification notification = new Notification("missByArea",
                    this, countAll, System.currentTimeMillis(), "Total number of misses by area");
            sendNotification(notification);
        }
    }

    public void clear(){
        countAll = 0;
        countFalse = 0;
    }

    @Override
    public int getCounterAll() {
        return countAll;
    }

    @Override
    public int getCounterFalse() {
        return countFalse;
    }
}
