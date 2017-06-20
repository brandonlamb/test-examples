package com.rationaldevelopers.test;


import javax.enterprise.inject.Produces;
import javax.inject.Singleton;

/**
 * @author Rational Developers
 * @author Ryan McGuinness [rmcguinness(at)rationaldevelopers.com]
 * @version 6/19/17
 */
public class VersionProvider {

  @Produces
  @Singleton
  @ApplicationVersion
  public Version getVersion() {
    return new Version("0.1.0-SNAPSHOT");
  }
}
