/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5_8;
import java.util.Scanner;
import java.util.*;

/**
 *
 * @author ppapa
 */
public class Homework5_8 {
    public static int i,m,j,g,h,s;
    public static int p,k;
    public static String p1,p2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Give The Name of the first Player:");
        p1 = in.nextLine();
        System.out.println("Give The Name of the first Player2:");
        p2 = in.nextLine();
        System.out.println("\n\n\n\n");
        for(i=0;i<3;i++){
        list.add(" ");
        list2.add(" ");
        list3.add(" ");
        }
        do{
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
        if(m == 0){
            System.out.println(p1+" turn!!");
        }else if(m ==1){
             System.out.println(p2+" turn!!");
        }
        System.out.println("Horizontal:");
        p = in.nextInt();
        System.out.println("Vertically:");
        k = in.nextInt();
        if(m==0){
        if(p==1){
            if(k==1){
                if(list.get(0) != "x" && list.get(0) != "o"){
                    m=1;
                    s +=1;
                
                list.set(0,"x");
                }
            }else if(k==2){
                if(list.get(1) != "x" && list.get(1) != "o"){
                    m=1;
               s +=1;
                list.set(1,"x");
                }
            }else if(k==3){
                if(list.get(2) != "x" && list.get(2) != "o"){
                    m=1;
                s +=1;
                list.set(2,"x");
                }
            }
        }else if(p==2){
            if(k==1){
               if(list2.get(0) != "x" && list2.get(0) != "o"){
                    m=1;
                s +=1;
                list2.set(0,"x");
               }
            }else if(k==2){
                if(list2.get(1) != "x" && list2.get(1) != "o"){
                    m=1;
               s +=1;
                list2.set(1,"x");
                }
            }else if(k==3){
                if(list2.get(2) != "x" && list2.get(2) != "o"){
                    m=1;
               s +=1;
                list2.set(2,"x");
                }
            }
        }else if(p==3){
            if(k==1){
               if(list3.get(0) != "x" && list3.get(0) != "o"){
                    m=1;
                s +=1;
                list3.set(0,"x");
               }
            }else if(k==2){
                if(list3.get(1) != "x" && list3.get(1) != "o"){
                    m=1;
               s +=1;
                list3.set(1,"x");
                }
            }else if(k==3){
               if(list3.get(2) != "x" && list3.get(2) != "o"){
                    m=1;
               s +=1;
                list3.set(2,"x");
               }
            }
        }
        }else {
            if(p==1){
            if(k==1){
                if(list.get(0) != "x" && list.get(0) != "o"){
                    m=0;
                s +=1;
                list.set(0,"o");
                }
            }else if(k==2){
                if(list.get(1) != "x" && list.get(1) != "o"){
                    m=0;
                s +=1;
                list.set(1,"o");
                }
            }else if(k==3){
                if(list.get(2) != "x" && list.get(2) != "o"){
                    m=0;
                s +=1;
                list.set(2,"o");
                }
            }
        }else if(p==2){
            if(k==1){
                if(list2.get(0) != "x" && list2.get(0) != "o"){
                    m=0;
                s +=1;
                list2.set(0,"o");
                }
            }else if(k==2){
               if(list2.get(1) != "x" && list2.get(1) != "o"){
                    m=0;
                s +=1;
                list2.set(1,"o");
               }
            }else if(k==3){
                if(list2.get(2) != "x" && list2.get(2) != "o"){
                    m=0;
                s +=1;
                list2.set(2,"o");
                }
            }
        }else if(p==3){
            if(k==1){
                if(list3.get(0) != "x" && list3.get(0) != "o"){
                    m=0;
                s +=1;
                list3.set(0,"o");
                }
            }else if(k==2){
               if(list3.get(1) != "x" && list3.get(1) != "o"){
                    m=0;
                s +=1;
                list3.set(1,"o");
               }
            }else if(k==3){
               if(list3.get(2) != "x" && list3.get(2) != "o"){
                    m=0;
                s +=1;
                list3.set(2,"o");
               }
            }
        }
        }
        
        if(list.get(0) == "x" && list.get(1) == "x" && list.get(2) == "x" || list2.get(0) == "x" && list2.get(1) == "x" && list2.get(2) == "x" ||list3.get(0) == "x" && list3.get(1) == "x" && list3.get(2) == "x"  || list.get(0) == "x" && list2.get(0) == "x" && list3.get(0) == "x" || list.get(1) == "x" && list2.get(1) == "x" && list3.get(1) == "x" || list.get(2) == "x" && list2.get(2) == "x" && list3.get(2) == "x"|| list.get(0) == "x" && list2.get(1) == "x" && list3.get(2) == "x" || list.get(2) == "x" && list2.get(1) == "x" && list3.get(0) == "x"  ){
            g = 2;
        }
        if(list.get(0) == "o" && list.get(1) == "o" && list.get(2) == "o" || list2.get(0) == "o" && list2.get(1) == "o" && list2.get(2) == "o" ||list3.get(0) == "o" && list3.get(1) == "o" && list3.get(2) == "o"  || list.get(0) == "o" && list2.get(0) == "o" && list3.get(0) == "o" || list.get(1) == "o" && list2.get(1) == "o" && list3.get(1) == "o" || list.get(2) == "o" && list2.get(2) == "o" && list3.get(2) == "o"|| list.get(0) == "o" && list2.get(1) == "o" && list3.get(2) == "o" || list.get(2) == "o" && list2.get(1) == "o" && list3.get(0) == "o"  ){
            g = 3;
            
        }
        if(s == 9){
            if(g==0){
                g=1;
            }
        }
        
        
        
        }while(g==0);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);
        
        
        if(g==1){
            System.out.println("\n\n\nDraw!!!!!");
        }else if(g==2){
             System.out.println("\n\n\n"+ p1 +" is the Winner!!!!!");
        }else{
            System.out.println("\n\n\n"+p2+" is the Winner!!!!!");
        }
        
    }
    
}

