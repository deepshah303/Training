
public class EventImp1 implements Event {

	@Override
	public void doSomething() {
		System.out.println("First Event implementation");
	}

	public static class InnerEventImp1 implements Event {

		@Override
		public void doSomething() {
			System.out.println("Second event implementation");
		}

	}

	public void doingSomething() {
		class InnerMostImp1 implements Event {

			@Override
			public void doSomething() {
				System.out.println("Third Event implementation");
			}

		}
		;
		new InnerMostImp1().doSomething();

	}

	public void doingSomethingAgain() {
		Event e = new Event() {

			@Override
			public void doSomething() {
				System.out.println("Fourth event implementation");
			}

		};
		e.doSomething();
	}

	public void doingSomethingOneLastTime() {
		Event e = () -> System.out.println("Fifth event implementation");
		e.doSomething();
	}

	public static void main(String args[]) {
		EventImp1 imp1 = new EventImp1();
		imp1.doSomething();

		// InnerEventImp1 innerImp1 = imp1.new InnerEventImp1();
		InnerEventImp1 innerImp1 = new EventImp1.InnerEventImp1();
		innerImp1.doSomething();
		imp1.doingSomething();
		imp1.doingSomethingAgain();
		imp1.doingSomethingOneLastTime();

	}

}
