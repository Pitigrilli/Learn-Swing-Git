package gui;

import ch.aplu.jgamegrid.*;
import javax.swing.*;
import java.awt.*;
import actor.Clownfish;

public class GameWindow extends JFrame
{
  public GameWindow()
  {
    GameGrid gg = new GameGrid();
    gg.setCellSize(40);
    gg.setGridColor(Color.red);
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    getContentPane().add(gg, BorderLayout.NORTH);
    JTextField f = new JTextField("Hello, I am Nemo in a custom window");
    getContentPane().add(f, BorderLayout.SOUTH);
    pack();  // Must be called before actors are added!
    Clownfish fish = new Clownfish();
    gg.addActor(fish, new Location(2, 4));
    gg.doRun();
  }

  public void start()
  {
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new GameWindow().setVisible(true);
      }
    });
  }
}