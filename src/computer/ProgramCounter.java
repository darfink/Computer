package computer;

public class ProgramCounter {
  private int index;

  public void setRegister(int index) {
    this.index = index;
  }

  public int getRegister() {
    return index;
  }

  public void increment() {
    index++;
  }

  public boolean isValid() {
    return index >= 0;
  }
}
