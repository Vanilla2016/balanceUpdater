package com.wds.balanceUpdater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;
import wds.service.BalanceService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import wds.beans.Balance;

import java.time.Clock;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = com.wds.balanceUpdater.TestConfig.class)
@TestPropertySource("classpath:application-test.properties")
class BalanceUpdaterApplicationTests {

	@Autowired
	public BalanceService balanceService;

    private BalanceUpdaterApplicationTests() {
    }

    static BalanceUpdaterApplicationTests createBalanceUpdaterApplicationTests() {
        return new BalanceUpdaterApplicationTests();
    }

    @Test
	public void testUpdateBalanceInDb(){

		Balance testBalance = new Balance();
		testBalance.setIdcrypto(16);
		testBalance.setCrypto_value(new String("0.00099966f"));
		testBalance.setUpdatedDate(new Date(new Date().getTime()));
		balanceService.addBalance(testBalance);
		for (Balance balance : balanceService.getAllBalances()){
			if(!balance.getCrypto_value().equalsIgnoreCase("0")){
				assertTrue(balance.getCrypto_value().equalsIgnoreCase(new String("0.00099966f")));
				}
			}

		//balanceService.deleteBalance(16l);
	}
}