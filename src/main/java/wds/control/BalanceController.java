package wds.control;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wds.beans.entity.Balance;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/balances")
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class BalanceController {

    @Autowired
    private final BalanceService balanceService;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Balance> getAllBalances() {

        return balanceService.getAllBalances();
    }

    @PostMapping
    @CrossOrigin(origins = "http://localhost:3000")
    public void addBalance(@Valid @RequestBody Balance balance) {

        System.out.println("Called addBalance");
        balanceService.addBalance(balance);
    }

    @DeleteMapping(path = "{studentId}")
    @CrossOrigin(origins = "http://localhost:3000")
    public void deleteBalance(
            @PathVariable("studentId") Long studentId) {
        balanceService.deleteBalance(studentId);
    }
}