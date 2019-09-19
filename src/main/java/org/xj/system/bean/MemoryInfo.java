package org.xj.system.bean;

import org.hyperic.sigar.Mem;
import org.hyperic.sigar.Swap;

/**
 * @Title: MemoryInfo.java .<br>
 * @Package org.xj.system.bean .<br>
 * @Description: 内存信息实体 .<br>
 * @author 郑成功 .<br>
 * @email a876459952@qq.com .<br>
 * @date 2019-9-18 上午10:29:57.<br>
 * @version V1.0.<br>
 */
public class MemoryInfo {

	/**内存总量*/
	private long memTotal;
	/**当前内存使用量*/
	private long memUsed;
	/**当前内存剩余量*/
	private long memFree;
	/**交换区内存总量*/
	private long swapTotal;
	/**交换区内存使用量*/
	private long swapUsed;
	/**交换区内存剩余量*/
	private long swapFree;
	/**内存信息*/
	private Mem mem;
	/**交换区信息*/
	private Swap swap;
	
	
	public long getMemTotal() {
		return memTotal;
	}
	public void setMemTotal(long memTotal) {
		this.memTotal = memTotal;
	}
	public long getMemUsed() {
		return memUsed;
	}
	public void setMemUsed(long memUsed) {
		this.memUsed = memUsed;
	}
	public long getMemFree() {
		return memFree;
	}
	public void setMemFree(long memFree) {
		this.memFree = memFree;
	}
	public long getSwapTotal() {
		return swapTotal;
	}
	public void setSwapTotal(long swapTotal) {
		this.swapTotal = swapTotal;
	}
	public long getSwapUsed() {
		return swapUsed;
	}
	public void setSwapUsed(long swapUsed) {
		this.swapUsed = swapUsed;
	}
	public long getSwapFree() {
		return swapFree;
	}
	public void setSwapFree(long swapFree) {
		this.swapFree = swapFree;
	}
	public Mem getMem() {
		return mem;
	}
	public void setMem(Mem mem) {
		this.mem = mem;
	}
	public Swap getSwap() {
		return swap;
	}
	public void setSwap(Swap swap) {
		this.swap = swap;
	}
	
}
