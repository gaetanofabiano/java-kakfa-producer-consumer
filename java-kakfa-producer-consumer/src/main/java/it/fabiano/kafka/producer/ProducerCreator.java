package it.fabiano.kafka.producer;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.LongSerializer;
import org.apache.kafka.common.serialization.StringSerializer;

import it.fabiano.kafka.constants.IKafkaConstants;
/**
 * Java-kafka-Webinar
 *
 * @author  Gaetano Fabiano
 * @version 1.0.0
 * @since   2021-03-15
 */
public class ProducerCreator {

	public static Producer<Long, String> createProducer() {
		Properties props = new Properties();
		
		props.put(	ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, 
					IKafkaConstants.KAFKA_DISCOVERY_BROKER);
		
		props.put(	ProducerConfig.CLIENT_ID_CONFIG, 
					IKafkaConstants.CLIENT_NAME);
		
		props.put(	ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, 
					LongSerializer.class.getName());
		
		props.put(	ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, 
					StringSerializer.class.getName());
		
		return new KafkaProducer<>(props);
	}
}