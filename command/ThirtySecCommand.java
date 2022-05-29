package command;

import java.util.concurrent.TimeUnit;

public class ThirtySecCommand implements Command {

  StopWatch watch = new StopWatch();

  public ThirtySecCommand(StopWatch watch) {
    this.watch = watch;
  }

  public void execute() {
      
      try {
        watch.countDownThirtySec();
        TimeUnit.MILLISECONDS.sleep(100);
      } catch (Exception e) {
        e.printStackTrace();
      }
  }
}
