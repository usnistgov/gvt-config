package gov.nist.hit.gvt.config;

import gov.nist.hit.core.service.ResourcebundleLoader;
import gov.nist.hit.core.service.exception.ProfileParserException;

import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GVTBootstrap {

	
	@Autowired
	ResourcebundleLoader resourcebundleLoader;
	
	@PostConstruct
	public void init() throws  ProfileParserException, IOException{
		resourcebundleLoader.load();
	}
		
}
