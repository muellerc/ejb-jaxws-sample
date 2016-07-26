package org.apache.cmueller.sample.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import org.apache.camel.CamelContext;
import org.apache.camel.EndpointInject;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.cdi.ContextName;
import org.apache.cmueller.sample.model.EBook;

@Stateless
@WebService(endpointInterface = "org.apache.cmueller.sample.service.EBookStore",
    targetNamespace = "http://endpoint.jaxws.javaee7.org/",
    name = "EBookStoreImpl")
public class EBookService implements EBookStore {

    @Inject
    @ContextName("ebook-context")
    private CamelContext context;

    @EndpointInject(uri = "direct:welcomeMessage")
    private ProducerTemplate welcomeMessageProxy;

    @Override
    public String welcomeMessage(String parameters) {
        return welcomeMessageProxy.requestBody((Object) parameters, String.class);
    }

    @Override
    public List<String> findEBooks(String arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EBook takeBook(String arg0) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void saveBook(EBook arg0) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public EBook addAppendix(EBook arg0, int arg1) {
        // TODO Auto-generated method stub
        return null;
    }

}