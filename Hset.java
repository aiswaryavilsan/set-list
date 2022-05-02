package com.learn;

import java.util.*;

class Hset {
    public static void main(String[] args) {
        HashSet<String> fruit_set = new HashSet<String>();
        fruit_set.add("Apple");
        fruit_set.add("Orange");
        fruit_set.add("Mango");
        fruit_set.add("Grape");
        System.out.println("HashSet:" + fruit_set);
        System.out.println("Size of hashset is:"+fruit_set.size());
        fruit_set.remove("Orange");
        System.out.println("HashSet after removal: " + fruit_set);
        System.out.println("is Mango available in fruit_set:"+fruit_set.contains("Mango"));
        System.out.println("is fruit_set empty:"+fruit_set.isEmpty());

        int n = fruit_set.size();
        List<String> fruit_list = new ArrayList<String>(n);
        for (String x : fruit_set)
            fruit_list.add(x);
        fruit_list.add("Banana");
        fruit_list.add(1, "Blueberry");
        Iterator i=fruit_list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
            Collections.reverse(fruit_list);
            System.out.println(fruit_list);
        }

    }
}