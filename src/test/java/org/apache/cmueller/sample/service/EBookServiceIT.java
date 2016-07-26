package org.apache.cmueller.sample.service;

import static org.junit.Assert.assertEquals;

import java.net.URL;

import javax.xml.namespace.QName;

import org.junit.Before;
import org.junit.Test;

public class EBookServiceIT {

    private EBookStoreImplService eBookStoreService;

    @Before
    public void setUp() throws Exception {
        eBookStoreService = new EBookStoreImplService(
            new URL("http://localhost:8080/ejb-jaxws-sample/EBookStoreImpl?wsdl"),
            new QName("http://endpoint.jaxws.javaee7.org/", "EBookServiceService"));
    }

    @Test
    public void test() {
        EBookStore eBookStore = eBookStoreService.getEBookStoreImplPort();
        String response = eBookStore.welcomeMessage("Jackson");

        assertEquals("We rock!", response);
    }
}