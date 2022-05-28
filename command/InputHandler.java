package command;

import java.util.HashMap;

public class InputHandler  
{
    private HashMap<String, Command> commands = new HashMap<String, Command>();
    public InputHandler(StopWatch watch) 
    {
        
    }

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
