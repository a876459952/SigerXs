package org.xj.system.bean;

import org.hyperic.sigar.NetInterfaceConfig;

/**
 * @Title: EthernetInfo.java .<br>
 * @Package org.xj.system.bean .<br>
 * @Description: 以太网信息实体 .<br>
 * @author 郑成功 .<br>
 * @email a876459952@qq.com .<br>
 * @date 2019-9-18 上午10:36:41.<br>
 * @version V1.0.<br>
 */
public class EthernetInfo {
	
	/**网卡名*/
	private String name;
	/**IP地址*/
	private String address;
	/**网关广播地址*/
	private String broadcast;
	/**网卡MAC地址*/
	private String hwaddr;
	/**子网掩码*/
	private String netmask;
	/**网卡描述信息*/
	private String description;
	/**子网掩码*/
	private String type;
	/**网络配置详细信息*/
	private NetInterfaceConfig cfg;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBroadcast() {
		return broadcast;
	}
	public void setBroadcast(String broadcast) {
		this.broadcast = broadcast;
	}
	public String getHwaddr() {
		return hwaddr;
	}
	public void setHwaddr(String hwaddr) {
		this.hwaddr = hwaddr;
	}
	public String getNetmask() {
		return netmask;
	}
	public void setNetmask(String netmask) {
		this.netmask = netmask;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public NetInterfaceConfig getCfg() {
		return cfg;
	}
	public void setCfg(NetInterfaceConfig cfg) {
		this.cfg = cfg;
	}
}
