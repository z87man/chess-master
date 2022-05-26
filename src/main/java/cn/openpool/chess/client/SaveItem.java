package cn.openpool.chess.client;

import java.io.Serializable;
import java.util.Stack;

/**
 * @author 王居三木超
 * @version 1.0
 * @date 2022/5/24 12:42
 * @description TODO
 **/
public class SaveItem implements Serializable {
    private Integer bItem;
    private Integer wItem;
    private Integer count;
    private ChessType[][] chess;
    private Stack<ChessCache> record;

    public SaveItem(Integer bItem, Integer wItem, Integer count, ChessType[][] chess, Stack<ChessCache> record) {
        this.bItem = bItem;
        this.wItem = wItem;
        this.count = count;
        this.chess = chess;
        this.record = record;
    }

    public Stack<ChessCache> getRecord() {
        return record;
    }

    public ChessType[][] getChess() {
        return chess;
    }

    public Integer getbItem() {
        return bItem;
    }

    public Integer getwItem() {
        return wItem;
    }

    public Integer getCount() {
        return count;
    }
}
