package ru.bulgakov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class YAndexSearchPage {
    private final SelenideElement searchInput = $("#text");
    private final SelenideElement sumbitButton = $("[type=submit]");
    public YAndexSearchPage search(String query) {
        searchInput.setValue(query);
        return this;
    }public YandexSearchResualPage submit() {
        sumbitButton .click();

        return new YandexSearchResualPage();
    }


    }


