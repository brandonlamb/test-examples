package com.rationaldevelopers.test;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author Rational Developers
 * @author Ryan McGuinness [rmcguinness(at)rationaldevelopers.com]
 * @version 6/19/17
 */
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JsonProvider extends JacksonJaxbJsonProvider {

}
