package aca98b.web3lv2.beans.management;

import aca98b.web3lv2.beans.BeanOfElements;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@SessionScoped
public class Counter implements Serializable {
    private BeanOfElements beanOfElements = new BeanOfElements();

    public Integer getCountOfElements(){
        var count = beanOfElements.getListOfElements().size();
        System.out.println(count);
        return count;
    }
}
