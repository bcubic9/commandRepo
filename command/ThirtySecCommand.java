/**
 * @author Aaron L. Keys, @author Brennen Cubic, @author Robbie Prentice, @author Lingjia Shi
 */
package command;

/**
 * Class takes a command and counts down from 30 seconds, 
 * displaying the seconds as they count down. (slightly sped up)
 */
public class ThirtySecCommand implements Command {
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
  public ThirtySecCommand(StopWatch watch) {
    this.watch = watch;
  }
    /**
     * Counting down from thirty seconds with a sleep method to slow down
     * the speed with which it iterates.
     */
  public void execute() {
      try {
        watch.countDownThirtySec();
      } catch (Exception e) {
        e.printStackTrace();
      }
  }
}
