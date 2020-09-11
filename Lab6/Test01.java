/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author nimra.bese16seecs
 */
class Sensor{
    protected int sensorNumber;
    protected boolean state;
    protected boolean working;
    protected String dateOfInstallation;
    protected String location;
    
    public Sensor(int sensorNumber,boolean state,boolean working,String dateOfInstallation, String location){
        this.sensorNumber = sensorNumber;
        this.state = state;
        this.working = working;
        this.dateOfInstallation = dateOfInstallation;
        this.location = location;
    }
    public boolean switching(boolean state){
        this.state = state;
        return state;
        
    }
    public void resetting(){
        this.working = true;
        this.state = false;
        System.out.println("The sensor is reset.");
    }
   
}
class SmokeSensor extends Sensor{
    private boolean smoke;
    private String state01;
    public SmokeSensor(boolean smoke,int sensorNumber, boolean state, boolean working, String dateOfInstallation, String location) {
        super(sensorNumber, state, working, dateOfInstallation, location);
        this.smoke = smoke;
    }
    public void getresult(){
        if (smoke==true)
            System.out.println("Calling firebrigade!");
                
    }
    public boolean getState(){
        return state;
}
    public void alarmAndLight(){
        if (state == true)
            System.out.println("Alarm is switched on and lights are on!");
        
    }
    
    public void printing(){
        System.out.println("The smoke sensor is activated.");
        if (state==true)
            state01 = "On";
        else
            state01 = "off";
        System.out.println("The sesor number is "+sensorNumber+ " The state os switch is "+state01+ " Is it working?"+working);
        System.out.print("The date of installation is "+dateOfInstallation + "Manufatured at "+location);
    }
}

class MotionSensor extends Sensor{
    private boolean motion;
    private String state01;
    public MotionSensor(boolean motion,int sensorNumber, boolean state, boolean working, String dateOfInstallation, String location) {
        super(sensorNumber, state, working, dateOfInstallation, location);
        this.motion = motion;
    }
    public void getresult(){
        if (motion==true)
            System.out.println("Lock the doors!");
        
    }
    public boolean getState(){
        return state;
       
}
    public void alarmAndLight(){
        if (state == true)
            System.out.println("Alarm is switched on and lights are off!");
        
    }
public void printing(){
        System.out.println("The smoke sensor is activated.");
        if (state==true)
            state01 = "On";
        else
            state01 = "off";
        System.out.println("The sesor number is "+sensorNumber+ " The state os switch is "+state01+ " Is it working?"+working);
        System.out.print("The date of installation is "+dateOfInstallation + " Manufatured at "+location);
    }}
class SoundSensor extends Sensor{
    private boolean sound;
    private String state01;
    public SoundSensor(boolean sound,int sensorNumber, boolean state, boolean working, String dateOfInstallation, String location) {
        super(sensorNumber, state, working, dateOfInstallation, location);
        this.sound = sound;
    }
    public void getresult(){
        if (sound==true)
            System.out.println("Calling police");
                
    }
    public boolean getState(){
        return state;
    }
     public void alarmAndLight(){
        if (state == true)
            System.out.println("Alarm is switched on and lights are off!");
        
    }
public void printing(){
        System.out.println("The smoke sensor is activated.");
        if (state==true)
            state01 = "On";
        else
            state01 = "off";
        System.out.println("The sesor number is "+sensorNumber+ " The state os switch is "+state01+ " Is it working?"+working);
        System.out.print("The date of installation is "+dateOfInstallation + " Manufatured at "+location);
    }}
public class Test01{
    public static void main(String[] args){
        System.out.println("Smoke is detected");
        SmokeSensor s1 = new SmokeSensor(true,1,false,true,"24/2/2010","Lahore");
        s1.switching(true);
        s1.printing();
        s1.getresult();
        s1.alarmAndLight();
        s1.resetting();
        System.out.println("Unusuall activity is detected");
        MotionSensor m1 = new MotionSensor(true,2,false,true,"21/4/2010","Lahore");
        m1.switching(true);
        m1.printing();
        m1.getresult();
        m1.alarmAndLight();
        m1.resetting();
        System.out.println("Sound is detected");
        SoundSensor s01 = new SoundSensor(true,3,false,true,"10/4/2010","Lahore");
        s01.switching(true);
        s01.printing();
        s01.getresult();
        s01.alarmAndLight();
        s01.resetting();
}
}
     
   
