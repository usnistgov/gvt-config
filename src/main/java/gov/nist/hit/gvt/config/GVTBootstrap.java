package gov.nist.hit.gvt.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import gov.nist.hit.core.service.ResourcebundleLoader;

@Service
public class GVTBootstrap {

	
	@Autowired
	@Qualifier("resourceLoader")
	ResourcebundleLoader resourcebundleLoader;
	
	@PostConstruct
	public void init() throws  Exception{
		resourcebundleLoader.load();
	}
	
	
	
//	@Autowired
//	@Qualifier("hl7v2ResourceLoader")
//	ResourcebundleLoader resourcebundleLoader;
//	
//	@Autowired
//	@Qualifier("xmlResourceLoader")
//	ResourcebundleLoader xmlrb;
//	
//	@PostConstruct
//	public void init() throws  Exception{
//		resourcebundleLoader.load();
//		xmlrb.load();
//	}
		
}
