/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagadt;

import java.util.Scanner;


public class BagADT {

  
    public static void main(String[] args) {
        
           
        LL bag1=new LL();
        LL bag2=new LL();

        bag1.addToHead(5);
        bag1.addToHead(6);
        bag1.addToTail(6);
        bag1.addToİndex("seval", 3);
        bag1.addToHead(5);
        bag1.addToHead(6);
        bag1.addToTail(6);
        bag1.addToİndex("karaman", 7);
        bag1.addToHead(5);
        bag1.addToHead(6);
        bag1.addToTail(6);
        bag1.addToİndex("seval", 12);
       
            
        bag2.addToHead(5);
        bag2.addToHead(6);
        bag2.addToTail(6);
        bag2.addToHead(8);
        bag2.addToHead(6);
        bag2.addToTail(9);
        bag2.addToHead(15);
        bag2.addToHead("kedi");
        bag2.addToTail("köpek");
        bag2.addToİndex("seval", 3);
        bag2.addToHead(5.0);
        bag2.addToHead(6);
        bag2.addToTail(6);
        bag2.addToİndex("karaman", 7);
        bag2.addToHead(5);
        bag2.addToHead(6);
        bag2.addToTail(6);
        bag2.addToİndex("seval", 12);   
        bag2.tostring();
        System.out.println("");
        bag2.deleteAValue("seval");
        System.out.println("");
        bag2.tostring();
        bag2.deleteAValueAll(6);
        bag2.tostring();
        System.out.println("");
        bag2.deleteHead();
        bag2.tostring();
        System.out.println("");
        bag2.deleteIndex(5);
        bag2.tostring();
        System.out.println("");
        bag2.deleteAValue("kedi");
        bag2.tostring();
        System.out.println("");
         
        
        System.out.println(  LL.distictSize(bag2));
        LL.isEquals(bag1, bag2);
        
    }
    
}
