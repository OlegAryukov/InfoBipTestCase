package ru.aryukov.repository;

import org.springframework.data.repository.CrudRepository;
import ru.aryukov.domain.Account;

/**
 * Created by oaryukov on 01.05.2017.
 */
public interface AccountRepository extends CrudRepository<Account, Integer> {
    public Account findByLogin(String login);
}
