package top.futurenotfound.mqtt.demo;

import lombok.extern.slf4j.Slf4j;
import org.eclipse.paho.mqttv5.common.MqttMessage;
import top.futurenotfound.mqtt.client.SubHandler;
import top.futurenotfound.mqtt.client.annotation.Sub;

@Slf4j
@Sub(topic = "mqtt/test", qos = 0)
public class Sub1 implements SubHandler {
    @Override
    public void subscribe(String topic, MqttMessage message) {
        log.info("1:" + topic + ":" + new String(message.getPayload()));
    }
}
