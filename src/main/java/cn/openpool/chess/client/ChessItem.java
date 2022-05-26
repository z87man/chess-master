package cn.openpool.chess.client;

import javax.swing.*;

/**
 * @author 王居三木超
 * @version 1.0
 * @date 2022/5/23 7:09
 * @description TODO
 **/
public class ChessItem {

    private JLabel jLabel;
    private ClientPoint point;


    public ChessItem(Integer x, Integer y, JLabel jLabel) {
        this.jLabel = jLabel;
        this.point = new ClientPoint(x, y);
    }

    public JLabel getjLabel() {
        return jLabel;
    }

    public ClientPoint getpoint() {
        return point;
    }

}
