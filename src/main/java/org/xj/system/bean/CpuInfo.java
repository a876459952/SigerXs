package org.xj.system.bean;

/**
 * @Title: CpuInfo.java .<br>
 * @Package org.xj.system.bean .<br>
 * @Description: cpu信息实体 .<br>
 * @author 郑成功 .<br>
 * @email a876459952@qq.com .<br>
 * @date 2019-9-18 上午10:30:14.<br>
 * @version V1.0.<br>
 */
public class CpuInfo {

	/**cpu块名*/
	private String blockName;
	/**CPU的总量MHz*/
	private String mhz;
	/**获得CPU的卖主，如：Intel*/
	private String vendor;
	/**获得CPU的类别，如：Celeron*/
	private String model;
	/**缓冲存储器数量*/
	private String cacheSize;
	/**CPU总核数*/
	private String coresPerSocket;
	/**CPU总数*/
	private String totalCores;
	/**物理cpu总数数量*/
	private String totalSockets;
	/**用户态使用的cpu时间比*/
	private String user;
	/**系统态(内核态)使用的cpu时间比*/
	private String sys;
	/**cpu等待磁盘写入完成时间*/
	private String wait;
	/**用做nice加权的进程分配的用户态cpu时间比*/
	private String nice;
	/**空闲的cpu时间比*/
	private String idle;
	/**总的使用时间比*/
	private String combined;
	/**CPU中断请求时间*/
	private String irq;
	/**CPU软中断请求时间*/
	private String softIrq;
	/**CPU虚拟机偷取时间*/
	private String stolen;
	
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	public String getMhz() {
		return mhz;
	}
	public void setMhz(String mhz) {
		this.mhz = mhz;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCacheSize() {
		return cacheSize;
	}
	public void setCacheSize(String cacheSize) {
		this.cacheSize = cacheSize;
	}
	public String getCoresPerSocket() {
		return coresPerSocket;
	}
	public void setCoresPerSocket(String coresPerSocket) {
		this.coresPerSocket = coresPerSocket;
	}
	public String getTotalCores() {
		return totalCores;
	}
	public void setTotalCores(String totalCores) {
		this.totalCores = totalCores;
	}
	public String getTotalSockets() {
		return totalSockets;
	}
	public void setTotalSockets(String totalSockets) {
		this.totalSockets = totalSockets;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSys() {
		return sys;
	}
	public void setSys(String sys) {
		this.sys = sys;
	}
	public String getWait() {
		return wait;
	}
	public void setWait(String wait) {
		this.wait = wait;
	}
	public String getNice() {
		return nice;
	}
	public void setNice(String nice) {
		this.nice = nice;
	}
	public String getIdle() {
		return idle;
	}
	public void setIdle(String idle) {
		this.idle = idle;
	}
	public String getCombined() {
		return combined;
	}
	public void setCombined(String combined) {
		this.combined = combined;
	}
	public String getIrq() {
		return irq;
	}
	public void setIrq(String irq) {
		this.irq = irq;
	}
	public String getSoftIrq() {
		return softIrq;
	}
	public void setSoftIrq(String softIrq) {
		this.softIrq = softIrq;
	}
	public String getStolen() {
		return stolen;
	}
	public void setStolen(String stolen) {
		this.stolen = stolen;
	}
	
}
