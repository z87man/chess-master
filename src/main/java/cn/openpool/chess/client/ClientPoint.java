package cn.openpool.chess.client;

import java.io.Serializable;

/**
 * @author 王居三木超
 * @version 1.0
 * @date 2022/5/23 7:09
 * @description TODO
 **/
public class ClientPoint implements Serializable {
    public Integer x;
    public Integer y;

    @Override
    public String toString() {
        return "ClientPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public ClientPoint(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
}
