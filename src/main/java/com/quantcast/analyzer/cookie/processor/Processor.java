package com.quantcast.analyzer.cookie.processor;

import com.quantcast.analyzer.cookie.model.CookieResult;

import java.util.List;

public interface Processor {
    List<CookieResult> applyFilters();
}
