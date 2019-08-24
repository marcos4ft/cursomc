package com.nelioalves.cursomc.resources.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class URL {

	public static String decodeParam(String s) {
		try {
			return URLDecoder.decode(s, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return "";
		}
	}

	public static List<Integer> decodeIntList(String s) {
		String[] split = s.split(",");
		List<Integer> list = new ArrayList<>();
		for (String v : split) {
			list.add(Integer.parseInt(v));
		}
		return list;
	}
}
