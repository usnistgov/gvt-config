package gov.nist.hit.gvt.config;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.core.JsonProcessingException;

import gov.nist.hit.core.hl7v2.service.HL7V2MessageParser;
import gov.nist.hit.core.hl7v2.service.HL7V2MessageValidator;
import gov.nist.hit.core.hl7v2.service.HL7V2ResourceLoader;
import gov.nist.hit.core.hl7v2.service.HL7V2ValidationConfigurationService;
import gov.nist.hit.core.hl7v2.service.HL7V2ValidationReportConverter;
import gov.nist.hit.core.hl7v2.service.impl.HL7V2MessageParserImpl;
import gov.nist.hit.core.hl7v2.service.impl.HL7V2MessageValidatorImpl;
import gov.nist.hit.core.hl7v2.service.impl.HL7V2ResourceLoaderImpl;
import gov.nist.hit.core.hl7v2.service.impl.HL7V2ValidationConfigurationServiceImpl;
import gov.nist.hit.core.hl7v2.service.impl.HL7V2ValidationReportConverterImpl;
import gov.nist.hit.core.service.ResourceLoader;
import gov.nist.hit.core.service.exception.ProfileParserException;
import gov.nist.hit.core.service.xml.XMLMessageParser;
import gov.nist.hit.core.service.xml.XMLMessageParserImpl;
import gov.nist.hit.core.service.xml.XMLMessageValidator;
import gov.nist.hit.core.service.xml.XMLMessageValidatorImpl;
import gov.nist.hit.core.service.xml.XMLResourceLoader;
import gov.nist.hit.core.service.xml.XMLResourceLoaderImpl;
import gov.nist.hit.core.service.xml.XMLValidationReportConverter;
import gov.nist.hit.core.service.xml.XMLValidationReportConverterImpl;
import gov.nist.hit.gvt.core.GVTResourceLoaderImpl;

@Configuration
public class GVTWebBeanConfig {

	// GVT Specific

	@Bean(name = "resourceLoader")
	public ResourceLoader resourceLoader() throws JsonProcessingException, ProfileParserException, IOException {
		return new GVTResourceLoaderImpl();
	}

	// HL7V2
	@Bean(name = "hl7v2ResourceLoader")
	public HL7V2ResourceLoader hl7v2ResourceLoader() throws JsonProcessingException, ProfileParserException, IOException {
		return new HL7V2ResourceLoaderImpl();
	}

	@Bean
	public HL7V2ValidationReportConverter hl7v2ValidationReportConverter() {
		return new HL7V2ValidationReportConverterImpl();
	}

	@Bean
	public HL7V2MessageValidator hl7v2MessageValidator() {
		return new HL7V2MessageValidatorImpl();
	}

	@Bean
	public HL7V2MessageParser hl7v2MessageParser() {
		return new HL7V2MessageParserImpl();
	}
	
	@Bean
	public HL7V2ValidationConfigurationService hL7V2ValidationConfigurationService() {
		return new HL7V2ValidationConfigurationServiceImpl();
	}

	// XML specific
	@Bean(name = "xmlResourceLoader")
	public XMLResourceLoader xmlResourceLoader() {
		return new XMLResourceLoaderImpl();
	}

	@Bean
	public XMLValidationReportConverter xmlValidationReportConverter() {
		return new XMLValidationReportConverterImpl();
	}

	@Bean
	public XMLMessageValidator xmlMessageValidator() {
		return new XMLMessageValidatorImpl();
	}

	@Bean
	public XMLMessageParser xmlMessageParser() {
		return new XMLMessageParserImpl();
	}

}
