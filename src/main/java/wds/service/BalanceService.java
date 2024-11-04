package wds.service;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import wds.exception.StudentNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wds.beans.Balance;
import wds.repository.BalanceRepository;

import java.util.List;

@Service
//@AllArgsConstructor
@ComponentScan(basePackages = {"wds.repository"})
@EnableJpaRepositories({"wds.repository"})
@EntityScan("wds.beans")
public class BalanceService {

    @Autowired
    private BalanceRepository balanceRepository;


    public BalanceService(BalanceRepository balanceRepository){
        this.balanceRepository = balanceRepository;
    }

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
