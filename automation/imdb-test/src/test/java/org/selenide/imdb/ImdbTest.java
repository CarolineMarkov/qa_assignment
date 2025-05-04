package org.selenide.imdb;


import io.qameta.allure.Allure;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.*;

import java.util.List;


@Epic("IMDb Automation")
@Feature("Search and Cast Extraction")

public class ImdbTest {

    @Test
    @Description("This test opens the imdb.com page, searchs for 'QA' in the search bar, clicks on the first title and prints out 5 members of the top cast")
    public void userSearchAndShowTopCast5Test() {
        Allure.step("Open IMDb homepage");
        HomePage homepage = new HomePage();
        homepage.openPage("https://www.imdb.com/");

        Allure.step("Search for 'qa'");
        homepage.searchKeyword("QA");


        Allure.step("Go to movie page");
        MoviePage moviepage = new MoviePage();
        moviepage.goToFullCast();

        Allure.step("Print out 5 cast members");
        CastPage castPage = new CastPage();
        List<String> topCast = castPage.extractTopCastNames(5);
        topCast.forEach(System.out::println);
        Allure.step("Top 5 Cast Members:\n" + String.join("\n", topCast));



    }



}
