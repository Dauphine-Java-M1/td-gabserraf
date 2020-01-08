/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.dauphine.ja.serrafgabriel.threads;

/**
 *
 * @author Admin
 */
public class ScalarThread extends Thread{
    
    private MySafeList v1;
    private MySafeList v2;
    private int begin;
    private int end;
    private Double scalar;
    
    public ScalarThread(MySafeList l1, MySafeList l2, int begin, int end){
        this.v1 = l1;
        this.v2 = l2;
        this.begin = begin;
        this.end = end;
        this.start();
    }
    
    @Override
    public void run(){
        
        scalar = MySafeList.scalar(v1, v2, begin, end);
        
    }
    
    public Double getResult(){
        
        return scalar;
    }
}
