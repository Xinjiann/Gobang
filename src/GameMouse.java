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
    System.out.println("点击");

    //获取当前坐标值
    int x = e.getX();
    int y = e.getY();

    //绘制棋盘
//        gr.drawLine();

    //下棋子
    gr.fillOval(x,y,50,50);

  }
  public void mousePressed(MouseEvent e){

  }
  public void mouseReleased(MouseEvent e){

  }
  public void mouseEntered(MouseEvent e){

  }

  public void mouseExited(MouseEvent e){

  }
}