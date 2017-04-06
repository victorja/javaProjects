/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sistemas
 */
public class BoundedCounter {
    private int value = 0;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        // write code here
    }

    public void next() {
        if(this.value < this.upperLimit)
            this.value++;
        else
            this.value = 0;
        // write code here
    }

    public String toString() {
    if(this.value < 10)
        return "0" + value;
    else
        return "" + value;
        // write code here
    }
    
    public int getValue() {
        return value;
    // write here code that returns the value
}
    
    public void setValue(int value){
    if(value >= 0 && value <= this.upperLimit) //aca toque
        this.value = value;
        
        
    }
}
    