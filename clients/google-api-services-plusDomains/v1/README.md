# Google+ Domains API Client Library for Java

Builds on top of the Google+ platform for Google Apps Domains.

This page contains information about getting started with the Google+ Domains API
using the Google API Client Library for Java. In addition, you may be interested
in the following documentation:

* Browse the [Javadoc reference for the Google+ Domains API][javadoc]
* Read the [Developer's Guide for the Google API Client Library for Java][google-api-client].
* Interact with this API in your browser using the [APIs Explorer for the Google+ Domains API][api-explorer]

## Installation

### Maven

Add the following lines to your `pom.xml` file:

```xml
<project>
  <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-plusDomains</artifactId>
      <version>v1-rev20190415-1.30.3</version>
    </dependency>
  </dependencies>
</project>
```

### Gradle

```gradle
repositories {
  mavenCentral()
}
dependencies {
  compile 'com.google.apis:google-api-services-plusDomains:v1-rev20190415-1.30.3'
}
```

[javadoc]: https://googleapis.dev/java/google-api-services-plusDomains/latest/index.html
[google-api-client]: https://github.com/googleapis/google-api-java-client/
[api-explorer]: https://developers.google.com/apis-explorer/#p/plusDomains/v1/
