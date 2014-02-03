/* 
 * Proposed solution uses artificial intelligence technique where each neuron (node) is 
 * trained trinary algorithm, in particular, and  through out the neural network, in general.
 * This network has one limitation,i.e. it does not accept 0 as in input for the sake of accomodating 
 * the view of the tree structure in to the consol display.
 * 
 */
package trinary;
import java.util.*;

/**
 *
 * @author seifu001
 */
public class TrinaryDriver {
    static Trinary a;
    static Trinary b;
    static Trinary c;
    static Trinary d;
    static Trinary e;
    static Trinary f;
    static Trinary g;
    static Trinary h;
    static Trinary i;
    static Trinary j;
    static Trinary k;
    static Trinary l;
    static Trinary m;
    static Trinary n;
    static Trinary o;
    static Trinary p;
    static Trinary q;
    static Trinary r;
    static Trinary s;
    static Trinary t;
    static Trinary u;
    static Trinary v;
    static Trinary w;
    static Trinary x;
    static Trinary y;
    static Trinary z;
    static Trinary aa;
    static Trinary bb;
    static Trinary cc;
    static Trinary dd;
    static Trinary ee;
    static Trinary ff;
    static Trinary gg;
    static Trinary hh;
    static Trinary ii;
    static Trinary jj;
    static Trinary kk;
    static Trinary ll;
    static Trinary mm;
    static Trinary nn;
    
    
 
    public static void main (String[]args){
         Scanner in = new Scanner(System.in);
    
    // max value set to 40 to accomodate pre-defined node structure     
    int []val= new int[40];
    int count=0; 
    System.out.println("(ps. 0 isn't valid for this structure).When you are done inserting node values, enter 111");
    while(count<40){
     System.out.println("element "+(count+1) +" : ");
         val[count]=in.nextInt();
         if (val[count]==111){
             break;
         }
         count++;    
      }
      int cap=count;
            
      
      //Instantiate new node structure
      nn =new Trinary(0,null,null,null);
      mm =new Trinary(0,null,null,null);
      ll =new Trinary(0,null,null,null);
      kk =new Trinary(0,null,null,null);
      jj =new Trinary(0,null,null,null);
      ii =new Trinary(0,null,null,null);
      hh =new Trinary(0,null,null,null);
      gg =new Trinary(0,null,null,null);
      ff =new Trinary(0,null,null,null);
      ee =new Trinary(0,null,null,null);
      dd =new Trinary(0,null,null,null);
      cc =new Trinary(0,null,null,null);
      bb =new Trinary(0,null,null,null);
      aa =new Trinary(0,null,null,null);
      z =new Trinary(0,null,null,null);
      y =new Trinary(0,null,null,null);
      x =new Trinary(0,null,null,null);
      w =new Trinary(0,null,null,null);
      v =new Trinary(0,null,null,null);
      u =new Trinary(0,null,null,null);
      t =new Trinary(0,null,null,null);
      s =new Trinary(0,null,null,null);
      r =new Trinary(0,null,null,null);
      q =new Trinary(0,null,null,null);
      p =new Trinary(0,null,null,null);
      o =new Trinary(0,null,null,null);
      n =new Trinary(0,null,null,null);
      m =new Trinary(0,ll,mm,nn);
      l =new Trinary(0,ii,jj,kk);
      k =new Trinary(0,ff,gg,hh);
      j =new Trinary(0,cc,dd,ee);
      i =new Trinary(0,z,aa,bb);
      h =new Trinary(0,w,x,y);
      g =new Trinary(0,t,u,v);
      f =new Trinary(0,q,r,s);
      e =new Trinary(0,n,o,p);
      d =new Trinary(0,k,l,m); 
      c =new Trinary(0,h,i,j);
      b =new Trinary(0,f,g,h);
      a =new Trinary(0,b,c,d);  // root
    
    //train each node trinary algo  
    build(val,cap);
    
    //Display node values
    print();
    
    System.out.println(" Add a node vale (0 isnt a valid entry).");
    int ins=in.nextInt();
    
   
    insert(ins,cap,val);
    System.out.println("Updated trinary");
    print();
   
    
    System.out.println("Enter the node value you want to delete. Follow next command for duplicates!");
    int del=in.nextInt();
    System.out.println("If no duplicates, enter 0. If value has duplicates, enter 1(for the peak node in the level you are in), 2(for the one appearing underneath), 3(third value), and 4(if the duplicate is located at the leaf level)");
    System.out.println("For example, if the tree has two duplicates 5,4,9,5,7,2,2 and wanted to delete 2 locatd at the leaf level, enter 2!");
    System.out.println("For example, if the tree has three duplicates 5,4,5,5,7,2,2 and wanted to delete 5 locatd at very bottom(i.e. the third one), enter 3! If you wanted to delete the peak from the duplicates (the 1st appearing one), enter 1!");
    System.out.println("...enter your command:");
    
    int depth=in.nextInt();
    cap=cap+1;
    delete(del,cap,val,depth);
    print();
   
    }
    
    /**
     * Prints the node
     * @param none
     * @return void
    */
    public static void print(){
       //root , level 0
           System.out.println("\t\t\t\t  "+a.value);
       
       //level 1
           System.out.println("\t  "+b.value+"\t \t          "+c.value+ "\t\t          "+d.value);
       
       //level 2
           System.out.println("  "+e.value+"  \t  "+f.value+ "\t   "+g.value +"\t  "+h.value+"\t  "+i.value+ "\t  "+j.value+"\t  "+k.value+"\t  "+l.value+ "\t  "+m.value);
    
       
       //level 3
           System.out.println(n.value+" "+o.value+" "+p.value+"\t"+q.value+" "+r.value+" "+s.value+"\t"+t.value+" "+u.value+" "+v.value+"\t"+w.value+" "+x.value+" "+y.value+"\t"+z.value+" "+aa.value+" "+bb.value+"\t"+cc.value+" "+dd.value+" "+ee.value+"\t"+ff.value+" "+gg.value+" "+hh.value+"\t"+ii.value+" "+jj.value+" "+kk.value+"\t"+ll.value+" "+mm.value+" "+nn.value);
    
    
   
   }
    
    /**
     * Trinary algorithm: if less than parent, be on left; if greater than parent, be on left; if equal to parent,be on middle
     * @param Integer Array
     * @param Integer size of inserted elements
     * @return void
    */
    public static void build(int[] ele, int cap){
        a.value=ele[0];
    for(int num=1;num<cap;num++){  
        // The code from hear after in the for loop checks if any inserted value is to be greater or less than the root (a.value). then on each subsequent node
        // (either going right,left, or middle), check is particular node is zero (and assign the node that location), if its not zero, check if there are candidate
        //children nodes to assign to
        if(ele[num]>a.value){
                    
                    if(d.value==0)
                        d.value=ele[num];
                    else if (d.value!=0){
                            
                            if(ele[num]>d.value){
                                if(m.value==0)
                                    m.value=ele[num];
                                else if(m.value!=0){
                                    if(ele[num]>m.value)
                                        nn.value=ele[num];
                                    else if(ele[num]<m.value)
                                        ll.value=ele[num];
                                    else if(ele[num]==m.value)
                                        mm.value=m.value;
                                }
                            }
                           else if(ele[num]<d.value){
                                if(k.value==0)
                                    k.value=ele[num];
                                else if(k.value!=0){
                                    if(ele[num]>k.value)
                                        hh.value=ele[num];
                                    else if(ele[num]<k.value)
                                        ff.value=ele[num];
                                    else if(ele[num]==k.value)
                                        gg.value=ele[num];
                                }
                            }
                            else if (ele[num]==d.value){
                                if(l.value==0)
                                    l.value=ele[num];
                                else if (l.value!=0){
                                    if(ele[num]>l.value)
                                        ii.value=ele[num];
                                    else if(ele[num]<l.value)
                                        kk.value=ele[num];
                                    else if(ele[num]==jj.value)
                                        jj.value=ele[num];
                                }      
                            }
                    }
              
        }
        else if(ele[num]<a.value){
                    if(b.value==0)
                        b.value=ele[num];
                    else if(b.value!=0){
                            if(ele[num]>b.value){
                                if(g.value==0)
                                    g.value=ele[num];
                                else if(g.value!=0){
                                    if(ele[num]>g.value)
                                       v.value=ele[num];
                                    else if(ele[num]<g.value)
                                        t.value=ele[num];
                                    else if(ele[num]==g.value)
                                        u.value=ele[num];
                                  }
                            }
                            else if(ele[num]<b.value){
                                 if(e.value==0)
                                     e.value=ele[num];
                                 else if(e.value!=0){
                                     if(ele[num]<e.value)
                                         n.value=ele[num];
                                     else if(ele[num]>e.value)
                                         p.value=ele[num];
                                     else if(ele[num]==e.value)
                                         o.value=ele[num];
                                 }
                            }
                            else if(ele[num]==b.value){
                                 if(f.value==0)
                                     f.value=ele[num];
                                 else if(f.value!=0){
                                     if(ele[num]<f.value)
                                         q.value=ele[num];
                                     else if(ele[num]>f.value)
                                         s.value=ele[num];
                                     else if(ele[num]==f.value)
                                         r.value=ele[num];
                                 }
                            }
                    }
            
                    
        }
        else if(ele[num]==a.value){
                  if(c.value==0)
                      c.value=ele[num];
                  else if(c.value!=0){
                        if(ele[num]<c.value){
                              if(h.value==0)
                                  h.value=ele[num];
                              else if(h.value!=0){
                                  if(ele[num]<h.value)
                                      w.value=ele[num];
                                  else if(ele[num]>h.value)
                                      y.value=ele[num];
                                  else if(ele[num]==h.value)
                                      x.value=ele[num];
                              }
                         }
                        else if(ele[num]>c.value){
                               if(j.value==0)
                                   j.value=ele[num];
                               else if(j.value!=0){
                                   if(ele[num]<j.value)
                                       cc.value=ele[num];
                                   else if(ele[num]>j.value)
                                       ee.value=ele[num];
                                   else if(ele[num]==j.value)
                                       dd.value=ele[num];
                               }
                        }
                        else if(ele[num]==c.value){
                                if(i.value==0)
                                    i.value=ele[num];
                                else if(i.value!=0){
                                    if(ele[num]<i.value)
                                        z.value=ele[num];
                                    else if(ele[num]>i.value)
                                        bb.value=ele[num];
                                    else if(ele[num]==i.value)
                                        aa.value=ele[num];
                                }
                        }    
                      
                  }                      
        }   
    }     
  
  }
   
    /**
     * 
     * @param Integer
     * @param Integer
     * @param Integer Array
     * @return void
    */
  public static void insert(int ins, int num, int[]ele){
    //insert new element
    ele[num]=ins;        
       // The code from hear after checks if any inserted value is to be greater or less than the root (a.value). then on each subsequent node
        // (either going right,left, or middle), check is particular node is zero (and assign the node that location), if its not zero, check if there are candidate
        //children nodes to assign to
        if(ele[num]>a.value){
                    if(d.value==0)
                        d.value=ele[num];
                    else if (d.value!=0){
                            if(ele[num]>d.value){
                                if(m.value==0)
                                    m.value=ele[num];
                                else if(m.value!=0){
                                    if(ele[num]>m.value)
                                        nn.value=ele[num];
                                    else if(ele[num]<m.value)
                                        ll.value=ele[num];
                                    else if(ele[num]==m.value)
                                        mm.value=m.value;
                                }
                            }
                           else if(ele[num]<d.value){
                                if(k.value==0)
                                    k.value=ele[num];
                                else if(k.value!=0){
                                    if(ele[num]>k.value)
                                        hh.value=ele[num];
                                    else if(ele[num]<k.value)
                                        ff.value=ele[num];
                                    else if(ele[num]==k.value)
                                        gg.value=ele[num];
                                }
                            }
                            else if (ele[num]==d.value){
                                if(l.value==0)
                                    l.value=ele[num];
                                else if (l.value!=0){
                                    if(ele[num]>l.value)
                                        ii.value=ele[num];
                                    else if(ele[num]<l.value)
                                        kk.value=ele[num];
                                    else if(ele[num]==jj.value)
                                        jj.value=ele[num];
                                }      
                            }
                    }
              
        }
        else if(ele[num]<a.value){
                    if(b.value==0)
                        b.value=ele[num];
                    else if(b.value!=0){
                            if(ele[num]>b.value){
                                if(g.value==0)
                                    g.value=ele[num];
                                else if(g.value!=0){
                                    if(ele[num]>g.value)
                                       v.value=ele[num];
                                    else if(ele[num]<g.value)
                                        t.value=ele[num];
                                    else if(ele[num]==g.value)
                                        u.value=ele[num];
                                  }
                            }
                            else if(ele[num]<b.value){
                                 if(e.value==0)
                                     e.value=ele[num];
                                 else if(e.value!=0){
                                     if(ele[num]<e.value)
                                         n.value=ele[num];
                                     else if(ele[num]>e.value)
                                         p.value=ele[num];
                                     else if(ele[num]==e.value)
                                         o.value=ele[num];
                                 }
                            }
                            else if(ele[num]==b.value){
                                 if(f.value==0)
                                     f.value=ele[num];
                                 else if(f.value!=0){
                                     if(ele[num]<f.value)
                                         q.value=ele[num];
                                     else if(ele[num]>f.value)
                                         s.value=ele[num];
                                     else if(ele[num]==f.value)
                                         r.value=ele[num];
                                 }
                            }
                    }
            
                    
        }
        else if(ele[num]==a.value){
                  if(c.value==0)
                      c.value=ele[num];
                  else if(c.value!=0){
                        if(ele[num]<c.value){
                              if(h.value==0)
                                  h.value=ele[num];
                              else if(h.value!=0){
                                  if(ele[num]<h.value)
                                      w.value=ele[num];
                                  else if(ele[num]>h.value)
                                      y.value=ele[num];
                                  else if(ele[num]==h.value)
                                      x.value=ele[num];
                              }
                         }
                        else if(ele[num]>c.value){
                               if(j.value==0)
                                   j.value=ele[num];
                               else if(j.value!=0){
                                   if(ele[num]<j.value)
                                       cc.value=ele[num];
                                   else if(ele[num]>j.value)
                                       ee.value=ele[num];
                                   else if(ele[num]==j.value)
                                       dd.value=ele[num];
                               }
                        }
                        else if(ele[num]==c.value){
                                if(i.value==0)
                                    i.value=ele[num];
                                else if(i.value!=0){
                                    if(ele[num]<i.value)
                                        z.value=ele[num];
                                    else if(ele[num]>i.value)
                                        bb.value=ele[num];
                                    else if(ele[num]==i.value)
                                        aa.value=ele[num];
                                }
                        }    
                      
                  }                      
        }  
    
  }  
    /**
     * Deletion algorithms for a Trinary are:
     * if node has no children: remove node
     * if node has one child: remove and link child node to parent node
     * if node has two children: replace with the smallest node value located on the right
     * if node has equivalent value as a child, replace it with its child node, following the above three rules
     * The alogrithm below simplifies and packages the above four rules in its implementation
     * 
     * @param Integer
     * @param Integer
     * @param Integer Array
     * @param Integer
     * @return void
    */
  public static void delete(int del,int cap,int[]old,int depth){
      int []ele=new int[cap];  
  
  //Reset the node structure values to zero.     
  a.value=0;
  b.value=0;
  c.value=0;
  d.value=0;
  e.value=0;
  f.value=0;
  g.value=0;
  h.value=0;
  i.value=0;
  j.value=0;
  k.value=0;
  l.value=0;
  m.value=0;
  n.value=0;
  o.value=0;
  p.value=0;
  q.value=0;
  r.value=0;
  s.value=0;
  t.value=0;
  u.value=0;
  v.value=0;
  w.value=0;
  x.value=0;
  y.value=0;
  z.value=0;
  aa.value=0;
  bb.value=0;
  cc.value=0;
  dd.value=0;
  ee.value=0;
  ff.value=0;
  gg.value=0;
  hh.value=0;
  ii.value=0;
  jj.value=0;
  kk.value=0;
  ll.value=0;
  mm.value=0;
  nn.value=0;
  
  //Deletion algorithms for a Trinary are:
  // if node has no children: remove node
  // if node has one child: remove and link chil node to parent node
  // if node has two children: replace with the smallest node value located on the right
  // if node has equivalent value as a child, replace it with its child node, following the above three rules
  
  //The alogrithm below simplifies and packages the above four rules in its implementation
  int tracker=0;
  int repeating=0;
  int set=0;
  
  
  if (depth==0){
      //if there are no duplicates
        for(int num=0;num<cap;num++){
               if(old[num]!=del){
                   ele[set]=old[num];
                   set++;
                   
               }         
           }  
  }else {
      //if there are duplicates, identify the location where deletion is needed
            if (depth ==1){
                    for(int find=0;find<cap;find++){
                       if(old[find]==del){
                                  tracker++;
                                  
                              }
                    }
                        if(tracker==2 ){          
                            for(int num=0;num<cap;num++){
                                if(old[num]!=del){
                                        ele[set]=old[num];
                                        
                                } 
                                else if(old[num]==del ){
                                     repeating ++;
                                    if (repeating !=2){
                                        ele[set]=old[num]; 
                                        
                                    }
                                    else if(repeating==2){
                                        ele[set]=old[num+1];
                                        num++;
                                    }
                                } 
                             
                                    set++;    
                                   
                            }
                         }
                  }
            else if(depth==2){
                for(int find=0;find<cap;find++){
                       if(old[find]==del){
                                  tracker++;
                                  
                              }
                    }
                        if(tracker==3 ){          
                            for(int num=0;num<cap;num++){
                                if(old[num]!=del){
                                        ele[set]=old[num];
                                        
                                } 
                                else if(old[num]==del ){
                                     repeating ++;
                                    if (repeating !=3){
                                        ele[set]=old[num]; 
                                        
                                    }
                                    else if(repeating==3){
                                        ele[set]=old[num+1];
                                        num++;
                                    }
                                } 
                             
                                    set++;    
                                   
                            }
                         }
                        else if(tracker!=3){
                            for(int num=0;num<cap;num++){
                                if(old[num]!=del){
                                        ele[set]=old[num];
                                        
                                } 
                                else if(old[num]==del ){
                                     repeating ++;
                                    if (repeating !=2){
                                        ele[set]=old[num]; 
                                        
                                    }
                                    else if(repeating==2){
                                        ele[set]=old[num+1];
                                        num++;
                                    }
                                } 
                             
                                    set++;    
                                   
                            }
                        }
                  
            }
            else if (depth==3){
                for(int find=0;find<cap;find++){
                       if(old[find]==del){
                                  tracker++;
                                  
                              }
                    }
                        if(tracker==4 ){          
                            for(int num=0;num<cap;num++){
                                if(old[num]!=del){
                                        ele[set]=old[num];
                                        
                                } 
                                else if(old[num]==del ){
                                     repeating ++;
                                    if (repeating !=4){
                                        ele[set]=old[num]; 
                                        
                                    }
                                    else if(repeating==4){
                                        ele[set]=old[num+1];
                                        num++;
                                    }
                                } 
                             
                                    set++;                                       
                           }
                         }
                        else if(tracker!=4){
                            for(int num=0;num<cap;num++){
                                if(old[num]!=del){
                                        ele[set]=old[num];
                                        
                                } 
                                else if(old[num]==del ){
                                     repeating ++;
                                    if (repeating !=3){
                                        ele[set]=old[num]; 
                                        
                                    }
                                    else if(repeating==3){
                                        ele[set]=old[num+1];
                                        num++;
                                    }
                                } 
                             
                                    set++;    
                                   
                            }
                        }
            }
            else if (depth==4){
                 for(int find=0;find<cap;find++){
                       if(old[find]==del){
                                  tracker++;
                                  
                              }
                    }
                  if (tracker==4){
                        for(int num=0;num<cap;num++){
                                if(old[num]!=del){
                                        ele[set]=old[num];
                                        
                                } 
                                else if(old[num]==del ){
                                     repeating ++;
                                    if (repeating !=4){
                                        ele[set]=old[num]; 
                                        
                                    }
                                    else if(repeating==4){
                                        ele[set]=old[num+1];
                                        num++;
                                    }
                                } 
                             
                                    set++;    
                                   
                            }
                  }
            }
  }
  
  build(ele,ele.length);
   
  } 
  
}
