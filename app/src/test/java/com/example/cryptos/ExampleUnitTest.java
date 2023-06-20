package com.example.cryptos;

import org.junit.Test;

import static org.junit.Assert.*;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void getCryptoCoinsList() throws IOException {
        CryptosApi cryptosApi = new CryptosApi();
        CryptosApiService cryptosApiService = cryptosApi.createCryptosApiService();
        Call<List<CryptoCoin>> listCall = cryptosApiService.getCryptoCoins();
        List<CryptoCoin> coins = listCall.execute().body();
        assertNotNull(coins);
        assertFalse(coins.isEmpty());
        System.out.println(new Gson().toJson(coins));
    }

}