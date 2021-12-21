import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


//事件处理类
public class GameMouse implements MouseListener {
  //定义gr变量，保存传递过来的画笔对象
  private Graphics gr;

  public void setGr(Graphics gr){
    this.gr = gr;
  }
  public void mouseClicked(MouseEvent e){

    //获取当前坐标值
    int x = e.getX();
    int y = e.getY();

    //绘制棋盘
    int index;
    for (int i=0; i<8; i++){
      index = i*100;
      //横线
      gr.drawLine(0, index, GameUI.boardSize, index);
      //竖线
      gr.drawLine(index, GameUI.boardSize, index, 0);
    }

    //下棋子
    int xRound = round(x);
    int yRound = round(y);
    gr.fillOval(xRound,yRound,GameUI.pieceSize,GameUI.pieceSize);

  }
  public void mousePressed(MouseEvent e){

  }
  public void mouseReleased(MouseEvent e){

  }
  public void mouseEntered(MouseEvent e){

  }

  public void mouseExited(MouseEvent e){

  }

  private int round(int num){
    return (int)Math.round(((double)num)/100)*100-GameUI.pieceSize/2;
  }
}

