package com.shl.excel2json;

import java.net.MalformedURLException;
import java.net.URL;

public class TestURL {


    public static void main(String[] args) {
        String url = "http://GET_:/test/.../../dfadsfa?dfasdfa=ddf\\\\:&dsfasd=fasdfa&dfaf=wiwiw";
        url = "http://GET_oweij_dfiajsdf_diufao fff/fasdfdfa../../../../..?abd=dfa";
        url = "https://www.baidu.com/s?wd=%E6%88%AA%E5%8F%96%20%E9%97%AE%E5%8F%B7%E4%B9%8B%E5%89%8D%E5%88%B0%E5%AD%97%E7%AC%A6%E4%B8%B2&pn=10&oq=%E6%88%AA%E5%8F%96%20%E9%97%AE%E5%8F%B7%E4%B9%8B%E5%89%8D%E5%88%B0%E5%AD%97%E7%AC%A6%E4%B8%B2&tn=93006350_hao_pg&ie=utf-8&rsv_pq=a7e013d600006454&rsv_t=1377mZ5GXJm2fLHZa9F9Objak%2BGous6nWImuiq9kFm4E49nnEEIhsjwBRHYErdUIyPW6tUNs&srcqid=2148975484330804007";
        try {
            URL u = new URL(url);
            System.out.println("path is " + u.getPath());
            System.out.println("query is " + u.getQuery());
            System.out.println("query is " + u.getHost());
            System.out.println("query is " + u.getRef());
            System.out.println("query is " + u.getFile());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
