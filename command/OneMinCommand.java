/**
 * @author Aaron L. Keys, @author Brennen Cubic, @author Robbie Prentice, @author Lingjia Shi
 */
package command;

/**
 * Class takes a command and counts down from 1 minute, 
 * displaying the seconds as they count down. (slightly sped up)
 */
public class OneMinCommand implements Command {
  /**
   * Declaring and initializing the watch variable.
   */    
    StopWatch watch = new StopWatch();
  /**
   * Constructor method; initializing the value of watch.
   * @param watch an instance of Class StopWatch that 
   * gets the number of seconds from which the watch needs
   * to count down.
   */
    public OneMinCommand(StopWatch watch) {
        this.watch = watch;
    }

    /**
     * Counting down from one minute with a sleep method to slow down
     * the speed with which it iterates.
     */
    public void execute() {
      try {
        watch.countDownOneMin();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
}