package org.cn.kkl.ws.impl;

import org.cn.kkl.ws.IWeatherService;

public class WeatherService implements IWeatherService {
	
	/**
	 * get weather situation by city name
	 * @param cityName
	 * @return
	 */
	public String info(String cityName){
		if ("bj".equalsIgnoreCase(cityName)) {
			return "smog";
		}
		return "clear";
	}
}
