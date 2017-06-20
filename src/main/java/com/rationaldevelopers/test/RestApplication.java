package com.rationaldevelopers.test;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Rational Developers
 * @author Ryan McGuinness [rmcguinness(at)rationaldevelopers.com]
 * @version 6/19/17
 */
@ApplicationPath("/rs/v1")
public class RestApplication extends Application {
  @Override
  public Set<Class<?>> getClasses() {
    return new HashSet<Class<?>>(Arrays.asList(VersionRS.class));
  }
}
