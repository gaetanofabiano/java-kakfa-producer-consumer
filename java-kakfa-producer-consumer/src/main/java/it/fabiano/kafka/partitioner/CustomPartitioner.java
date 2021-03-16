package it.fabiano.kafka.partitioner;

import java.util.Map;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;
/**
 * Java-kafka-Webinar
 *
 * @author  Gaetano Fabiano
 * @version 1.0.0
 * @since   2021-03-15
 */
public class CustomPartitioner implements Partitioner{

	private static final int PARTITION_COUNT=50;
	
	@Override
	public void configure(Map<String, ?> configs) {
		
	}

	// based on An Cluster representation of a subset of the nodes, topics, and partitions in the Kafka cluster.
	@Override
	public int partition(
			String topic, 
			Object key, 
			byte[] keyBytes, 
			Object value, 
			byte[] valueBytes,
			Cluster cluster) {
		
		Integer keyInt=Integer.parseInt(key.toString());
		return keyInt % PARTITION_COUNT;
	}

	@Override
	public void close() {
		
	}

	
}
