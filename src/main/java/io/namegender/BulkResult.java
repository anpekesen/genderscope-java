package io.namegender;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public record BulkResult(boolean status, List<Result> results, Map<String, Object> summary) {}
