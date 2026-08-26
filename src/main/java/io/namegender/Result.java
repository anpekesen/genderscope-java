package io.namegender;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Result(
  boolean status,
  String name,
  String gender,
  String country,
  int probability,
  @JsonProperty("total_names") int totalNames,
  String confidence,
  String source
) {}
