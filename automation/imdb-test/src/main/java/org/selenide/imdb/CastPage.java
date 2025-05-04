package org.selenide.imdb;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;



public class CastPage {

    public List<String> extractTopCastNames(int nrOfCastMembers) {
        $("div[data-testid='sub-section-cast']").scrollIntoView(true);
        ElementsCollection castNames = $$("div[data-testid='sub-section-cast'] ul li a.name-credits--title-text-small");
        castNames.shouldBe(CollectionCondition.sizeGreaterThan(0), Duration.ofSeconds(5));

        List<String> names = new ArrayList<>();

        for (int i = 0; i < nrOfCastMembers; i++) {
            String name =  castNames.get(i).innerHtml();
            names.add(name);
        }
        return names;
    }


}
