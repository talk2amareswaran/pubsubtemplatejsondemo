package com.educative.pubsubtemplatejsondemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PubSubRestController {

	@Autowired
	OutboundMessagingGateway outboundMessagingGateway;

	@PostMapping("/publish")
	public String publishMessage(@RequestBody Order order) {
		outboundMessagingGateway.sendToPubsub(order);
		return "Message published into the Google Cloud Pub/Sub topic";
	}

}
