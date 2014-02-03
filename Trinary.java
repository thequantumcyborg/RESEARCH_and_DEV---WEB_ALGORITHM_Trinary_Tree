/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trinary;
import java.util.*;

/**
 *
 * @author seifu001
 */
public class Trinary {
    public int value;
    public Trinary  left;
    public Trinary right;
    public Trinary center;

    /**
     *  Constructor
     * @param Integer
     * @param Trinary
     * @param Trinary
     * @param Trinary
     * @return void
    */
    public  Trinary(int value,Trinary left, Trinary center, Trinary right) {
        this.value=value;
        this.left=left;
        this.center=center;
        this.right=right;   
    }
    /**
     * 
     * @param Integer
     * @return void
    */
    public void setValue(int value){
        this.value=value;
    }
    /**
     * 
     * @param none
     * @return value
    */
    public int getValue(){
        return this.value;
    }
    
    /**
     * 
     * @param Trinary
     * @return void
    */
    public void setLeft(Trinary left){
        this.left=left;
    }
    /**
     * 
     * @param Trinary
     * @return node value
    */
    public Trinary getLeft(Trinary left){
        return this.left;
    }
    
    /**
     * 
     * @param Trinary
     * @return none
    */
    public void setCenter(Trinary center){
        this.center=center;
    }
    /**
     * 
     * @param Trinary
     * @return node value
    */
    public Trinary getCenter(Trinary center){
        return this.center;
    }
    /**
     * 
     * @param Trinary
     * @return none
    */
    public void setRight(Trinary right){
        this.right=right;
    }
    /**
     * 
     * @param Trinary
     * @return node value
    */
    public Trinary getRight(Trinary right){
        return this.right;
    }
    
    
}
