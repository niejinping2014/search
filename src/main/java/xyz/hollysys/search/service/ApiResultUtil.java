package xyz.hollysys.search.service;

import org.springframework.stereotype.Service;

import xyz.hollysys.search.model.ApiResult;

@Service
public interface ApiResultUtil {
	ApiResult getApiResult(int code);
}
