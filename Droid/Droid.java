public class Droid{
  //A class representing a droid. A droid can perfomr tasks, state it's energy level and transfer energy to another droid.

  String name;
  int batteryLevel;

  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }

  public void performTask(String task){
    System.out.println(name+" is performing task: "+task);
    batteryLevel -= 10;
  }

  public void stateBatteryLevel(){
    System.out.println(name+" is at: "+batteryLevel+"%");
  }

  public void energyTransfer(Droid droid, int energy){
    batteryLevel -= energy;
    droid.energyTransfer(energy);
    System.out.println(name+" is transfering energy to "+droid.name);
  }

  public void energyTransfer(int energy){
    batteryLevel += energy;
  }

  public String toString(){
    return "Hello, I'm the droid: "+name;
  }

  public static void main(String[] args){
    Droid codey = new Droid("Codey");
    System.out.println(codey);
    codey.stateBatteryLevel();
    codey.performTask("Clean house");
    codey.stateBatteryLevel();
    Droid jim = new Droid("Jim");
    System.out.println(jim);
    jim.energyTransfer(codey, 10);
    codey.stateBatteryLevel();
    jim.stateBatteryLevel();

  }
}
