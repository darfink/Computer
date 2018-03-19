package computer.instruction;

import computer.Memory;
import computer.ProgramCounter;

public abstract class Instruction {
  public abstract void execute(ProgramCounter counter, Memory memory);

  protected abstract String opcode();

  protected abstract Object[] operands();

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(opcode());
    for (Object op : operands()) {
      sb.append(' ');
      sb.append(op.toString());
    }
    return sb.toString();
  }
}
