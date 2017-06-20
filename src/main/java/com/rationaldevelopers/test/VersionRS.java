package com.rationaldevelopers.test;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author Rational Developers
 * @author Ryan McGuinness [rmcguinness(at)rationaldevelopers.com]
 * @version 6/19/17
 */
@Path("/versions")
public class VersionRS {

  @Inject
  @ApplicationVersion
  private Version version;

  @GET
  public Version getVersion() {
    return version;
  }
}
