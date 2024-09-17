package com.wds.balanceUpdater;

import org.junit.jupiter.api.Disabled;
import org.springframework.beans.factory.annotation.Autowired;
import wds.control.BalanceService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import wds.beans.entity.Balance;

import java.time.LocalDate;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = com.wds.balanceUpdater.TestConfig.class)
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
		testBalance.setIdcrypto("BTC");
		testBalance.setUpdatedDate(new Date(new Date().getTime()));
		testBalance.setCrypto_value(new String("0.00099966f"));
		balanceService.addBalance(testBalance);
		for (Balance balance : balanceService.getAllBalances()){
			assertTrue(balance.getCrypto_value().equalsIgnoreCase(new String("0.00099966f")));
		}
	}
}