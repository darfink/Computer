package computer.instruction;

import computer.Address;
import computer.Memory;
import computer.ProgramCounter;
import computer.Value;
import computer.Word;

public class Mul extends Instruction {
  private Address destination;
  private Value value1;
  private Value value2;

  public Mul(Value value1, Value value2, Address destination) {
    this.destination = destination;
    this.value1 = value1;
    this.value2 = value2;
  }

  @Override
  public void execute(ProgramCounter counter, Memory memory) {
    Word product = value1.getWord(memory).multiply(value2.getWord(memory));

    memory.write(destination, product);
    counter.increment();
  }

  @Override
  protected String opcode() {
    return "MUL";
  }

  @Override
  protected Value[] operands() {
    return new Value[] {value1, value2, destination};
  }
}
