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
public class Kalkulator {
    public double hasil;

    public double getHasil() {
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }
    
    public double penjumlahan(double a, double b) {
        return a + b;
    }
    public double pengurangan(double a, double b) {
        return a - b;
    }
    public double perkalian(double a, double b) {
        return a * b;
    }
    public double pembagian(double a, double b) {
        return a / b;
    }
}
