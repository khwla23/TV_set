
package tv_set;

import java.util.Scanner;

/**
 *
 * @author khwla akbar
 */
class Tv
{
    int channel;
    int volumeLevel;
    boolean status;
    String S = "";
    
    public Tv()
    {
       channel = 1;
       volumeLevel = 0;
       status = false;
    }
    
    public void turnOn()
    {
        status = true;
    }
    
    public void turnOff()
    {
        status = false;
    }
    
    public void setchannel(int newChannel)
    {
        channel = newChannel;
    }
    
    public void setVolume(int newVolumeLevel)
    {
        volumeLevel = newVolumeLevel;
    }
    
    public void channelUp(){
        if (channel<200)
            channel++;
        else
            channel = 1;
        
    }
    public void channelDown(){
        if(channel>1)
            channel--;
        else
            channel = 200;
    }
    
    public void volumeUp(){
        if (volumeLevel < 7)
            volumeLevel++;
        else
            volumeLevel = 7;
    }
    public void volumeDown(){
        if (volumeLevel > 1)
            volumeLevel--;
        else
            volumeLevel = 1;
    }
    
    public void Status(){
        if (status== false)
            S = "off";
        else
            S = "on";
        System.out.println("------TV Status-----");
        System.out.println("Your System is currently "+S);
        System.out.println("Volume = "+volumeLevel);
        System.out.println("Channel = "+channel);
    }
}

public class Tv_set {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Tv T = new Tv();
        
        char flag = 'y';
        while (flag == 'y')
        {
            System.out.println("----Menu-----\n1)Turn on the TV.\n2)Set a new Channel for this TV.\n3)Set a new Volume level for this TV.");
            System.out.println("4)Increase the channel by 1.\n5)Decrease the channel by 1.\n6)Increase the Volume by 1.");
            System.out.println("7)Decrease the Volume by 1.\n8)Turn off the TV.\n9)Show the complete Status Of your TV.");
            System.out.println("Enter Your Choice:");
            int choice = input.nextInt();
            
            switch (choice)
            {
                case 1:
                    T.turnOn();
                    System.out.println("Tv is turned on.");
                    break;
                case 2:
                    System.out.println("Set a new channel for this Tv:");
                    int newC = input.nextInt();
                    if (newC>=1 && newC<=200){
                        T.setchannel(newC);
                    }
                    System.out.println("New channel has been set successfully.");
                    break;
                    
                case 3:
                    System.out.println("Set a new Volume for this Tv:");
                    int newT = input.nextInt();
                    if (newT>=0 && newT<=7){
                        T.setchannel(newT);
                    }
                    System.out.println("New Volume has been set successfully.");
                    break;
                    
                case 4:
                    T.channelUp();
                    System.out.println("Channel has been increased successfully.");
                    break;
                    
                case 5:
                    T.channelDown();
                    System.out.println("Channel has been decreased successfully.");
                    break;
                    
                case 6:
                    T.volumeUp();
                    System.out.println("Volume has been increased successfully.");
                    break;
                    
                case 7:
                    T.volumeDown();
                    System.out.println("Volume has been decreased successfully.");
                    break;
                    
                case 8:
                    T.turnOff();
                    System.out.println("Tv is turned off.");
                    break;
                
                case 9:
                    T.Status();
                    break;
                default:
                    System.out.println("Error, Chosen Option is Wrong.");
            }
            System.out.println("\nDo you want to check the Menu again? press 'y' for yes and 'n' for no");
            flag = input.next().charAt(0);
            
        }
    }
    
}
