package com.shankarsan.raspi.pin.invoke.consumer;

import org.springframework.kafka.annotation.KafkaListener;

public class RaspiPinInvokeConsumer {

    @KafkaListener(topics = "TP.RASPI.PIN.INVOKE")
    public void listenRaspiPinInvoke() {
        //TODO
    }
}
