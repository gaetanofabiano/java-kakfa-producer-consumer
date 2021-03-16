package it.fabiano.kafka.pojo;

import java.io.Serializable;
/**
 * Java-kafka-Webinar
 *
 * @author  Gaetano Fabiano
 * @version 1.0.0
 * @since   2021-03-15
 */
public class CustomObject implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
