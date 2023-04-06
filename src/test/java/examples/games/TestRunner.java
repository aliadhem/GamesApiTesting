package examples.games;

import com.intuit.karate.junit5.Karate;


public class TestRunner {

    @Karate.Test
    Karate testGames() {
        return Karate.run("games").relativeTo(getClass());
    }
}
