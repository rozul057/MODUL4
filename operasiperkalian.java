/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;
public class operasiperkalian extends operasibilangan {
    
     @Override
    protected void setA(double a){
        this.a = a;
    }
    
     @Override
    protected void setB(double b){
        this.b = b;
    }
    
     @Override
    protected void setC(){
        this.c=a*b;

    }
    
    @Override
    protected double getA(){
        return a;
    }
    
     @Override
    protected double getB(){
        return b;
    }
    
     @Override
    protected double getC(){
        return c;
    }
    
     @Override
    protected void tampil(){
    } 
    
}



   
