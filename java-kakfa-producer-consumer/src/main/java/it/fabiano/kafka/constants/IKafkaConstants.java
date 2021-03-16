package it.fabiano.kafka.constants;
/**
 * Java-kafka-Webinar
 *
 * @author  Gaetano Fabiano
 * @version 1.0.0
 * @since   2021-03-15
 */
public interface IKafkaConstants {
	
	// Kafka config
	
	public static String KAFKA_DISCOVERY_BROKER = "localhost:9092";
	
	public static Integer MESSAGE_COUNT=1000;
	
	public static String CLIENT_NAME="client1";
	
	public static String TOPIC_NAME="topic";
	
	public static String CONSUMER_GROUP="consumerGroup10";
	
	
	
	public static Integer MAX_NO_MESSAGE_FOUND_COUNT=100;
	
	public static String OFFSET_RESET_LATEST="latest";
	
	public static String OFFSET_RESET_EARLIER="earliest";
	
	public static Integer MAX_POLL_RECORDS=1;
}
