# NameGender Java

Java 17+ client built on `java.net.http.HttpClient`.

Until the Maven Central namespace is verified, install the tagged release through JitPack:

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependency>
  <groupId>com.github.anpekesen</groupId>
  <artifactId>namegender-java</artifactId>
  <version>v0.2.0</version>
</dependency>
```

```java
var client = new NameGender(System.getenv("NAMEGENDER_API_KEY"));
var result = client.name("Ayşe", "TR");
System.out.println(result.gender());
```
