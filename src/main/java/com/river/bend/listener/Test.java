package com.river.bend.listener;

public class Test {

    public static void main(String[] args){
        EventSource eventSource = new EventSource();


        IEventListener iEventListener = new IEventListener() {
            @Override
            public void onclickButton() {
                System.out.println("你点击了按钮");
            }
        };

        eventSource.setiEventListener(iEventListener);
        eventSource.eventHappened();
    }

}
