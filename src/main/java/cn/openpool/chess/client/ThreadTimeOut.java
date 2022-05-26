package cn.openpool.chess.client;

/**
 * @author 王居三木超
 * @version 1.0
 * @date 2022/5/26 9:00
 * @description TODO
 **/
public class ThreadTimeOut implements Runnable {
    @Override
    public void run() {
        try {
            while (true) {
                if (System.currentTimeMillis() > Game.timeOut) {
                    Game.move(1, 1,
                            ChessWindows.chessItem.get(1 + "-" + 1).getjLabel(), true);
                    Game.timeOut = System.currentTimeMillis() + (1000 * 30);
                }
                Game.timeText.setText(("剩余" + (Game.timeOut - System.currentTimeMillis()) / 1000) + "秒");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
