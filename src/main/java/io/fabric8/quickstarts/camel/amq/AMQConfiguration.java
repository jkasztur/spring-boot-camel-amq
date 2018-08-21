package io.fabric8.quickstarts.camel.amq;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration parameters filled in from application.properties and overridden using env variables on Openshift.
 */
@Configuration
@ConfigurationProperties(prefix = "amqp")
public class AMQConfiguration {

	/**
	 * Activemq service host
	 */
	private String host;

	/**
	 * Activemq service port
	 */
	private Integer port;

	/**
	 * Activemq username
	 */
	private String username;

	/**
	 * Activemq password
	 */
	private String password;

	public AMQConfiguration() {
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
