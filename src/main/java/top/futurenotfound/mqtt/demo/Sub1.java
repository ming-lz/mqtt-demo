package top.futurenotfound.mqtt.demo;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.mqttv5.common.MqttMessage;
import top.futurenotfound.mqtt.client.SubscribeHandler;
import top.futurenotfound.mqtt.client.annotation.Subscribe;

@Slf4j
@Subscribe(topics = {"mqtt/1"})
public class Sub1 implements SubscribeHandler {
    @Override
    public void onMessage(String topic, MqttMessage message) {
        log.info("1:" + topic + ":" + new String(message.getPayload()));
    }
}
