package computer;

public class Computer {
  private Memory memory;
  private Program program;

  public Computer(Memory memory) {
    this.memory = memory;
  }

  public void load(Program program) {
    this.program = program;
  }

  public void run() {
    for (ProgramCounter pc = new ProgramCounter(); pc.isValid(); ) {
      program.get(pc.getRegister()).execute(pc, memory);
    }
  }
}
