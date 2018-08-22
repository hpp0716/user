package com.hpp.user;/**
 * @Author:pengpeng.han
 * @Description:
 * @Date: 14:45 2018/8/22
 * @Modified By:
 */

/**
 *
 * @author pengpeng.han
 * @create 2018-08-22 14:45
 **/
import redis.clients.jedis.Jedis;
import redis.clients.jedis.ZParams;


public class Chapter01 {

	public static void main(String[] args) {
		System.out.println("dd");
		Jedis conn = new Jedis("localhost");
		conn.set("dd","ddd");
		System.out.println(conn.get("dd"));
		
	}
	
}
