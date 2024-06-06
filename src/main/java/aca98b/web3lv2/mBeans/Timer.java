package aca98b.web3lv2.mBeans;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Timer implements TimerMBean {
    private ArrayList<Long> hitTimeMillis = new ArrayList<>();
    private double avgTimeInterval = 0;


    @Override
    public void setNewHitTime(long hitTime) {
        hitTimeMillis.add(hitTime);
        setAverageIntervalBetweenHits();
    }

    @Override
    public void setAverageIntervalBetweenHits() {
        avgTimeInterval = IntStream.range(0, hitTimeMillis.size() - 1)
                .mapToDouble(i -> (hitTimeMillis.get(i + 1) - hitTimeMillis.get(i)) / 1000d)
                .average()
                .orElse(0);;
    }

    @Override
    public double getAverageIntervalBetweenHits() {
        return avgTimeInterval;
    }

    public void clear(){
        hitTimeMillis.clear();
        avgTimeInterval = 0;
    }
}
