package org.cn.kkl.ws;

import javax.jws.WebService;

@WebService
public interface IWeatherService {
	
	/**
	 * get weather situation by city name
	 * @param cityName
	 * @return
	 */
	String info(String cityName);

}
