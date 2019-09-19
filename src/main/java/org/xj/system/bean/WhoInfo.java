package org.xj.system.bean;

import org.hyperic.sigar.Who;

/**
 * @Title: WhoInfo.java .<br>
 * @Package org.xj.system.bean .<br>
 * @Description: 操作系统哪些用户操作系统(进程用户信息) .<br>
 * @author 郑成功 .<br>
 * @email a876459952@qq.com .<br>
 * @date 2019-9-18 上午10:36:20.<br>
 * @version V1.0.<br>
 */
public class WhoInfo {
	

	/**用户设备*/
	private String device;
	/**用户host*/
	private String host;
	/**当前系统进程表中的用户名*/
	private String user;
	/**时间*/
	private String time;
	/**操作系统的用户*/
	private Who who;
	
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public Who getWho() {
		return who;
	}
	public void setWho(Who who) {
		this.who = who;
	}
}
