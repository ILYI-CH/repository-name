package ru.bulgakov.qa;

import com.codeborne.selenide.Config;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import ru.bulgakov.pages.YAndexSearchPage;
import ru.bulgakov.pages.YandexSearchResualPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchTest {

    @Test
    void mentoringPriceShouldBe47000Test() {
        /*
         * Тест-кейс - проверить, что предоплата по обучению 47 000 рублей
         * 1. открыть поисковик (Яндекс)
         * 2. ввести данные сайта (bulgakov qa)
         * 3. нажать кнопку поиск
         * 4. в поисковой выдаче найти нужный сайт, кликнуть на него.
         * 5. нажать на кнопку "Стоимость"
         * 6. нажать на кнопку "Хочу вкатиться в QA"
         * 7. нажать на кнопку "Бегу оплачивать"
         * 8. Проверить что к оплате 47 000 рублей
         **/
        Configuration.timeout = 100000;
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadTimeout = 100000;

        open("https://ya.ru/" , YAndexSearchPage.class)

                .search("bulgakov qa")
                .submit()
                .closeDefaultBrowserSelectWindow()
                .openLink("ivanbulgakovqa.ru");



        switchTo().window(1);
      $$(".t-menu__list li").last().click(); // welcome страница обучения
        $x("/html/body/div[1]/div[42]/div/div/div[32]/div/a").click();
        $(byText("Бегу оплачивать")).click();

        switchTo().window(2);
        $(".styles_price__2lruq h2").shouldHave(text("₽ 47 000 ")); // страница оплаты















    }
}
