package command;

import java.util.concurrent.TimeUnit;

public class FiveMinCommand implements Command {

    StopWatch watch = new StopWatch();

    public FiveMinCommand(StopWatch watch) {
        this.watch = watch;
    }

    public void execute() {
              
      try {
        watch.countDownFiveMin();
        TimeUnit.MILLISECONDS.sleep(100);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
}