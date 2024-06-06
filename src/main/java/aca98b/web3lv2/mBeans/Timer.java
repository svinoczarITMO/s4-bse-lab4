package aca98b.web3lv2.mBeans;

public class Timer implements TimerMBean {

    private float figureArea = 0;

    @Override
    public void calculateFigureArea(String rValue) {
        float r = Float.parseFloat(rValue);
        figureArea = (r * r / 2) + (r / 2 * r) + (3.14f * r * r / 4);
        System.out.println(figureArea);
    }

    @Override
    public float getFigureArea() {
        return figureArea;
    }
}
