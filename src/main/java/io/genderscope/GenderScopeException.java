package io.genderscope;
public final class GenderScopeException extends RuntimeException {
  private final int status;
  public GenderScopeException(String message, int status) { super(message); this.status = status; }
  public int status() { return status; }
}
