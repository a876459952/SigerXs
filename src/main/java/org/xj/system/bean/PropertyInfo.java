package org.xj.system.bean;

/**
 * @Title: PropertyInfo.java .<br>
 * @Package org.xjSystem.bean .<br>
 * @Description: System信息，从jvm获取 .<br>
 * @author 郑成功 .<br>
 * @email a876459952@qq.com .<br>
 * @date 2019-9-18 上午10:37:47.<br>
 * @version V1.0.<br>
 */
public class PropertyInfo {

	/**计算机用户名*/
	private String hostUserName;
	/**计算机名*/
	private String hostComputername;
	/**计算机域名*/
	private String hostUserdomain;
	/**本地主机ip*/
	private String hostIp;
	/**本地主机名*/
	private String hostName;
	/**JVM可以使用的总内存*/
	private long jvmTotalMemory;
	/**JVM可以使用的剩余内存*/
	private long jvmFreeMemory;
	/**JVM可以使用的处理器个数*/
	private int jvmAvailableProcessors;
	/**Java的运行环境版本*/ 
	private String javaVersion;
	/**Java的运行环境供应商*/ 
	private String javaVendor;
	/**Java供应商的URL*/ 
	private String javaVendorUrl;
	/**Java的安装路径*/ 
	private String javaHome;
	/**Java的虚拟机规范版本*/ 
	private String javaVmSpecificationVersion;
	/**Java的虚拟机规范供应商*/ 
	private String javaVmSpecificationVendor;
	/**Java的虚拟机规范名称*/ 
	private String javaVmSpecificationName;
	/**Java的虚拟机实现版本*/ 
	private String javaVmVersion;
	/**Java的虚拟机实现供应商*/ 
	private String javaVmVendor;
	/**Java的虚拟机实现名称*/ 
	private String javaVmName;
	/**Java运行时环境规范版本*/ 
	private String javaSpecificationVersion;
	/**Java运行时环境规范供应商*/ 
	private String javaSpecificationVender;
	/**Java运行时环境规范名称*/ 
	private String javaSpecificationName;
	/**Java的类格式版本号*/ 
	private String javaClassVersion;
	/**Java的类路径*/ 
	private String javaClassPath;
	/**加载库时搜索的路径列表*/ 
	private String javaLibraryPath;
	/**默认的临时文件路径*/ 
	private String javaIoImpdir;
	/**一个或多个扩展目录的路径*/ 
	private String javaExtDirs;
	/**操作系统的名称*/ 
	private String osName;
	/**操作系统的构架*/ 
	private String osArch;
	/**操作系统的版本*/ 
	private String osVersion;
	/**文件分隔符*/ 
	private String fileSeparator;
	/**路径分隔符*/ 
	private String pathSeparator;
	/**行分隔符*/ 
	private String lineSeparator;
	/**用户的账户名称*/ 
	private String userName;
	/**用户的主目录*/ 
	private String userHome;
	/**用户的当前工作目录*/ 
	private String userDir;
	
	public String getHostUserName() {
		return hostUserName;
	}
	public void setHostUserName(String hostUserName) {
		this.hostUserName = hostUserName;
	}
	public String getHostComputername() {
		return hostComputername;
	}
	public void setHostComputername(String hostComputername) {
		this.hostComputername = hostComputername;
	}
	public String getHostUserdomain() {
		return hostUserdomain;
	}
	public void setHostUserdomain(String hostUserdomain) {
		this.hostUserdomain = hostUserdomain;
	}
	public String getHostIp() {
		return hostIp;
	}
	public void setHostIp(String hostIp) {
		this.hostIp = hostIp;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public long getJvmTotalMemory() {
		return jvmTotalMemory;
	}
	public void setJvmTotalMemory(long jvmTotalMemory) {
		this.jvmTotalMemory = jvmTotalMemory;
	}
	public long getJvmFreeMemory() {
		return jvmFreeMemory;
	}
	public void setJvmFreeMemory(long jvmFreeMemory) {
		this.jvmFreeMemory = jvmFreeMemory;
	}
	public int getJvmAvailableProcessors() {
		return jvmAvailableProcessors;
	}
	public void setJvmAvailableProcessors(int jvmAvailableProcessors) {
		this.jvmAvailableProcessors = jvmAvailableProcessors;
	}
	public String getJavaVersion() {
		return javaVersion;
	}
	public void setJavaVersion(String javaVersion) {
		this.javaVersion = javaVersion;
	}
	public String getJavaVendor() {
		return javaVendor;
	}
	public void setJavaVendor(String javaVendor) {
		this.javaVendor = javaVendor;
	}
	public String getJavaVendorUrl() {
		return javaVendorUrl;
	}
	public void setJavaVendorUrl(String javaVendorUrl) {
		this.javaVendorUrl = javaVendorUrl;
	}
	public String getJavaHome() {
		return javaHome;
	}
	public void setJavaHome(String javaHome) {
		this.javaHome = javaHome;
	}
	public String getJavaVmSpecificationVersion() {
		return javaVmSpecificationVersion;
	}
	public void setJavaVmSpecificationVersion(String javaVmSpecificationVersion) {
		this.javaVmSpecificationVersion = javaVmSpecificationVersion;
	}
	public String getJavaVmSpecificationVendor() {
		return javaVmSpecificationVendor;
	}
	public void setJavaVmSpecificationVendor(String javaVmSpecificationVendor) {
		this.javaVmSpecificationVendor = javaVmSpecificationVendor;
	}
	public String getJavaVmSpecificationName() {
		return javaVmSpecificationName;
	}
	public void setJavaVmSpecificationName(String javaVmSpecificationName) {
		this.javaVmSpecificationName = javaVmSpecificationName;
	}
	public String getJavaVmVersion() {
		return javaVmVersion;
	}
	public void setJavaVmVersion(String javaVmVersion) {
		this.javaVmVersion = javaVmVersion;
	}
	public String getJavaVmVendor() {
		return javaVmVendor;
	}
	public void setJavaVmVendor(String javaVmVendor) {
		this.javaVmVendor = javaVmVendor;
	}
	public String getJavaVmName() {
		return javaVmName;
	}
	public void setJavaVmName(String javaVmName) {
		this.javaVmName = javaVmName;
	}
	public String getJavaSpecificationVersion() {
		return javaSpecificationVersion;
	}
	public void setJavaSpecificationVersion(String javaSpecificationVersion) {
		this.javaSpecificationVersion = javaSpecificationVersion;
	}
	public String getJavaSpecificationVender() {
		return javaSpecificationVender;
	}
	public void setJavaSpecificationVender(String javaSpecificationVender) {
		this.javaSpecificationVender = javaSpecificationVender;
	}
	public String getJavaSpecificationName() {
		return javaSpecificationName;
	}
	public void setJavaSpecificationName(String javaSpecificationName) {
		this.javaSpecificationName = javaSpecificationName;
	}
	public String getJavaClassVersion() {
		return javaClassVersion;
	}
	public void setJavaClassVersion(String javaClassVersion) {
		this.javaClassVersion = javaClassVersion;
	}
	public String getJavaClassPath() {
		return javaClassPath;
	}
	public void setJavaClassPath(String javaClassPath) {
		this.javaClassPath = javaClassPath;
	}
	public String getJavaLibraryPath() {
		return javaLibraryPath;
	}
	public void setJavaLibraryPath(String javaLibraryPath) {
		this.javaLibraryPath = javaLibraryPath;
	}
	public String getJavaIoImpdir() {
		return javaIoImpdir;
	}
	public void setJavaIoImpdir(String javaIoImpdir) {
		this.javaIoImpdir = javaIoImpdir;
	}
	public String getJavaExtDirs() {
		return javaExtDirs;
	}
	public void setJavaExtDirs(String javaExtDirs) {
		this.javaExtDirs = javaExtDirs;
	}
	public String getOsName() {
		return osName;
	}
	public void setOsName(String osName) {
		this.osName = osName;
	}
	public String getOsArch() {
		return osArch;
	}
	public void setOsArch(String osArch) {
		this.osArch = osArch;
	}
	public String getOsVersion() {
		return osVersion;
	}
	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
	}
	public String getFileSeparator() {
		return fileSeparator;
	}
	public void setFileSeparator(String fileSeparator) {
		this.fileSeparator = fileSeparator;
	}
	public String getPathSeparator() {
		return pathSeparator;
	}
	public void setPathSeparator(String pathSeparator) {
		this.pathSeparator = pathSeparator;
	}
	public String getLineSeparator() {
		return lineSeparator;
	}
	public void setLineSeparator(String lineSeparator) {
		this.lineSeparator = lineSeparator;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserHome() {
		return userHome;
	}
	public void setUserHome(String userHome) {
		this.userHome = userHome;
	}
	public String getUserDir() {
		return userDir;
	}
	public void setUserDir(String userDir) {
		this.userDir = userDir;
	}

}
