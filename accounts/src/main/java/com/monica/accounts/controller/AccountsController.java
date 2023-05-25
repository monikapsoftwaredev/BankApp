package com.monica.accounts.controller;

import com.monica.accounts.model.Accounts;
import com.monica.accounts.model.Customer;
import com.monica.accounts.repository.AccountsRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@Data
@RequiredArgsConstructor
@Slf4j
public class AccountsController {


    private  AccountsRepository accountsRepository;


    @PostMapping("/myAccount")
    public Accounts getAccountDetails(@RequestBody Customer customer){
        log.info("jestem w kontrollerze");
        Accounts accounts = accountsRepository.findByCustomerId(customer.getCustomerId());
        log.info("accounts:{}", accounts);
        if(accounts != null ){
            return accounts;
        }else{
            return null;
        }

    };


}
