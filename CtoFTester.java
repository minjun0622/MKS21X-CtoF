public class CtoFTester {

  public static void main (String [] args) {

  System.out.println (celciusToFahrenheit (0.0 )); // 32.0 degrees! Simple!
  System.out.println (celciusToFahrenheit (24.2)); // 75.56 degrees Fahrenheit, Yay!

  System.out.println (fahrenheitToCelcius (32.0)); // 0.0 degrees!
  System.out.println (fahrenheitToCelcius (212.0)); // 100.0 degrees!


  }

  public static double celciusToFahrenheit (double C) {

return ( (C * (9.0 / 5) ) + 32) ;
}
// This function is for Celcius to Fahrenheit!

public static double fahrenheitToCelcius(double F) {

return ( (F - 32) * (5.0 / 9) ) ;
}
// This function is for Fahrenheit to Celcius!
}
