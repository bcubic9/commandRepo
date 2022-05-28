package command;

public class StopWatch {
  public StopWatch() {
  }

  public void countDownOneMin() {
    countdownFromInt(59);
  }

  public void countDownThirtySec() {
    countdownFromInt(29);
  }

  public void countDownFiveMin() {
    countdownFromInt(299);
  }

  private void countdownFromInt(int seconds) {
    for (int i = seconds; i >= 0; i--) {
      String valOfI = (i >= 10) ? String.valueOf(i) : "0" + String.valueOf(i);
      System.out.println("00:" + valOfI);
      this.sleep();
      this.clearConsole();
    }
  }

  private void clearConsole() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  } 
  
  private void sleep() {
    try {
      TimeUnit.MILLISECONDS.sleep(100);
    } catch(Exception e) {
            
    }
  }
}
