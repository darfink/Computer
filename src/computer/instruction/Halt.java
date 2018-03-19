package computer.instruction;

import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public class Halt extends Instruction {
  @Override
  public void execute(ProgramCounter counter, Memory memory) {
    counter.setRegister(-1);
  }

  @Override
  protected String opcode() {
    return "HLT";
  }

  @Override
  protected Value[] operands() {
    return new Value[] {};
  }
}
