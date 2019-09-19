package org.xj.system.bean;

import org.hyperic.sigar.NetInterfaceConfig;
import org.hyperic.sigar.NetInterfaceStat;

/**
 * @Title: NetInfo.java .<br>
 * @Package org.xj.system.bean .<br>
 * @Description: 网络信息实体 .<br>
 * @author 郑成功 .<br>
 * @email a876459952@qq.com .<br>
 * @date 2019-9-18 上午10:33:13.<br>
 * @version V1.0.<br>
 */
public class NetInfo {

	/**网络设备名*/
	private String netDeviceName;
	/**IP地址*/
	private String ipAddr;
	/**子网掩码*/
	private String netmask;
	/**网络配置*/
	private NetInterfaceConfig netConfig;
	/**网络状态*/
	private NetInterfaceStat netInterfaceStat;
	
	public String getNetDeviceName() {
		return netDeviceName;
	}
	public void setNetDeviceName(String netDeviceName) {
		this.netDeviceName = netDeviceName;
	}
	public String getIpAddr() {
		return ipAddr;
	}
	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}
	public String getNetmask() {
		return netmask;
	}
	public void setNetmask(String netmask) {
		this.netmask = netmask;
	}
	public NetInterfaceConfig getNetConfig() {
		return netConfig;
	}
	public void setNetConfig(NetInterfaceConfig netConfig) {
		this.netConfig = netConfig;
	}
	public NetInterfaceStat getNetInterfaceStat() {
		return netInterfaceStat;
	}
	public void setNetInterfaceStat(NetInterfaceStat netInterfaceStat) {
		this.netInterfaceStat = netInterfaceStat;
	}
}
