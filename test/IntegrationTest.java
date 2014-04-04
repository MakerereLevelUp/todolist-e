import org.junit.*;

import play.libs.WS;
import play.mvc.*;
import play.test.*;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

import static org.fluentlenium.core.filter.FilterConstructor.*;

public class IntegrationTest {

    /**
     * add your integration test here
     * in this example we just check if the welcome page is being shown
     */


   @Test
    public void test() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333/");
                assertThat(browser.pageSource()).contains("Your new application is ready");
            }
        });
    }



    @Test
    public void testIndexWithTasksTestServer() {
        running(testServer(3355), new Runnable() {
            @Override
            public void run() {
                assertThat(
                        WS.url("http://localhost:3355/tasks").get().get().getStatus()
                ).isEqualTo(OK);
            }
        });
    }

    @Test
    public void testInMemory() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, new Callback<TestBrowser>() {
            public void invoke(TestBrowser browser) {
                browser.goTo("http://localhost:3333");
                assertThat(browser.pageSource()).contains("Your new application is ready.");
            }
        });
    }


}
