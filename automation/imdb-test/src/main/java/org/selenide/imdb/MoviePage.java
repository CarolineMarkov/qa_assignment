package org.selenide.imdb;


import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MoviePage {

    public void goToFullCast() {
        $$("h3.ipc-title__text").findBy(text("Top cast")).scrollIntoView(true).shouldBe(visible, Duration.ofSeconds(5)).click();

        //this is just for control after landing on the page where there is full cast and crew
        $("h1").shouldHave(text("Full cast & crew"));
    }
}
