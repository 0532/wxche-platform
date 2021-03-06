package com.wxche.platform.wechat.utils;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonUtil {
	static final Gson GSON;

	static {
		GSON = new GsonBuilder().serializeNulls().create();
	}

	/**
	 * 
	 * 序列化json字符串
	 * 
	 * @param src
	 *            数据源
	 */
	public static String toJson(Object src) {
		return GSON.toJson(src);
	}

	/**
	 * 
	 * 序列化json字符串（根据自定义类型）
	 * 
	 * @param src
	 *            数据源
	 * @param t
	 *            自定义类型
	 */
	public static String toJson(Object src, Type t) {
		return GSON.toJson(src, t);

	}

	/**
	 * 
	 * 反序列化json字符串成为对象
	 * 
	 * @param json
	 *            json格式的字符串
	 * @param classOfT
	 *            反序列的指定类型
	 */
	public static <T> T fromJson(String json, Class<T> classOfT) {
		return (T) GSON.fromJson(json, classOfT);
	}

	public static <T> T fromJson(Object json, Class<T> classOfT) {
		if (null == json) {
			return null;
		}
		return (T) GSON.fromJson(json.toString(), classOfT);
	}

	/**
	 * 
	 * 反序列化json字符串成为对象
	 * 
	 * @param json
	 *            json格式的字符串
	 * @param typeOfT
	 *            反序列的指定类型
	 */
	public static <T> T fromJson(String json, Type typeOfT) {
		return (T) GSON.fromJson(json, typeOfT);
	}
	/**
	 * getListFromJSON(GsonUtil.toJson(otsResult_taobaoData.getDatas()), QtTaobaoData[].class)
	 * @author ducongcong
	 * @createDate 2016年3月18日
	 * @updateDate 
	 * @param json
	 * @param type
	 * @return
	 */
	public static <T> List<T> getListFromJSON(String json, Class<T[]> type) {
		T[] list = GsonUtil.fromJson(json, type);
		return Arrays.asList(list);
	}
}
