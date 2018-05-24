package com.river.bend.rocketmqex;

import com.alibaba.rocketmq.client.exception.MQClientException;
import com.alibaba.rocketmq.client.producer.DefaultMQProducer;
import com.alibaba.rocketmq.client.producer.SendResult;
import com.alibaba.rocketmq.common.message.Message;

public class ProducerMain {

    public static void main(String[] args) throws MQClientException {


        DefaultMQProducer defaultMQProducer = new DefaultMQProducer();

        defaultMQProducer.setNamesrvAddr("127.0.0.1:9876");
        defaultMQProducer.setRetryTimesWhenSendFailed(5);
        defaultMQProducer.setProducerGroup("luha");
        defaultMQProducer.start();
        for(int i=0;i<5;i++){
            Message message = new Message("TopicQuickStart","TagTest",("hello world"+i).getBytes());

            try{
                SendResult result = defaultMQProducer.send(message);
                System.out.println(result);

            }catch (Exception e){
                e.printStackTrace();
            }
        }

        defaultMQProducer.shutdown();
    }
}
