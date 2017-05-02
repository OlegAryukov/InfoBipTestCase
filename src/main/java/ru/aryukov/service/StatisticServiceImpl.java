package ru.aryukov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.aryukov.domain.Account;
import ru.aryukov.domain.Statistic;
import ru.aryukov.repository.StatisticRepository;

import java.util.HashMap;
import java.util.List;

/**
 * Created by oaryukov on 02.05.2017.
 */
@Service
public class StatisticServiceImpl implements StatisticService {
    private final StatisticRepository statisticRepository;

    @Autowired
    public StatisticServiceImpl(StatisticRepository statisticRepository){
        this.statisticRepository = statisticRepository;
    }

    @Override
    public HashMap<String, String> getStatisticByAccount(Account account) {
        List<Statistic> listStat = statisticRepository.findByAccount(account);

        return null;
    }

    @Override
    public void updateUrlUsage(Account account, String url) {

    }
}
