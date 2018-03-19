package computer.instruction;

import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public class JumpEq extends Instruction {
  private int jumpTo;
  private Value value1;
  private Value value2;

  public JumpEq(int jumpTo, Value value1, Value value2) {
    this.jumpTo = jumpTo;
    this.value1 = value1;
    this.value2 = value2;
  }

  @Override
	public void execute(ProgramCounter counter, Memory memory) {
    if (value1.getWord(memory).equals(value2.getWord(memory))) {
      counter.setRegister(jumpTo);
    } else {
      counter.increment();
    }
  }

  @Override
	protected String opcode() {
    return "JEQ";
  }

  @Override
  protected Object[] operands() {
    return new Object[] { jumpTo, value1, value2 };
  }
}
