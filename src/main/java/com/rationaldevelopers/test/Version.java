package com.rationaldevelopers.test;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

/**
 * @author Rational Developers
 * @author Ryan McGuinness [rmcguinness(at)rationaldevelopers.com]
 * @version 6/19/17
 */
@JsonRootName("version")
public class Version {

  @JsonProperty(value="version", required = true)
  private final String version;

  public Version(final String version) {
    this.version = version;
  }

  public String getVersion() {
    return version;
  }
}
