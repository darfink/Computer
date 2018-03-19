package computer.instruction;

import computer.Address;
import computer.Memory;
import computer.ProgramCounter;
import computer.Value;

public class Copy extends Instruction {
  private Value source;
  private Address destination;

  public Copy(Value source, Address destination) {
    this.source = source;
    this.destination = destination;
  }

  @Override
  public void execute(ProgramCounter counter, Memory memory) {
    memory.write(destination, source.getWord(memory).clone());
    counter.increment();
  }

  @Override
  protected String opcode() {
    return "CPY";
  }

  @Override
  protected Value[] operands() {
    return new Value[] {source, destination};
  }
}
