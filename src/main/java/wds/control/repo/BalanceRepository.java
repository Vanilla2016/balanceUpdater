package wds.control.repo;

import org.springframework.data.repository.CrudRepository;
import wds.beans.entity.Balance;
//import wds.beans.entity.Balance_old;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceRepository
        extends CrudRepository<Balance, Long>{

}
