package net.smart4life.config.client;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@RefreshScope
@Component
@ConfigurationProperties("configclient")
@Getter
@Setter
public class ConfigProps {
	
	@NotNull
	private String helloFrom;

}
