package fr.dauphine.ja.serrafgabriel.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class Maximum {
    
    public static <T extends Comparable<T>> T myMax(T t1,T... tab){
        
        T currentMax = t1;
        for(T t : tab){
            if(t.compareTo(currentMax) > 0){
                currentMax = t;
            }
        }
        return currentMax;
    }
    
    private static <T> void print(List<T> list){
        for(T t : list){
            System.out.println(t);
        }
    }
    
    private static void lengthDisplay(List<? extends CharSequence> list){
        for(CharSequence s : list){
            System.out.println(s.length());
        }
    }
    
    public static <T extends CharSequence> List<Integer> listLength(List<T> list) {
        
        ArrayList<Integer> length=new ArrayList();
        for(T t : list) {
            length.add(t.length());
        }
        return length;
    }
    
    public static List<Integer> listLength2(List<? extends CharSequence> list) {
        
        ArrayList<Integer> length=new ArrayList();
        for(CharSequence s : list) {
            length.add(s.length());
        }
        return length;
    }

    
    private static <T, T1 extends T, T2 extends T> List<T> fusion(List<T1> l1, List<T2> l2){
        List<T> list = new ArrayList<T>();
        
        Iterator<T1> it1 = l1.iterator();
        Iterator<T2> it2 = l2.iterator();
        
        while(it1.hasNext() && it2.hasNext()){
            list.add(it1.next());
            list.add(it2.next());
        }
        
        return list;
    }
    
    
    public <T> void swap(List<T> list, int i, int j){
        if(i >= list.size() || j >= list.size() || i < 0 || j < 0){
            throw new IndexOutOfBoundsException("i or j is out of bounds");
        }
        
        T t1 = list.get(i);
        T t2 = list.get(j);
        
        list.set(i, t2);
        list.set(j, t1);
        
    }
    
    
    public <T> void shuffle(List<T> list){
        
        Random random = new Random();
        
        for(int i = 1; i < list.size(); i++){
            int j = random.nextInt(i + 1);
            swap(list, i , j);
        }
       
    }
    
    public static void main( String[] args ) {
        
        // exo 1
        System.out.println(myMax(42,1664)); //1664
        System.out.println(myMax(2014,86,13)); //2014
        System.out.println(myMax(8.6,16.64)); //16.64
        System.out.println(myMax("baa", "aba")); //aba
        //System.out.println(myMax(8.6, "aba")); // ko !
        
        // exo 2
        List<String> list=Arrays.asList("foo", "toto");
        print(list);

        // exo 3
        List l=Arrays.asList("colonel", "reyel");
        System.out.println(listLength(l));
        System.out.println(listLength2(l));
        
        // exo 4
        List<String> l1= Arrays.asList("C", "rc");
        List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
        List<? extends CharSequence> r1=fusion(l1,l2);
        r1.forEach(System.out::println);
        List<?> r2=fusion(l1,l2);
        r2.forEach(System.out::println);
        List<Integer> l3 = Arrays.asList(1,2);
        List<Integer> l4 = Arrays.asList(10,20);
        List<Integer> r3 = fusion(l3,l4);
        r3.forEach(System.out::println);
        List<?> r4 = fusion(l1,l3);
        r4.forEach(System.out::println);

    }
}
