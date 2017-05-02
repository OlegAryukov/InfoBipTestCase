package ru.aryukov.repository;

import org.springframework.data.repository.CrudRepository;
import ru.aryukov.domain.Account;
import ru.aryukov.domain.Statistic;

import java.util.List;

/**
 * Created by oaryukov on 01.05.2017.
 */
public interface StatisticRepository extends CrudRepository<StatisticRepository, Integer> {
    public List<Statistic> findByAccount(Account account);
}
