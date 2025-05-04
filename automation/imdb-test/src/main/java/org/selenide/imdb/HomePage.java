package org.selenide.imdb;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class HomePage {


    public void openPage(String url) {
        open(url);
        acceptCookies();
    }

    public void acceptCookies() {
        if ($("[data-testid='accept-button']").shouldBe(Condition.exist, Duration.ofSeconds(5)).exists()) {
            $("[data-testid='accept-button']").click();
        }
    }

    public void searchKeyword(String keyword) {
        $("input[name='q']").setValue(keyword);
        clickOnFirst();

    }

    public void clickOnFirst() {
        $("li[role='option']").shouldBe(visible, Duration.ofSeconds(5)).click();
    }


}
