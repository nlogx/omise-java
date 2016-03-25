package co.omise.resources;

import co.omise.models.Account;
import okhttp3.OkHttpClient;

import java.io.IOException;

public class AccountResource extends Resource {
    public AccountResource(OkHttpClient httpClient) {
        super(httpClient);
    }

    public Account get() throws IOException {
        return httpGet(apiUrl("/account").build()).returns(Account.class);
    }
}
