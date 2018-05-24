package com.river.bend.listener;


/**
 * 事件源: 事件发生的地点
 */
public class EventSource {

    private IEventListener iEventListener;


    public void setiEventListener(IEventListener iEventListener) {
        this.iEventListener = iEventListener;
    }

    public void eventHappened(){
        iEventListener.onclickButton();
    }
}
