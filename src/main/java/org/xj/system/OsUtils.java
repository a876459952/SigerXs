package org.xj.system;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.hyperic.sigar.Cpu;
import org.hyperic.sigar.CpuPerc;
import org.hyperic.sigar.FileSystem;
import org.hyperic.sigar.FileSystemUsage;
import org.hyperic.sigar.Mem;
import org.hyperic.sigar.NetFlags;
import org.hyperic.sigar.NetInterfaceConfig;
import org.hyperic.sigar.NetInterfaceStat;
import org.hyperic.sigar.OperatingSystem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.Swap;
import org.hyperic.sigar.Who;
import org.xj.system.bean.CpuInfo;
import org.xj.system.bean.EthernetInfo;
import org.xj.system.bean.FileSystemInfo;
import org.xj.system.bean.MemoryInfo;
import org.xj.system.bean.NetInfo;
import org.xj.system.bean.OsInfo;
import org.xj.system.bean.PropertyInfo;
import org.xj.system.bean.WhoInfo;
import org.xj.system.config.Config;
import org.xj.system.enums.FileDistType;
import org.xj.system.enums.IFileDistType;

/**
 * @Title: OsUtils.java .<br>
 * @Package org.xj.system .<br>
 * @Description: 系统操作工具类，用于获取 .<br>
 * @author 郑成功 .<br>
 * @email a876459952@qq.com .<br>
 * @date 2019-9-18 上午11:38:06.<br>
 * @version V1.0.<br>
 */
public class OsUtils extends Server{

	/**
	 * @Description: 获取System信息，从jvm获取 .<br>
	 * @throws UnknownHostException .<br>   
	 * @author zcg .<br>
	 * @date 2019-9-18 上午11:58:52.<br>
	 */
	@Override
	public PropertyInfo getPropertyInfo() throws UnknownHostException{
		PropertyInfo info = new PropertyInfo();
		Runtime r = Runtime.getRuntime();
        Properties props = System.getProperties();
        InetAddress addr = InetAddress.getLocalHost();
        Map<String, String> map = System.getenv();
        info.setHostUserName(map.get(Config.Propertys.HOST_USERNAME));
        info.setHostComputername(map.get(Config.Propertys.HOST_COMPUTERNAME));
        info.setHostUserdomain(map.get(Config.Propertys.HOST_USERDOMAIN));
        info.setHostIp(addr.getHostAddress());
        info.setHostName(addr.getHostName());
        info.setJvmTotalMemory(r.totalMemory());
        info.setJvmFreeMemory(r.freeMemory());
        info.setJvmAvailableProcessors(r.availableProcessors());
        info.setJavaVersion(props.getProperty(Config.Propertys.JAVA_VERSION));
        info.setJavaVendor(props.getProperty(Config.Propertys.JAVA_VENDOR));
        info.setJavaVendorUrl(props.getProperty(Config.Propertys.JAVA_VENDOR_URL));
        info.setJavaHome(props.getProperty(Config.Propertys.JAVA_HOME));
        info.setJavaVmSpecificationVersion(props.getProperty(Config.Propertys.JAVA_VM_SPECIFICATION_VERSION));
        info.setJavaVmSpecificationVendor(props.getProperty(Config.Propertys.JAVA_VM_SPECIFICATION_VENDOR));
        info.setJavaVmSpecificationName(props.getProperty(Config.Propertys.JAVA_VM_SPECIFICATION_NAME));
        info.setJavaVmVersion(props.getProperty(Config.Propertys.JAVA_VM_VERSION));
        info.setJavaVmVendor(props.getProperty(Config.Propertys.JAVA_VM_VENDOR));
        info.setJavaVmName(props.getProperty(Config.Propertys.JAVA_VM_NAME));
        info.setJavaSpecificationVersion(props.getProperty(Config.Propertys.JAVA_SPECIFICATION_VERSION));
        info.setJavaSpecificationVender(props.getProperty(Config.Propertys.JAVA_SPECIFICATION_VENDER));
        info.setJavaSpecificationName(props.getProperty(Config.Propertys.JAVA_SPECIFICATION_NAME));
        info.setJavaClassVersion(props.getProperty(Config.Propertys.JAVA_CLASS_VERSION));
        info.setJavaClassPath(props.getProperty(Config.Propertys.JAVA_CLASS_PATH));
        info.setJavaLibraryPath(props.getProperty(Config.Propertys.JAVA_LIBRARY_PATH));
        info.setJavaIoImpdir(props.getProperty(Config.Propertys.JAVA_IO_TMPDIR));
        info.setJavaExtDirs(props.getProperty(Config.Propertys.JAVA_EXT_DIRS));
        info.setOsName(props.getProperty(Config.Propertys.OS_NAME));
        info.setOsArch(props.getProperty(Config.Propertys.OS_ARCH));
        info.setOsVersion(props.getProperty(Config.Propertys.OS_VERSION));
        info.setFileSeparator(props.getProperty(Config.Propertys.FILE_SEPARATOR));
        info.setPathSeparator(props.getProperty(Config.Propertys.PATH_SEPARATOR));
        info.setLineSeparator(props.getProperty(Config.Propertys.LINE_SEPARATOR));
        info.setUserName(props.getProperty(Config.Propertys.USER_NAME));
        info.setUserHome(props.getProperty(Config.Propertys.USER_HOME));
        info.setUserDir(props.getProperty(Config.Propertys.USER_DIR));
        return info;
	}
	
	/**
	 * @Description: 获取所有的cpu信息集合 .<br>
	 * @throws SigarException .<br>   
	 * @author zcg .<br>
	 * @date 2019-9-18 下午2:58:23.<br>
	 */
	@Override
	public List<CpuInfo> getCpuInfos() throws SigarException{
		List<CpuInfo> cpuInfoList = new ArrayList<CpuInfo>();
		Sigar sigar = new Sigar();
        org.hyperic.sigar.CpuInfo[] infos = sigar.getCpuInfoList();
        CpuPerc cpuList[] = sigar.getCpuPercList();
        for(int i = 0; i < infos.length; i++){
        	org.hyperic.sigar.CpuInfo info = infos[i];
        	CpuPerc cpu = cpuList[i];
        	CpuInfo cpuInfo = new CpuInfo();
        	int blockName = i + 1;
        	cpuInfo.setBlockName(String.valueOf(blockName));
        	cpuInfo.setMhz(String.valueOf(info.getMhz()));
        	cpuInfo.setVendor(info.getVendor());
        	cpuInfo.setModel(info.getModel());
        	cpuInfo.setCacheSize(String.valueOf(info.getCacheSize()));
        	cpuInfo.setCoresPerSocket(String.valueOf(info.getCoresPerSocket()));
        	cpuInfo.setTotalCores(String.valueOf(info.getTotalCores()));
        	cpuInfo.setTotalSockets(String.valueOf(info.getTotalSockets()));
        	cpuInfo.setUser(String.valueOf(cpu.getUser()));
        	cpuInfo.setSys(String.valueOf(cpu.getSys()));
        	cpuInfo.setWait(String.valueOf(cpu.getWait()));
        	cpuInfo.setNice(String.valueOf(cpu.getNice()));
        	cpuInfo.setIdle(String.valueOf(cpu.getIdle()));
        	cpuInfo.setCombined(String.valueOf(cpu.getCombined()));
        	cpuInfo.setIrq(String.valueOf(cpu.getIrq()));
        	cpuInfo.setSoftIrq(String.valueOf(cpu.getSoftIrq()));
        	cpuInfo.setStolen(String.valueOf(cpu.getStolen()));
        	cpuInfoList.add(cpuInfo);
        }
        return cpuInfoList;
	}
	
	@Override
	public MemoryInfo getMemoryInfo() throws SigarException{
		MemoryInfo info = new MemoryInfo();
		Sigar sigar = new Sigar();
        Mem mem = sigar.getMem();
        Swap swap = sigar.getSwap();
        info.setMemTotal(mem.getTotal());
        info.setMemUsed(mem.getUsed());
        info.setMemFree(mem.getFree());
        info.setMem(mem);
        info.setSwapTotal(swap.getTotal());
        info.setSwapUsed(swap.getUsed());
        info.setSwapFree(swap.getFree());
        info.setSwap(swap);
        return info;
	}

	@Override
	public Cpu getCpu() throws SigarException {
		Sigar sigar = new Sigar();
		return sigar.getCpu();
	}
	
	@Override
	public CpuPerc getCpuPerc() throws SigarException {
		Sigar sigar = new Sigar();
		return sigar.getCpuPerc();
	}

	@Override
	public OsInfo getOsInfo() {
		OperatingSystem os = OperatingSystem.getInstance();
		OsInfo info = new OsInfo();
		info.setArch(os.getArch());
		info.setCpuEndian(os.getCpuEndian());
		info.setDataModel(os.getDataModel());
		info.setDescription(os.getDescription());
		info.setVendor(os.getVendor());
		info.setVendorCodeName(os.getVendorCodeName());
		info.setVendorName(os.getVendorName());
		info.setVendorVersion(os.getVendorVersion());
		info.setVersion(os.getVersion());
		info.setOs(os);
		return info;
	}

	@Override
	public OperatingSystem getOs() {
		return OperatingSystem.getInstance();
	}

	@Override
	public List<WhoInfo> getWhoInfos() throws SigarException {
		List<WhoInfo> whoInfos = new ArrayList<WhoInfo>();
		String dateFormat = "yyyy-MM-dd HH:mm:ss";
		Sigar sigar = new Sigar();
        Who whos[] = sigar.getWhoList();
        if (whos != null && whos.length > 0) {
            for (int i = 0; i < whos.length; i++) {
            	Who who = whos[i];
            	WhoInfo whoInfo = new WhoInfo();
            	whoInfo.setDevice(who.getDevice());
            	whoInfo.setHost(who.getHost());
            	whoInfo.setUser(who.getUser());
            	whoInfo.setTime(transferLongToDate(dateFormat, who.getTime()*1000));
            	whoInfo.setWho(who);
            	whoInfos.add(whoInfo);
            }
        }
		return whoInfos;
	}

	@Override
	public List<FileSystemInfo> getFileSystemInfos() throws Exception {
		List<FileSystemInfo> fileSystemInfos = new ArrayList<FileSystemInfo>();
		Sigar sigar = new Sigar();
        FileSystem fslist[] = sigar.getFileSystemList();
        for (int i = 0; i < fslist.length; i++) {
        	FileSystemInfo fileSystemInfo = new FileSystemInfo();
        	FileSystem fs = fslist[i];
        	fileSystemInfo.setDevName(fs.getDevName());
        	fileSystemInfo.setDirName(fs.getDirName());
        	fileSystemInfo.setFlags(fs.getFlags());
        	fileSystemInfo.setSysTypeName(fs.getSysTypeName());
        	fileSystemInfo.setTypeName(fs.getTypeName());
        	fileSystemInfo.setType(fs.getType());
        	FileDistType fileDistType = FileDistType.getFileDistType(fs.getType());
        	fileSystemInfo.setFileDistType(fileDistType);
        	if(fileDistType.equals(FileDistType.LOCALDISK)){
        		FileSystemUsage usage = sigar.getFileSystemUsage(fs.getDirName());
        		fileSystemInfo.setUsageTotal(usage.getTotal());
        		fileSystemInfo.setUsageFree(usage.getFree());
        		fileSystemInfo.setUsageAvail(usage.getAvail());
        		fileSystemInfo.setUsageUsed(usage.getUsed());
                double usePercent = usage.getUsePercent() * 100D;
                fileSystemInfo.setUsePercent(usePercent);
                fileSystemInfo.setUsage(usage);
        	}
        	fileSystemInfo.setFs(fs);
        	fileSystemInfos.add(fileSystemInfo);
        }
		return fileSystemInfos;
	}
	
	@Override
	public List<NetInfo> getNetInfos() throws SigarException {
		List<NetInfo> netInfos = new ArrayList<NetInfo>();
		Sigar sigar = new Sigar();
        String ifNames[] = sigar.getNetInterfaceList();
        for (int i = 0; i < ifNames.length; i++) {
        	NetInfo netInfo = new NetInfo();
            String netDeviceName = ifNames[i];
            NetInterfaceConfig netConfig = sigar.getNetInterfaceConfig(netDeviceName);
            netInfo.setNetDeviceName(netDeviceName);
            netInfo.setIpAddr(netConfig.getAddress());
            netInfo.setNetmask(netConfig.getNetmask());
            NetInterfaceStat ifstat = sigar.getNetInterfaceStat(netDeviceName);
            netInfo.setNetConfig(netConfig);
            netInfo.setNetInterfaceStat(ifstat);
            netInfos.add(netInfo);
        }
		return netInfos;
	}
	
	@Override
	public List<EthernetInfo> getEthernetInfos() throws SigarException {
		List<EthernetInfo> ethernetInfos = new ArrayList<EthernetInfo>();
		Sigar sigar = new Sigar();
        String[] ifaces = sigar.getNetInterfaceList();
        for (int i = 0; i < ifaces.length; i++) {
        	EthernetInfo ethernetInfo = new EthernetInfo();
            NetInterfaceConfig cfg = sigar.getNetInterfaceConfig(ifaces[i]);
            if (NetFlags.LOOPBACK_ADDRESS.equals(cfg.getAddress()) || (cfg.getFlags() & NetFlags.IFF_LOOPBACK) != 0
                    || NetFlags.NULL_HWADDR.equals(cfg.getHwaddr())) {
                continue;
            }
            ethernetInfo.setName(cfg.getName());
            ethernetInfo.setAddress(cfg.getAddress());
            ethernetInfo.setBroadcast(cfg.getBroadcast());
            ethernetInfo.setDescription(cfg.getDescription());
            ethernetInfo.setHwaddr(cfg.getHwaddr());
            ethernetInfo.setNetmask(cfg.getDescription());
            ethernetInfo.setType(cfg.getType());
            ethernetInfo.setCfg(cfg);
            ethernetInfos.add(ethernetInfo);
        }
		return ethernetInfos;
	}
	
	public static void main(String[] args) {
		OsUtils os = new OsUtils();
		try {
			//获取配置信息
			os.getPropertyInfo();
			//获取cpu信息
			os.getCpuInfos();
			//获取内存信息
			os.getMemoryInfo();
			//获取cpu
			os.getCpu();
			//os.getCpuPerc();
			//获取操作系统信息
			os.getOsInfo();
			//os.getOs();
			//获取操作系统进程用户信息
			os.getWhoInfos();
			//获取磁盘设备信息
			os.getFileSystemInfos();
			//获取网络信息
			os.getNetInfos();
			//获取以太网信息
			os.getEthernetInfos();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
