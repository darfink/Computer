package computer.memory;

import computer.Memory;

public class LongMemory extends Memory {
  public LongMemory(int size) {
    memory = new LongWord[size];
  }
}
