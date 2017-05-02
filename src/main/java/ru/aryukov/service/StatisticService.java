package ru.aryukov.service;

import ru.aryukov.domain.Account;

import java.util.Map;

/**
 * Created by oaryukov on 02.05.2017.
 */
public interface StatisticService {
    public Map<String,String> getStatisticByAccount(Account account);

    public void updateUrlUsage(Account account, String url);
}
