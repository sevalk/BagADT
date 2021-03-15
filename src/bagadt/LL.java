/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bagadt;

public class LL<h> {
  
    Node<h> head;
    Node<h> tail;
 
    
    public  LL(){
        head=null;
        tail=null;
    }
                   public void addToHead(h value){
                    Node newNode = new Node(value);
                    if (isEmpty()){
                        head=newNode;
                        tail=newNode;}
                    else{
                        newNode.next=head;
                        head=newNode;
                    }
                }
    
    
    
    
    
                 public void addToTail(h value){
                     Node newNode = new Node(value);
                     if (isEmpty()){
                         head=newNode;
                         tail=newNode;
                     }
                     else{
                         Node A=head;
                         while(A.next!= null)
                         {
                             A=A.next;
                         }  
                         A.next=newNode;
                         newNode=tail;
                     } 
                 }
                 
                 
                 public void addToİndex(h value,int index){
                     Node newNode=new Node(value);
                     if (isEmpty()){
                         head=newNode;
                         tail=newNode;}
                     else{
                         if(index<=0){
                             newNode.next=head;
                             head=newNode;
                         }
                         else{
                             Node A1=null ;
                             Node A2= head;
                             int mevcut=0;
                             while(mevcut<index && A2!= null)
                             {
                                 A1=A2;
                                 A2=A2.next;
                                 mevcut++;
                             }
                             A1.next=newNode;
                             newNode.next=A2;
                         }
                     }
                 }
                 
                 
                 
                 
                  public void deleteHead(){
                    if (isEmpty())
                       {System.out.println("Bag is Empty");}
                    else{
                        Node eleman= head.next;
                        head.next=null;
                        head=eleman;
                    }
                }
                
                
                
                
                
                
                public void deleteTail(){
                   if(isEmpty()){
                       System.out.println("Bag is empty");
                   }
                
                   else{
                       if(head==tail){
                           head=null;
                           tail=null;
                       }
                       else{Node A = head;
                           while(A.next.next!=null){
                              A=A.next;
                            }
                            A.next=null;
                            tail=A;}
                   }  
                }
                
                
                
                
                
                  public void deleteIndex (int index){
                    Node A;
                    Node B;
                                   
                    A=head;
                    B=null;
                        if(index>=0){
                            if(isEmpty()){
                              System.out.println("Bag is empty ");
                            }
                            else{
                               if(index ==0){
                    
                                 B=A.next;
                                 head=B;
                                 A=null;
                               }
                               else{
                                 int mevcut =0;
                 
                                 while(index >mevcut && A.next!=null ){
                                    B=A;
                                    A=A.next;
                                    mevcut++;
                                }
                                    if(index>size()){
                                    System.out.println("index should be smaller than "+ size());
                                    }
                                    else{
                                    B.next=A.next;
                                    A.next=null;}
                               }
                            }
                        }
                        else{
                          System.out.println("index  should be positive");    
                        }
                  }
                  
                  
    
                  
                   public void deleteAValue(h deger){
                
                 if(isContain(deger)){
                 Node A=head;
                 Node B=null;
                
                     if(head.value==deger){
                       deleteHead();
                     }
                      else{
                            while (A.value != deger){
                                B=A;
                                A=A.next;
                            }   
                         B.next=A.next;  
                         A.next=null;
                     }
                }    
                 else{
                    System.out.println("The value there is not in the bag");
                }   }
             
                 
                
                
                
                
                
                 
                 public void deleteAValueAll(h sayi){
                  int x=howMany(sayi);
                    while(x>0){
                      deleteAValue(sayi);
                      x--;
                 }  }
                 
    
                 
                 
                  public boolean isEmpty (){
                      if(head!=null){    
                          return false;
                      }
                      else
                      {return true;}
                  }
     
    
    
               
    
    
    
    
                 public void tostring(){
                     if(isEmpty()){
                         System.out.println("Bag is empty");
                     }
                     else{
                         Node A =head;
                         while(A != null){
                             System.out.print(A.value +" " );
                             A=A.next;
                         }
                     }
                 }
   
    
                 
    
    
    
                 public int size (){
                     Node isaret =head;
                     int mevcut=0;
                     while(isaret != null){
                         isaret=isaret.next;
                         mevcut++;
                     }
                     return mevcut;
                 }
             
        
        
        
        
               
                  
                  
                  
                  
                  
                  
                  
                  
                 public boolean isContain(h sayi){
                  Node A=head;
                    if(isEmpty()){
                     return false;
                    }
                    else{
                        if(sayi==head.value){
                          return true;
                        }
                        else{
                           while(A.next !=null){
                           A=A.next;
                             if(A.value==sayi){
                               return true;
                             }
                            }
                        }
                      return false;
                    }
                 }  
                 
                 
                 
                 
                 
                  
                
               
                 
                 
                
                public int howMany (h value){
                    
                    if(isEmpty())
                    {return 0;}
                    
                    else{
                       if(isContain(value))
                       {
                         Node A=head;
                         int count=0;
                             while(A != null){
                              
                                if(A.value.equals(value))
                                 {count++;}
                             A=A.next;
                             }
                            
                    
                       return count;}
                      else
                       {return 0;    }}  
                    }
                
    
      
                
                
                public static void isEquals(LL L1,LL L2){
                  LL copy1=new LL();
                  LL copy2=new LL();
                  copy1=L1;
                  copy2=L2;
                  Node A=copy1.head;
                  int y=0;
   
                     while(A!=null){
                           Node B=copy2.head;
                           int x=0;
                           int c=copy1.size();
                           int d=c;
                                while(B!=null){
                                        if(B.value.equals(A.value)){
                                            B=B.next;
                                             A=A.next;
                                             copy1.deleteIndex(y);
                                             copy2.deleteIndex(x);
                                             y--;
                                             d--;
                                    break;
                                    }
                                     B=B.next;
                                      x++;
                                     }
                            y++;
                            if(c==d){     A=A.next;
                            } 
                           }
                   if(copy1.isEmpty() && copy2.isEmpty())
                   {System.out.println("Bags are equal ");}
                   else{System.out.println("Bags are not equal");}
    
              }
     
    
    
    
               public void clear(){
                int x = size();
                  while(x>0){
                   deleteHead();
                     x--;
                    }
                  }
   
               
               
    
                public static int distictSize(LL liste){
    
                  LL kopya=liste;
    
                   Node A= kopya.head;
                   Node B= kopya.head.next;
                   int x=1;
    
                     while(A!=null){
    
                          while(B!=null){
                             int a=1;
                               if(A.value.equals(B.value)){
                                 B=B.next;
                                 kopya.deleteIndex(x);
                                 a--; }
                              if(a==1){
                                  B=B.next;
                                  x++;
                                 }
      
                            }
                      A=A.next; 
                      }
                return kopya.size();
                }
   
    
}

