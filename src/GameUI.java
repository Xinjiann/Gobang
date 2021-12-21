import javax.swing.*;
import java.awt.*;

public class GameUI {


  //1.显示游戏界面
  public void initUI(){
    //窗体
    JFrame jf = new JFrame();
    jf.setSize(800,800);
    jf.setTitle("五子棋游戏");
    //居中显示
    jf.setLocationRelativeTo(null);
    //退出进程
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //显示可见
    jf.setVisible(true);

    //3.画笔：图像内容显示在哪个组件上，画笔就从该组件上获取
    //从窗体上获取画笔，一定要在窗体显示可见之后
    Graphics g = jf.getGraphics();

    //2.监听器
    //a.事件源：当前动作所发生的组件
    //b.监听器：鼠标监听器方法
    //c.绑定处理类

    //给窗体添加鼠标监听器方法
    //数据类型：1.基本类型(8个)   2.引用类型(自定义类型)：类(class),接口(interface),数组
    GameMouse mouse = new GameMouse();
    jf.addMouseListener(mouse);
    mouse.setGr(g);
  }

  public static void main(String[] args) {
    GameUI ui = new GameUI();
    ui.initUI();
  }
}
