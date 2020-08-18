package ru.netology;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DeliveryTest {
    @Test
    void checkingCardBooking(){
        open("http://localhost:9999");
        SelenideElement form = $("form");
        form.$("[data-test-id=city] input").setValue("Москва");
        form.$(".calendar-input input").click();
        form.$("[data-test-id=name] input").setValue("Комякова Татьяна");
        form.$("[data-test-id=phone] input").setValue("+79631645544");
        form.$("[data-test-id=agreement]").click();
        $(withText("Забронировать")).waitUntil(visible,15000);
        form.$("button").click();
        $("[data-test-id=notification]").exists();




    }


}
