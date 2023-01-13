package Week_2;
public class Temperature {
    
    //variable
private double ftemp;

public Temperature(double t){
    ftemp = t;
}

public void setFahrenheit(double t){
    ftemp = t;
}

public double getFahrenheit(){
    return ftemp;
}

public double getCelsius(){
    return (ftemp-32)*(5.0/9);
}

public double getKelvin(){
    return getCelsius()+ 273.0;
}

}
