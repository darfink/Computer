package computer.memory;

import computer.Word;

public class LongWord extends Word {
  private long word;

  public LongWord(long value) {
    word = value;
  }

  @Override
  public Word add(Word other) {
    return new LongWord(((LongWord) other).word + word);
  }

  @Override
  public Word multiply(Word other) {
    return new LongWord(((LongWord) other).word * word);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof LongWord ? word == ((LongWord) other).word : false;
  }

  @Override
  public Word clone() {
    return new LongWord(word);
  }

  @Override
  public String toString() {
    return Long.toString(word);
  }
}
