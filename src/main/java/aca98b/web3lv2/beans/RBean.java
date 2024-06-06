package aca98b.web3lv2.beans;

import aca98b.web3lv2.mBeans.Timer;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.component.UIComponent;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;

import javax.management.*;
import java.io.Serializable;
import java.lang.management.ManagementFactory;

@Named
@SessionScoped
public class RBean implements Serializable {

    private String value;
    private static Timer timerMBean;

    static {
        try {
            MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
            ObjectName area = new ObjectName("mbeans:type=Timer");
            timerMBean = new Timer();
            mbs.registerMBean(timerMBean, area);
        } catch (MalformedObjectNameException | NotCompliantMBeanException | InstanceAlreadyExistsException | MBeanRegistrationException e) {
            e.printStackTrace();
        }
    }
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
        timerMBean.calculateFigureArea(value);
    }

    public void rChecker(FacesContext fC, UIComponent uC, Object val) {
        if (val == null) {
            System.out.println("err");
        }
    }
}
