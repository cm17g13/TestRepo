package testingManagment;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import managmentSystem.*;

public class ManagmentTests {

	Service service = new Service();
	int accountNumber1 = service.generateAccountNumber();
	int accountNumber2 = service.generateAccountNumber();
	int accountNumber3 = service.generateAccountNumber();
	Account a1 = new Account("Jason", "Hart", accountNumber1);
	Account a2 = new Account("Nidhesh", "Pillai", accountNumber2);
	Account a3 = new Account("Tib", "Coder", accountNumber3);

	@Test
	public void addAccount() {
		service.addAccount(a2);
		service.addAccount(a3);
		assertEquals(true, service.addAccount(a1));
		assertEquals(false, service.addAccount(a1));
	}
	
	@Test
	public void getAccount() {
		service.addAccount(a1);
		service.addAccount(a2);
		service.addAccount(a3);
		assertEquals(a1, service.getAccount(a1.getAccountNumber()));
		assertEquals(null, service.getAccount(service.generateAccountNumber()));
	}
}
