package command;

import java.util.concurrent.TimeUnit;

public class OneMinCommand implements Command {
    
    public OneMinCommand(StopWatch watch) 
        this.watch = watch;
    }

    public void execute() {
      watch.countDownOneMin();
    }
