package com.suchi.quotely;

import org.springframework.stereotype.Service;

@Service
public class QuotelyService {
    private final QuotelyRepository repository;

    public QuotelyService(QuotelyRepository repository) {
        this.repository = repository;
    }

    public String getQuote() {
        var quotes = repository.getQuotes();
        int randomIndex = (int) (Math.floor((Math.random() * quotes.length)));
        return quotes[randomIndex];
    }
}
