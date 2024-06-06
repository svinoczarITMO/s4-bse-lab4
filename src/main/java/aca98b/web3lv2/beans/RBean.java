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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void rChecker(FacesContext fC, UIComponent uC, Object val) {
        if (val == null) {
            System.out.println("err");
        }
    }
}
