package xyz.hollysys.search.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import xyz.hollysys.search.dao.ShangpinDAO;
import xyz.hollysys.search.dao.ShangpinDetailDAO;
import xyz.hollysys.search.model.ApiResult;
import xyz.hollysys.search.model.Shangpin;
import xyz.hollysys.search.model.ShangpinDetail;
import xyz.hollysys.search.service.ApiResultUtil;

@Controller
public class SearchController {
	private static final Logger logger = Logger.getLogger(SearchController.class);
	@Autowired
	@Qualifier("apiResultUtilImpl")
	private ApiResultUtil apiResultUtil;

	@Autowired
	@Qualifier("shangpinDAO")
	private ShangpinDAO shangpinDAO;

	@Autowired
	@Qualifier("shangpinDetailDAO")
	private ShangpinDetailDAO shangpinDetailDAO;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody ApiResult searchMain(
	/*
	 * @RequestHeader(value="Accept") String accept,
	 * 
	 * @RequestHeader(value="Accept-Language") String acceptLanguage,
	 * 
	 * @RequestHeader(value="User-Agent", defaultValue="foo") String userAgent,
	 * 
	 * @RequestHeader(value="content-type", defaultValue="foo") String
	 * contenttype,
	 * 
	 * @RequestHeader(value="channel", defaultValue="web") String channel,
	 * 
	 * @RequestParam(value="class") String cls,
	 * 
	 * @RequestParam(value="method") String method,
	 * 
	 * @RequestParam(value="timestamp") int timestamp,
	 * 
	 * @RequestParam(value="encode") String encode
	 */
	) {
		ApiResult apiResult = new ApiResult();

		List<Shangpin> shangpins = shangpinDAO.getAllShangpin();

		apiResult.data = shangpins;

		return apiResult;
	}

	@RequestMapping(value = "/detail/{sp_id}", method = RequestMethod.GET)
	// public @ResponseBody ApiResult searchMain(@PathVariable String username,
	// @RequestParam(value="q1", required=false) String query){
	public @ResponseBody ApiResult detail(
			@PathVariable int sp_id /*
									 * @PathVariable String username,
									 * 
									 * @RequestHeader(value="Accept") String
									 * accept,
									 * 
									 * @RequestHeader(value="Accept-Language")
									 * String acceptLanguage,
									 * 
									 * @RequestHeader(value="User-Agent",
									 * defaultValue="foo") String userAgent,
									 * 
									 * @RequestHeader(value="content-type",
									 * defaultValue="foo") String contenttype,
									 * 
									 * @RequestParam(value="class") String cls,
									 * 
									 * @RequestParam(value="method") String
									 * method,
									 * 
									 * @RequestParam(value="timestamp") int
									 * timestamp,
									 * 
									 * @RequestParam(value="encode") String
									 * encode, // @RequestBody RegisterUser
									 * user,
									 * 
									 * @CookieValue(value = "foo", defaultValue
									 * = "hello") String fooCookie,
									 * 
									 * @CookieValue(value =
									 * "JSESSIONID",defaultValue="null") String
									 * session, HttpServletResponse response
									 */) {
		ApiResult apiResult = new ApiResult();

		ShangpinDetail detail = shangpinDetailDAO.getShangpinById(sp_id);

		apiResult.data = detail;

		return apiResult;
	}

	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public @ResponseBody ApiResult search(
			@RequestParam(value = "q",defaultValue="null") String query,
			@RequestParam(value = "sort",defaultValue="null") String sort) {
		ApiResult apiResult = new ApiResult();

		List<Shangpin> shangpins = shangpinDAO.getAllShangpin();

		apiResult.data = shangpins;

		return apiResult;
	}
}
