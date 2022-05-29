package com.wbg.springboot_kafka;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

import java.util.Properties;

// succeed!
public class Producer1 {

    public static void main(String[] args) {
        //配置信息
        Properties props = new Properties();
        //kafka服务器地址
        props.put("bootstrap.servers", "localhost:9092");
        //设置数据key和value的序列化处理类
        props.put("key.serializer", StringSerializer.class);
        props.put("value.serializer", StringSerializer.class);
        //创建生产者实例
        KafkaProducer<String,String> producer = new KafkaProducer<>(props);
        ProducerRecord record = new ProducerRecord<String, String>("topic1", "userName", "lc");
        //发送记录
        producer.send(record);
        producer.close();
    }
}