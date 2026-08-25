# GenderScope Java

Java 17+ client built on `java.net.http.HttpClient` with no runtime dependencies.

```java
var client = new GenderScope(System.getenv("GENDERSCOPE_API_KEY"));
var result = client.name("Ayşe", "TR");
System.out.println(result.gender());
```
