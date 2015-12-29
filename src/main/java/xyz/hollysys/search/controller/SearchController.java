package xyz.hollysys.search.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import xyz.hollysys.search.model.ApiResult;
import xyz.hollysys.search.model.RegisterUser;
import xyz.hollysys.search.service.ApiResultUtil;

@Controller
public class SearchController {
	private static final Logger logger = Logger.getLogger(SearchController.class);
	@Autowired
	@Qualifier("apiResultUtilImpl")
	private ApiResultUtil apiResultUtil;
	
	@RequestMapping(value="/{username}",method=RequestMethod.POST)
//	public @ResponseBody ApiResult searchMain(@PathVariable String username, @RequestParam(value="q1", required=false) String query){
		public @ResponseBody ApiResult searchMain(@PathVariable String username,
				@RequestHeader(value="Accept") String accept,
				@RequestHeader(value="Accept-Language") String acceptLanguage,
				@RequestHeader(value="User-Agent", defaultValue="foo") String userAgent,
				@RequestHeader(value="content-type", defaultValue="foo") String contenttype,
				@RequestParam(value="class") String cls, 
				@RequestParam(value="method") String method, 
				@RequestParam(value="timestamp") int timestamp,
				@RequestParam(value="encode") String encode,
				@RequestBody RegisterUser user,
				@CookieValue(value = "foo", defaultValue = "hello") String fooCookie,
				HttpServletResponse response){
		StringBuilder sb = new StringBuilder();
		logger.debug("================ header ================");
		logger.debug("accept : " + accept);
		logger.debug("acceptLanguage : " + acceptLanguage);
		logger.debug("userAgent : " + userAgent);
		logger.debug("contenttype : " + contenttype);
		
		logger.debug("================ query ================");
		logger.debug("收到了主站请求");
		logger.debug("class : " + cls);
		logger.debug("method : " + method);
		logger.debug("timestamp : " + timestamp);
		logger.debug("encode : " + encode);

		logger.debug("================ body ================");
		logger.debug("body : " + user.toString());
		sb.append("收到了主站请求　：　");
		sb.append(username);
		
		response.addCookie(new Cookie("foo", "bar"));
		
		logger.debug("================ cookie ================");
		logger.debug("cookie : " + fooCookie);
		
		return apiResultUtil.getApiResult(200);
	}
	
	@RequestMapping(value="/list/{list}")
	public @ResponseBody String test(){
		try {
			return new String("收到了吗".getBytes(),"utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}		
	}
}
