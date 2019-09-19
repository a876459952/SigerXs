package org.xj.system.config;

/**
 * @Title: Config.java .<br>
 * @Package org.xj.system.config .<br>
 * @Description: 配置信息工具类 .<br>
 * @author 郑成功 .<br>
 * @email a876459952@qq.com .<br>
 * @date 2019-9-18 上午11:20:47.<br>
 * @version V1.0.<br>
 */
public class Config {

	/**
	 * @Title: Config.java .<br>
	 * @Package org.xj.system.config .<br>
	 * @Description: 属性配置主要字段 .<br>
	 * @author 郑成功 .<br>
	 * @email a876459952@qq.com .<br>
	 * @date 2019-9-18 上午11:21:03.<br>
	 * @version V1.0.<br>
	 */
	public static interface Propertys{
		public static final String HOST_USERNAME = "USERNAME";//计算机用户名
		public static final String HOST_COMPUTERNAME = "COMPUTERNAME";//计算机名
		public static final String HOST_USERDOMAIN = "USERDOMAIN";//计算机域名
		public static final String JAVA_VERSION = "java.version";//JAVA的运行环境版本
		public static final String JAVA_VENDOR = "java.vendor";//JAVA的运行环境供应商
		public static final String JAVA_VENDOR_URL = "java.vendor.url";//JAVA供应商的URL
		public static final String JAVA_HOME = "java.home";//JAVA的安装路径
		public static final String JAVA_VM_SPECIFICATION_VERSION = "java.vm.specification.version";//JAVA的虚拟机规范版本
		public static final String JAVA_VM_SPECIFICATION_VENDOR = "java.vm.specification.vendor";//JAVA的虚拟机规范供应商
		public static final String JAVA_VM_SPECIFICATION_NAME = "java.vm.specification.name";//JAVA的虚拟机规范名称
		public static final String JAVA_VM_VERSION = "java.vm.version";//JAVA的虚拟机实现版本
		public static final String JAVA_VM_VENDOR = "java.vm.vendor";//JAVA的虚拟机实现供应商
		public static final String JAVA_VM_NAME = "java.vm.name";//JAVA的虚拟机实现名称
		public static final String JAVA_SPECIFICATION_VERSION = "java.specification.version";//JAVA运行时环境规范版本
		public static final String JAVA_SPECIFICATION_VENDER = "java.specification.vender";//JAVA运行时环境规范供应商
		public static final String JAVA_SPECIFICATION_NAME = "java.specification.name";//JAVA运行时环境规范名称
		public static final String JAVA_CLASS_VERSION = "java.class.version";//JAVA的类格式版本号
		public static final String JAVA_CLASS_PATH = "java.class.path";//JAVA的类路径
		public static final String JAVA_LIBRARY_PATH = "java.library.path";//加载库时搜索的路径列表
		public static final String JAVA_IO_TMPDIR = "java.io.tmpdir";//默认的临时文件路径
		public static final String JAVA_EXT_DIRS = "java.ext.dirs";//一个或多个扩展目录的路径
		public static final String OS_NAME = "os.name";//操作系统的名称
		public static final String OS_ARCH = "os.arch";//操作系统的构架
		public static final String OS_VERSION = "os.version";//操作系统的版本
		public static final String FILE_SEPARATOR = "file.separator";//文件分隔符
		public static final String PATH_SEPARATOR = "path.separator";//路径分隔符
		public static final String LINE_SEPARATOR = "line.separator";//行分隔符
		public static final String USER_NAME = "user.name";//用户的账户名称
		public static final String USER_HOME = "user.home";//用户的主目录
		public static final String USER_DIR = "user.dir";//用户的当前工作目录
	}

}
