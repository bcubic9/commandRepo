package command;

import java.util.concurrent.TimeUnit;

public class OneMinCommand implements Command {
    
    StopWatch watch = new StopWatch();

    public OneMinCommand(StopWatch watch) {
        this.watch = watch;
    }

    public void execute() {
        
              
      try {
        watch.countDownOneMin();
        TimeUnit.MILLISECONDS.sleep(100);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
}