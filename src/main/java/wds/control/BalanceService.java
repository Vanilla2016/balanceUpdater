package wds.control;

import wds.control.exception.StudentNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wds.beans.entity.Balance;
import wds.control.repo.BalanceRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class BalanceService {

    @Autowired
    private final BalanceRepository balanceRepository;

    /*
        public BalanceService(BalanceRepository balanceRepository){
        this.balanceRepository = balanceRepository;
    }
     */

    public List<Balance> getAllBalances() {
        return (List<Balance>) balanceRepository.findAll();
    }

    public void addBalance(Balance balance) {
        /*

        Boolean existsEmail = balanceRepository
                .selectExistsAsset(balance.getAsset());
        if (existsEmail) {
            throw new BadRequestException(
                    "Asset " + balance.getAsset() + " taken");
        }
      */
        balanceRepository.save(balance);
    }

    public void deleteBalance(Long studentId) {
        if(!balanceRepository.existsById(studentId)) {
            throw new StudentNotFoundException(
                    "Student with id " + studentId + " does not exists");
        }
        balanceRepository.deleteById(studentId);
    }
}
