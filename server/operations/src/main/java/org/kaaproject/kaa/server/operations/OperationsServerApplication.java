/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaaproject.kaa.server.operations;

import java.nio.charset.Charset;

import org.kaaproject.kaa.server.operations.service.bootstrap.OperationsBootstrapService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main class that is used to launch Operations Server.
 */
public class OperationsServerApplication {
    
    /** The Constant logger. */
    private static final Logger LOG = LoggerFactory
            .getLogger(OperationsServerApplication.class);
    
    private static final String DEFAULT_APPLICATION_CONTEXT_XML = "operationsContext.xml";

    /**
     * The main method. Used to launch Operations Server.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        LOG.info("Application starting.. " + Charset.defaultCharset().name());

        String applicationContextXml = DEFAULT_APPLICATION_CONTEXT_XML;
        if (args.length>0) {
            applicationContextXml = args[0];
        }
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(applicationContextXml);
        final OperationsBootstrapService operationsService = (OperationsBootstrapService) ctx
                .getBean("operationsBootstrapService");

        operationsService.start();
        ctx.close();
        LOG.info("Operations Server Application stopped.");
    }
}