
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.kaustuv.poc.ws.service.greetings;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.5.2
 * 2013-04-01T12:15:24.245+05:30
 * Generated source version: 2.5.2
 * 
 */

@javax.jws.WebService(
                      serviceName = "GreetingsService",
                      portName = "GreetingsPort",
                      targetNamespace = "http://poc.kaustuv.com/ws/service/greetings",
                      wsdlLocation = "WEB-INF/wsdl/Sample.wsdl",
                      endpointInterface = "com.kaustuv.poc.ws.service.greetings.Greetings")
                      
public class GreetingsImpl implements Greetings {

    private static final Logger LOG = Logger.getLogger(GreetingsImpl.class.getName());

    /* (non-Javadoc)
     * @see com.kaustuv.poc.ws.service.greetings.Greetings#greetings(com.kaustuv.poc.ws.service.greetings.GreetingsRequest  parameterIn )*
     */
    public com.kaustuv.poc.ws.service.greetings.GreetingsResponse greetings(GreetingsRequest parameterIn) { 
        LOG.info("Executing operation greetings");
        System.out.println(parameterIn);
        try {
            com.kaustuv.poc.ws.service.greetings.GreetingsResponse _return = null;
            _return = new GreetingsResponse();
            _return.setMessage(parameterIn.getName());
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
