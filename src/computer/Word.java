package computer;

public abstract class Word implements Value, Cloneable {
  public abstract Word add(Word other);

  public abstract Word multiply(Word other);

  @Override
  public Word getWord(Memory memory) {
    return this;
  }

  @Override
  public abstract boolean equals(Object other);

  @Override
  public abstract Word clone();

  @Override
  public abstract String toString();
}