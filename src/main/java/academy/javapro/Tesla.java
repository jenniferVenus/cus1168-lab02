package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    //Constructor (takes model and year)
    public Tesla(String model, int year)
    {
      super("Tesla", model, year);
      this.autopilotEnabled = false;
      this.charging = false;
    }

    //Methods implemented from Vehicle Class
    @Override
    public void startEngine()
    {
        if(!isRunning)
            {
              isRunning = true;
              System.out.println("Tesla " + model + " started");

            }
        else{

            System.out.println("Tesla " + model + " has already been started.");
        }

    }
        
    @Override
    public void stopEngine()
    {
        if(isRunning)
        {
            isRunning = false;
            System.out.println("Tesla" + model + " stopped");
        }
        else
        {
            System.out.println("Tesla" + model + " has already been stopped.");
        }
    }

    @Override
    public void accelerate()
    {
        if(isRunning)
        {
            System.out.println("Tesla " + model +" is accelerating...");
        }
        else
        {
            System.out.println("Tesla " + model + " cannot accelerate. The Tesla is not running");
        }
    }

    @Override
    public void brake()
    {
        if(isRunning)
        {
            System.out.println("Tesla " + model + " is braking...");
        }
        
        else
        {
            System.out.println("Tesla " + model + " cannot brake. The Tesla is not running.");
        }

    }

    //Methods implemented from Electric Interface
    
    @Override
    public void charge()
    {
        if(!charging)
        {
            charging = true;
            System.out.println("Tesla " + model + " is now charging.");
        }
        else
        {
            System.out.println("Tesla "+ model + "is already charging.");
        }
    }

   @Override
    public boolean isCharging()
    {
        return charging;
    }

    //Methods implemented from Autonomous Interface
    
    @Override
    public void enableAutopilot()
    {
        if(!autopilotEnabled)
        {
            autopilotEnabled = true;
            System.out.println("Autopilot enabled");
        }
        else
        {
            System.out.println("Autopilot is already enabled");
        }
    }

    public void disableAutopilot(){

        if(autopilotEnabled)
        {
            autopilotEnabled = false;
            System.out.println("Autopilot disabled");
        }
        else
        {
            System.out.println("Autopilot is already diabled");
        }

    }

    public boolean isAutopilotEnabled()
    {
        return autopilotEnabled;
    }

    
}
