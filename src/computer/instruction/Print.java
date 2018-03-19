package computer.instruction;

import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public class Print extends Instruction  {
  private Value value;

  public Print(Value value) {
    this.value = value;
  }

  @Override
	public void execute(ProgramCounter counter, Memory memory) {
    System.out.println(value.getWord(memory));
    counter.increment();
  }

  @Override
	protected String opcode() {
    return "PRT";
  }

  @Override
  protected Value[] operands() {
    return new Value[] { value };
  }
}
