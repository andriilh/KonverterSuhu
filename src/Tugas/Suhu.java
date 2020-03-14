/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;


/**
 *
 * @author root
 */
public class Suhu {
    public double celcius(String asal, double suhunya) {
        switch (asal) {
            case "r":
                return 0.8 * suhunya;
            case "k":
                return suhunya + 273.15;
            case "f":
                return 1.8 * suhunya + 32;
        }
        return 0;
    }

    public double reamur(String asal, double suhunya) {
        switch (asal) {
            case "c":
                return 1.25 * suhunya;
            case "k":
                return 1.25 * suhunya + 273.15;
            case "f":
                return 2.25 * suhunya + 32;
        }

        return 0;
    }
    
    public double kelvin(String asal, double suhunya) {
        switch(asal) {
            case "c":
                return suhunya - 273.15;                
            case "r":
                return 0.8 * (suhunya - 273.15);                
            case "f":
                return 1.8 * (suhunya - 273.15) + 32;                
        }
        
        return 0;
    }
    
    public double fahrenheit(String asal, double suhunya) {
        switch(asal) {
            case "c":
                return 0.55555555555556 * (suhunya - 32);
            case "r":
                return 0.44444444444444 * (suhunya - 32);
            case "k":
                return 0.55555555555556 * (suhunya - 32) + 273.15;
        }
        
        return 0;
    }
}
