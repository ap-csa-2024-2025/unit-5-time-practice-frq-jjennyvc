public class Time
{
  // TODO: Part A - put your attributes here
private int hours;
private int minutes;
private int seconds;

public Time(int h, int m, int s)
{
  int hours = h;
  int minutes = m;
  int seconds = s;
}

public Time()
{
  this(0,0,0);
}

  // TODO: Part B - create your non-default constructor
  /**
  * Precondition: The number of hours is between 0 and 23 inclusive.
  * The number of minutes and seconds is between 0 and 59 inclusive.
  */


  // TODO: Part C - create your default constructor


  // TODO: Part D - complete the documentation for the pad method
  /**
  * Description: 
  * Precondition: The value is greater than 0.
  */
  private String pad(int value)
  {
    String output = "";
    if (value < 10)
    {
      return output + "0" + value;
    }
    return output + value;
  }
  // pad use to take in the value and add the 0 in front if he value is less than 0

  // TODO: Part E - complete the toString method; use the pad method as part of your solution
  public String toString()
  {
    return pad(hours) + ":" + pad(minutes) + ":" + pad(seconds);

  }

  // TODO: Part F - write the tick method
  public void tick()
  {
    seconds++;

    if (seconds == 60)
    {
      seconds = 0;
      minutes++;
    }

    if (minutes == 60)
    {
      minutes = 0;
      hours++;
    }

    if (hours == 24)
    {
      hours = 0;
    }
  }

  // TODO: Part G - write the add method
  /**
  * Precondition: The variable offset is non-null
  */
  public void add(Time offset)
  {

  }
}
