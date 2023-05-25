package com.monica.accounts.repository;

import com.monica.accounts.model.Accounts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts , Long> {
    Accounts findByCustomerId(int customerId);

}
