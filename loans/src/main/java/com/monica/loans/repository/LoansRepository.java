package com.monica.loans.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.monica.loans.model.Loans;

@Repository
public interface LoansRepository extends CrudRepository<Loans, Long> {


    List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);

}
