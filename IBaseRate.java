package BankAccountApp;

public interface IBaseRate {
	// write a Method  that return base rate
	default double getBaseRate() {
		return 2.5;
	}

}
