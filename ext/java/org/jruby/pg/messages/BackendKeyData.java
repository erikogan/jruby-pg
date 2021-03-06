package org.jruby.pg.messages;

public class BackendKeyData extends BackendMessage {
  private final int pid;
  private final int secret;

  public BackendKeyData(int pid, int secret) {
    this.pid = pid;
    this.secret = secret;
  }

  @Override
  public MessageType getType() {
    return MessageType.BackendKeyData;
  }

  public int getSecret() {
    return secret;
  }

  public int getPid() {
    return pid;
  }
}
