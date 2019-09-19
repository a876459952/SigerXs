package org.xj.system.bean;

import org.hyperic.sigar.OperatingSystem;

/**
 * @Title: OsInfo.java .<br>
 * @Package org.xj.system.bean .<br>
 * @Description: 操作系统信息实体 .<br>
 * @author 郑成功 .<br>
 * @email a876459952@qq.com .<br>
 * @date 2019-9-18 上午10:29:41.<br>
 * @version V1.0.<br>
 */
public class OsInfo {
	
    /**操作系统*/
    private String arch;
    /**操作系统CpuEndian*/
    private String cpuEndian;
    /**操作系统DataModel*/
    private String dataModel;
    /**操作系统的描述*/
    private String description;
    /**操作系统的卖主*/
    private String vendor;
    /**操作系统的卖主名*/
    private String vendorCodeName;
    /**操作系统名称*/
    private String vendorName;
    /**操作系统卖主类型*/
    private String vendorVersion;
    /**操作系统的版本号*/
    private String version;
    /**获取属性全信息*/
    private OperatingSystem os;
    
	public String getArch() {
		return arch;
	}
	public void setArch(String arch) {
		this.arch = arch;
	}
	public String getCpuEndian() {
		return cpuEndian;
	}
	public void setCpuEndian(String cpuEndian) {
		this.cpuEndian = cpuEndian;
	}
	public String getDataModel() {
		return dataModel;
	}
	public void setDataModel(String dataModel) {
		this.dataModel = dataModel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getVendorCodeName() {
		return vendorCodeName;
	}
	public void setVendorCodeName(String vendorCodeName) {
		this.vendorCodeName = vendorCodeName;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getVendorVersion() {
		return vendorVersion;
	}
	public void setVendorVersion(String vendorVersion) {
		this.vendorVersion = vendorVersion;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public OperatingSystem getOs() {
		return os;
	}
	public void setOs(OperatingSystem os) {
		this.os = os;
	}

}
