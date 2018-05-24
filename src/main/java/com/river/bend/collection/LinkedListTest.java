package com.river.bend.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {

    public static void main(String[] args){

        List<String> a = new LinkedList<>();

        a.add("Amy");
        a.add("Carl");
        a.add("Erica");


        List<String> b = new LinkedList<>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        ListIterator<String> aIter = a.listIterator();

        Iterator<String> bIter = b.iterator();

        while(bIter.hasNext()){
            if( aIter.hasNext()){
                aIter.next();
            }

            aIter.add(bIter.next());
        }

        System.out.println(a);

    }
}

