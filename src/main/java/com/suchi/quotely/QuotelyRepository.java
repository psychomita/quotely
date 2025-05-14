package com.suchi.quotely;

import org.springframework.stereotype.Repository;

@Repository
public class QuotelyRepository {
    public String getQuote() {
        var quotes = getQuotes();
        int randomIndex = (int) (Math.floor((Math.random() * quotes.length)));
        return quotes[randomIndex];
    }

    public String[] getQuotes() {
        return new String[] {
                "Do not go where the path may lead, go instead where there is no path and leave a trail.",
                "In the middle of every difficulty lies opportunity.",
                "Success is not final, failure is not fatal: It is the courage to continue that counts.",
                "Dream big. Start small. Act now.",
                "The only way to do great work is to love what you do.",
                "You must be the change you wish to see in the world.",
                "Everything you’ve ever wanted is on the other side of fear.",
                "Believe you can and you're halfway there.",
                "You don’t have to see the whole staircase, just take the first step.",
                "It’s not about having time. It’s about making time.",
                "You are never too old to set another goal or to dream a new dream.",
                "Creativity is intelligence having fun.",
                "Happiness is not something ready-made. It comes from your own actions.",
                "Great things never came from comfort zones.",
                "Discipline is the bridge between goals and accomplishment.",
                "A river cuts through rock not because of its power, but because of its persistence.",
                "You can’t go back and change the beginning, but you can start where you are and change the ending.",
                "Stars can’t shine without darkness.",
                "Be fearless in the pursuit of what sets your soul on fire.",
                "Little by little, a little becomes a lot.",
                "Your life does not get better by chance, it gets better by change.",
                "Doubt kills more dreams than failure ever will.",
                "If it scares you, it might be a good thing to try.",
                "Start where you are. Use what you have. Do what you can.",
                "What lies behind us and what lies before us are tiny matters compared to what lies within us.",
                "Let your smile change the world, but don’t let the world change your smile.",
                "You miss 100% of the shots you don’t take.",
                "Don’t be pushed around by the fears in your mind. Be led by the dreams in your heart.",
                "Life is either a daring adventure or nothing at all.",
                "Work hard in silence, let your success be your noise.",
                "A goal without a plan is just a wish.",
                "The best way to predict your future is to create it.",
                "You are stronger than you think.",
                "Pain is temporary. Quitting lasts forever.",
                "Make your life a masterpiece; imagine no limitations on what you can be, have or do.",
                "Sometimes the smallest step in the right direction ends up being the biggest step of your life.",
                "Be the energy you want to attract.",
                "You don’t find the happy life. You make it.",
                "Push yourself, because no one else is going to do it for you.",
                "Don’t wait for opportunity. Create it.",
                "You are enough just as you are.",
                "When you can’t find the sunshine, be the sunshine.",
                "The only limit to our realization of tomorrow is our doubts of today.",
                "Be yourself; everyone else is already taken.",
                "Fall seven times, stand up eight.",
                "Act as if what you do makes a difference. It does.",
                "You don't have to be great to start, but you have to start to be great.",
                "Success doesn’t come from what you do occasionally, it comes from what you do consistently.",
                "Life begins at the end of your comfort zone.",
                "Believe in yourself and all that you are."
        };
    }
}
