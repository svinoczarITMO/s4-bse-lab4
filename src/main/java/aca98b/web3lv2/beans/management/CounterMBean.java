package aca98b.web3lv2.beans.management;

import aca98b.web3lv2.HibernateElement;

import java.util.List;

public interface CounterMBean {
    String getNotification();

    double getArea();

    void calculateShots(List<HibernateElement> results);

    void calculateArea(double currentR);
}
