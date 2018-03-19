package computer;

import computer.instruction.Instruction;
import java.util.ArrayList;

@SuppressWarnings("serial")
public abstract class Program extends ArrayList<Instruction> {
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < size(); i++) {
      sb.append(i);
      sb.append(' ');
      sb.append(get(i).toString());
      sb.append('\n');
    }
    return sb.toString();
  }
}
