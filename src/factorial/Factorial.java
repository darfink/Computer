package factorial;

import computer.Address;
import computer.Program;
import computer.instruction.*;
import computer.memory.LongWord;

@SuppressWarnings("serial")
public class Factorial extends Program {
	public Factorial() {
			Address n = new Address(0);
			Address fac = new Address(1);

			add(new Copy(new LongWord(5), n));
			add(new Copy(new LongWord(1), fac));
			add(new JumpEq(6, n, new LongWord(1)));
			add(new Mul(fac, n, fac));
			add(new Add(n, new LongWord(-1), n));
			add(new Jump(2));
			add(new Print(fac));
			add(new Halt());
		}
}
