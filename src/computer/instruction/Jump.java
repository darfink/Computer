package computer.instruction;

import computer.Memory;
import computer.ProgramCounter;

public class Jump extends Instruction {
  private int jumpTo;

  public Jump(int jumpTo) {
    this.jumpTo = jumpTo;
  }

  @Override
  public void execute(ProgramCounter counter, Memory memory) {
    counter.setRegister(jumpTo);
  }

  @Override
  protected String opcode() {
    return "JMP";
  }

  @Override
  protected Number[] operands() {
    return new Number[] {jumpTo};
  }
}
