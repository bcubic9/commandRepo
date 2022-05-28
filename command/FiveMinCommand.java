package command;

import java.util.concurrent.TimeUnit;

public class FiveMinCommand implements Command {
    StopWatch watch = new StopWatch();
    public FiveMinCommand(StopWatch watch) {
      this.watch = watch;
    }

    public void execute() {
        watch.countDownFiveMin();
    }
}