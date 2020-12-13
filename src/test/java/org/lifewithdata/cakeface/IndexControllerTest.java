package org.lifewithdata.cakeface;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@ContextConfiguration
@AutoConfigureMockMvc
public class IndexControllerTest {
    @Autowired
    private WebApplicationContext context;

    @Autowired
    MockMvc mockMvc;

    // @Before

    @Test
    @DisplayName("index page returns the landing page")
    void returnsLandingPage() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.content().string(Matchers.containsString("Cake Factory")));
    }

    // @Test
    // @DisplayName("index returns landing page with company name")
    // public void homePageHasCompanyName() throws Exception {
    //     try (final WebClient webClient = new WebClient()) {
    //         MvcResult pageResult = mockMvc.perform(MockMvcRequestBuilders.get("/")).andReturn();
    //         pageResult.
    //         final HtmlPage page = webClient.getPage(
    //             MockMvcRequestBuilders.get("/").buildRequest(mockMvc.)
    //         )
    //     }
    // }
}
