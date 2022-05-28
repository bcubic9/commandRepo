package command;

import java.util.concurrent.TimeUnit;

public class OneMinCommand implements Command {
    StopWatch watch = new StopWatch();

    public OneMinCommand(StopWatch watch) 
        this.watch = watch;
    }

    public void execute() {
      watch.countDownOneMin();
    }
