package computer;

public abstract class Memory {
  protected Word[] memory;

  public Word read(Address address) {
    return memory[address.getOffset()];
  }

  public void write(Address address, Word value) {
    if (!memory.getClass().getComponentType().isAssignableFrom(value.getClass())) {
      throw new ClassCastException("value");
    }

    memory[address.getOffset()] = value;
  }
}
