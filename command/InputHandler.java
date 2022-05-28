package command;

import java.util.HashMap;

/**
 * Creates instance of inputHandler
 */
public class InputHandler  
{
    private HashMap<String, Command> commands;
    /**
     * Populates hashMap with keys and values
     * @param watch is type watch.
     */
    public InputHandler(StopWatch watch) 
    {
        commands = new HashMap<String, Command>();
        commands.put("1", new OneMinCommand(watch));
        commands.put("5", new FiveMinCommand(watch));
        commands.put("30", new ThirtySecCommand(watch));
    }

    /**
     * Checks if input entered is correct. (May need review)
     * @param data passed in from other class
     * @return boolean
     */
    public boolean inputEntered(String data) 
    {
        if(commands.containsKey(data))
        {
            commands.get(data).execute();
            return true;
        }
        else 
        {
            return false;
        }
    }
}
