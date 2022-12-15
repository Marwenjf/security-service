package com.cni.insaf.securityservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
@ConfigurationProperties(prefix = "rsa")
@Data
public class RsakeysConfig {
	RSAPublicKey publicKey; 
	RSAPrivateKey privateKey;
}
