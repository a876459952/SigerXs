package org.xj.system.bean;

import org.hyperic.sigar.FileSystem;
import org.hyperic.sigar.FileSystemUsage;
import org.xj.system.enums.FileDistType;

/**
 * @Title: FileSystemInfo.java .<br>
 * @Package org.xj.system.bean .<br>
 * @Description: 文件系统存盘信息 .<br>
 * @author 郑成功 .<br>
 * @email a876459952@qq.com .<br>
 * @date 2019-9-18 上午10:31:44.<br>
 * @version V1.0.<br>
 */
public class FileSystemInfo {
	
	/**分区的盘符名称*/
    private String devName;
    /**分区的盘符名称*/
    private String dirName;
    /**分区的盘符标志*/
    private long flags;
    /**文件系统类型，比如 FAT32、NTFS*/
    private String sysTypeName;
    /**文件系统类型名，比如本地硬盘、光驱、网络文件系统等*/
    private String typeName;
    /**文件系统类型*/
    private int type;
    /**文件系统总大小（KB）*/
    private long usageTotal;
    /**文件系统剩余大小（KB）*/
    private long usageFree;
    /**文件系统可用大小（KB）*/
    private long usageAvail;
    /**文件系统已经使用量（KB）*/
    private long usageUsed;
    /**文件系统资源的利用率*/
    private double usePercent;
	/**磁盘类型转换*/
	private FileDistType fileDistType;
	/**磁盘信息*/
	private FileSystem fs;
	/**磁盘用途*/
	private FileSystemUsage usage;
	
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public String getDirName() {
		return dirName;
	}
	public void setDirName(String dirName) {
		this.dirName = dirName;
	}
	public long getFlags() {
		return flags;
	}
	public void setFlags(long flags) {
		this.flags = flags;
	}
	public String getSysTypeName() {
		return sysTypeName;
	}
	public void setSysTypeName(String sysTypeName) {
		this.sysTypeName = sysTypeName;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public long getUsageTotal() {
		return usageTotal;
	}
	public void setUsageTotal(long usageTotal) {
		this.usageTotal = usageTotal;
	}
	public long getUsageFree() {
		return usageFree;
	}
	public void setUsageFree(long usageFree) {
		this.usageFree = usageFree;
	}
	public long getUsageAvail() {
		return usageAvail;
	}
	public void setUsageAvail(long usageAvail) {
		this.usageAvail = usageAvail;
	}
	public long getUsageUsed() {
		return usageUsed;
	}
	public void setUsageUsed(long usageUsed) {
		this.usageUsed = usageUsed;
	}
	public double getUsePercent() {
		return usePercent;
	}
	public void setUsePercent(double usePercent) {
		this.usePercent = usePercent;
	}
	public FileDistType getFileDistType() {
		return fileDistType;
	}
	public void setFileDistType(FileDistType fileDistType) {
		this.fileDistType = fileDistType;
	}
	public FileSystem getFs() {
		return fs;
	}
	public void setFs(FileSystem fs) {
		this.fs = fs;
	}
	public FileSystemUsage getUsage() {
		return usage;
	}
	public void setUsage(FileSystemUsage usage) {
		this.usage = usage;
	}
}
