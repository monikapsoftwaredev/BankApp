package com.monica.cards.controller;


import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.monica.cards.model.Cards;
import com.monica.cards.model.Customer;
import com.monica.cards.repository.CardsRepository;


@RestController
@Data
@RequiredArgsConstructor
public class CardsController {


    private CardsRepository cardsRepository;

    @PostMapping("/myCards")
    public List<Cards> getCardDetails(@RequestBody Customer customer) {
        List<Cards> cards = cardsRepository.findByCustomerId(customer.getCustomerId());
        if (cards != null) {
            return cards;
        } else {
            return null;
        }

    }

}