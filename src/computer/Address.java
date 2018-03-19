package computer;

public class Address implements Value {
  private int offset;

  public Address(int offset) {
    this.offset = offset;
  }

  public int getOffset() {
    return offset;
  }

  @Override
  public Word getWord(Memory memory) {
    return memory.read(this);
  }

  @Override
  public String toString() {
    return "[" + Integer.toString(offset) + "]";
  }
}
