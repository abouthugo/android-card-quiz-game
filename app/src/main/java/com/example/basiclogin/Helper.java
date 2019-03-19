package com.example.basiclogin;

public class Helper {

  private Question[] questions = new Question[5];


  public Helper() {
    questions[0] = new Question("What is the color of the sky?",
        new String[]{"Yellow", "Transparent", "Blue"},
        new int[]{1}
    );
    questions[1] = new Question("How old is Sponge Bob?",
        new String[]{"28", "32", "5"},
        new int[]{0}
    );
    questions[2] = new Question("Who is Satoshi Nakamoto?",
        new String[]{"Creator of Bitcoin", "No one knows",
            "Someone who is really smart"},
        new int[]{0, 1}
    );
    questions[3] = new Question("What is React?",
        new String[]{"A JavaScript framework made by facebook",
            "A JavaScript library made by facebook", "An app"},
        new int[]{1}
    );
    questions[4] = new Question("What does the fox say?",
        new String[]{"Woof", "Meow", "Ring-ding-ding-ding-dingeringeding"},
        new int[]{2}
    );

  }

  public Question[] getQuestions() {
    return questions;
  }
}
