package com.quantcast.analyzer.cookie.filter;

import com.quantcast.analyzer.cookie.model.CookieData;

import java.util.List;

public class NoFilter extends Filter {
    @Override
    public String getDescription() {
        return "#NoFilter";
    }

    @Override
    public List<CookieData> applyFilter(List<CookieData> cookieDataList) {
        return cookieDataList;
    }
}
