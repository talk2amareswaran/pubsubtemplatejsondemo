package com.educative.pubsubtemplatejsondemo;

import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(defaultRequestChannel = "pubsubOutputChannel")
public interface OutboundMessagingGateway {
	void sendToPubsub(Order order);
}