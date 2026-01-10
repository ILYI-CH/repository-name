package ru.bulgakov.qa;

import com.codeborne.selenide.Config;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

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
        Configuration.holdBrowserOpen = true;
        open("https://ya.ru/");
        $("#text").setValue("bulgakov qa");
        $("[type=submit]").click();
        $(".DistributionButtonClose").click();
        $(byText("ivanbulgakovqa.ru")).click();
        sleep(5000);
        switchTo().window(1);
      $$("t-menu__list li").last().click();










    }
}
