package org.xj.system;

import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hyperic.sigar.Cpu;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.OperatingSystem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.xj.system.bean.CpuInfo;
import org.xj.system.bean.EthernetInfo;
import org.xj.system.bean.FileSystemInfo;
import org.xj.system.bean.MemoryInfo;
import org.xj.system.bean.NetInfo;
import org.xj.system.bean.OsInfo;
import org.xj.system.bean.PropertyInfo;
import org.xj.system.bean.WhoInfo;

public abstract class Server extends Sigar{
	
	/**
	 * @Description: 获取System信息，从jvm获取 .<br>
	 * @throws UnknownHostException .<br>   
	 * @author zcg .<br>
	 * @date 2019-9-18 上午11:58:52.<br>
	 */
	public abstract PropertyInfo getPropertyInfo() throws UnknownHostException;
	
	/**
	 * @Description: 获取所有的cpu信息集合 .<br>
	 * @throws SigarException .<br>   
	 * @author zcg .<br>
	 * @date 2019-9-18 下午2:58:23.<br>
	 */
	public abstract List<CpuInfo> getCpuInfos() throws SigarException;
	
	/**
	 * @Description: 获取内存主要信息 .<br>
	 * @throws SigarException .<br>   
	 * @author zcg .<br>
	 * @date 2019-9-18 下午3:40:03.<br>
	 */
	public abstract MemoryInfo getMemoryInfo() throws SigarException;

	/**
	 * @Description: 获取总cpu全部信息 .<br>
	 * @throws SigarException .<br>   
	 * @author zcg .<br>
	 * @date 2019-9-18 下午3:40:23.<br>
	 */
	public abstract Cpu getCpu() throws SigarException;

	public abstract CpuPerc getCpuPerc() throws SigarException;
	
	/**
	 * @Description: 获取操作系统主要信息 .<br>
	 * @author zcg .<br>
	 * @date 2019-9-18 下午3:53:42.<br>
	 */
	public abstract OsInfo getOsInfo();
	
	/**
	 * @Description: 获取操作系统信息 .<br>
	 * @author zcg .<br>
	 * @date 2019-9-18 下午3:53:58.<br>
	 */
	public abstract OperatingSystem getOs();
	
	/**
	 * @Description: 获取进程用户 .<br>
	 * @author zcg .<br>
	 * @date 2019-9-18 下午4:13:44.<br>
	 */
	public abstract List<WhoInfo> getWhoInfos() throws SigarException;
	
	/**
	 * @Description: TODO .<br>
	 * @return .<br>   
	 * @author zcg .<br>
	 * @date 2019-9-18 下午4:28:56.<br>
	 */
	public abstract List<FileSystemInfo> getFileSystemInfos() throws Exception;
	
	/**
	 * @Description: 获取网络信息 .<br>
	 * @throws SigarException .<br>   
	 * @author zcg .<br>
	 * @date 2019-9-19 上午9:01:51.<br>
	 */
	public abstract List<NetInfo> getNetInfos() throws SigarException;
	
	/**
	 * @Description: 获取以太网信息列表 .<br>
	 * @throws SigarException .<br>   
	 * @author zcg .<br>
	 * @date 2019-9-19 上午9:31:17.<br>
	 */
	public abstract List<EthernetInfo> getEthernetInfos() throws SigarException;
	
	/**
	 * @Description: 时间转换成日期字符串 .<br>
	 * @param dateFormat 格式.<br>
	 * @param millSec 时间戳.<br>
	 * @author zcg .<br>
	 * @date 2019-9-18 下午4:12:11.<br>
	 */
	protected String transferLongToDate(String dateFormat, Long millSec) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        Date date = new Date(millSec);
        return sdf.format(date);
    }
	
}
