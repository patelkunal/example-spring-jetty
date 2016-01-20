package org.coderearth.kitchens.embjetty.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

/**
 * Created by kunal_patel on 20/01/16.
 */
@Configuration
@EnableWebSecurity
@ImportResource({"classpath:webSecurityConfig.xml"})
public class SecurityConfig {

	public SecurityConfig() {
		super();
	}
}
