package cn.openpool.chess.client;

import java.awt.*;

/**
 * @author 王居三木超
 * @version 1.0
 * @date 2022/5/24 14:49
 * @description TODO
 **/
public class Theme {
    private Color b;
    private Color w;
    private Integer current = 1;

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Color getB() {
        return b;
    }

    public void setB(Color b) {
        this.b = b;
    }

    public Color getW() {
        return w;
    }

    public void setW(Color w) {
        this.w = w;
    }

    public Theme(Color b, Color w) {
        this.b = b;
        this.w = w;
    }
}
