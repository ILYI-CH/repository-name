package ru.bulgakov.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class YandexSearchResualPage {
    private final SelenideElement CloseWindow = $(".DistributionButtonClose");

    public YandexSearchResualPage closeDefaultBrowserSelectWindow() {
        CloseWindow.click();


        return this;
    }

    public YandexSearchResualPage openLink (String webSitName) {
        $(byText(webSitName)).click();
        return this;
    }
}
