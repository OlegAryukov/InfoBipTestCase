package ru.aryukov.domain;

import javax.persistence.*;

/**
 * Created by oaryukov on 01.05.2017.
 */
@Entity(name = "statistic")
public class Statistic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;
    private String shortURL;
    private String fullURL;
    private int countOfRedirect;

    public Statistic(){}

    public Statistic(Account account, String shortURL, String fullURL, int countOfRedirect){
        this.account = account;
        this.shortURL = shortURL;
        this.fullURL = fullURL;
        this.countOfRedirect = countOfRedirect;
    }


}
