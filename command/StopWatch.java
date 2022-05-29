/**
 * @author Aaron L. Keys, @author Brennen Cubic, @author Robbie Prentice, @author Lingjia Shi
 */
package command;

import java.util.concurrent.TimeUnit;

public class StopWatch {
  /**
   * Constructor method.
   */
  public StopWatch() {
  }
  /**
   * Passing the number of seconds to the countDownFromInt method.
   */
  public void countDownOneMin() {
    countdownFromInt(59);
  }
  /**
   * Passing the number of seconds to the countDownFromInt method.
   */
  public void countDownThirtySec() {
    countdownFromInt(29);
  }
  /**
   * Passing the number of seconds to the countDownFromInt method.
   */
  public void countDownFiveMin() {
    countdownFromInt(299);
  }
  /**
   * Counting down the seconds from the number passed in the parameter.
   * @param seconds is the number of seconds which will be counted down.
   */
  private void countdownFromInt(int seconds) {
    for (int i = seconds; i >= 0; i--) {
      String valOfI = (i >= 10) ? String.valueOf(i) : "0" + String.valueOf(i);
      System.out.println("00:" + valOfI);
      this.sleep();
      this.clearConsole();
    }
  }
  /**
  * Clearing the console.
  */
  private void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  } 
  /**
   * Putting a 100 millisecond (1/10th of a second) gap between
   * the next print
   */
  private void sleep() {
    try {
      TimeUnit.MILLISECONDS.sleep(100);
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
