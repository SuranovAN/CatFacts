import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

public class Main {
    private final static String URI = "https://cat-fact.herokuapp.com/facts";

    public static void main(String[] args) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultRequestConfig(RequestConfig.custom()
                        .setConnectTimeout(5000)
                        .setSocketTimeout(30000)
                        .setRedirectsEnabled(false)
                        .build())
                .build();
        HttpGet request = new HttpGet(URI);
        CloseableHttpResponse response = httpClient.execute(request);
        ObjectMapper mapper = new ObjectMapper();
        CatsFactsResponse catsFactsResponse =
                mapper.readValue(response.getEntity().getContent(), CatsFactsResponse.class);
        catsFactsResponse.getAll().stream().filter(value -> value.getUpvotes() != 0)
                .forEach((value) -> System.out.println(value.getText()));
    }
}
