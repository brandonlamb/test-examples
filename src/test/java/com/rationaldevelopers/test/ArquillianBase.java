package com.rationaldevelopers.test;

import org.arquillian.cube.DockerUrl;
import org.arquillian.cube.HostIp;
import org.arquillian.cube.docker.impl.requirement.RequiresDockerMachine;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.runner.RunWith;

import java.net.URL;

/**
 * @author Rational Developers
 * @author Ryan McGuinness [rmcguinness(at)rationaldevelopers.com]
 * @version 6/19/17
 */
@RunWith(Arquillian.class)
@RequiresDockerMachine(name = "default")
public abstract class ArquillianBase {

  @Deployment(testable=false)
  public static WebArchive createArchive() {
    return ShrinkWrap.create(WebArchive.class, "test.war")
        .addPackages(true, "com.rationaldevelopers");
  }

  @HostIp
  String ip;

  @DockerUrl(containerName = "tomee", exposedPort = 8080)
  @ArquillianResource
  private URL url;
}
