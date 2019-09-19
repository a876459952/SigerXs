package org.xj.system.enums;

/**
 * @Title: FileDist.java .<br>
 * @Package org.xj.system.enums .<br>
 * @Description: 系统文件磁盘枚举 .<br>
 * @author 郑成功 .<br>
 * @email a876459952@qq.com .<br>
 * @date 2019-9-18 下午4:57:58.<br>
 * @version V1.0.<br>
 */
public enum FileDistType implements IFileDistType{
	
	UNKNOWN(0,"TYPE_UNKNOWN","未知"),NONE(1,"TYPE_NONE","无磁盘"),
	LOCALDISK(2,"TYPE_LOCAL_DISK","本地磁盘"),NETWORK(3,"TYPE_NETWORK","网络"),
	RAMDISK(4,"TYPE_RAM_DISK","闪存"),CDROM(5,"TYPE_CDROM","光驱"),
	SWAP(6,"TYPE_SWAP","页面交换");
	
	public int type;
	private String typeFlag;
	private String typeName;
	
	private FileDistType(int type,String typeFlag,String typeName){
		this.type = type;
		this.typeFlag = typeFlag;
		this.typeName = typeName;
	}
	
	@Override
	public int getType() {
		return this.type;
	}

	@Override
	public String getTypeFlag() {
		return this.typeFlag;
	}

	@Override
	public String getTypeName() {
		return this.typeName;
	}

	public static FileDistType getFileDistType(int type) {
		FileDistType fileDistType = null;
		switch (type) {
		case 0:
			fileDistType = UNKNOWN;
            break;
        case 1:
        	fileDistType = NONE;
            break;
        case 2:
        	fileDistType = LOCALDISK;
            break;
        case 3:
        	fileDistType = NETWORK;
            break;
        case 4:
        	fileDistType = RAMDISK;
            break;
        case 5:
        	fileDistType = CDROM;
            break;
        case 6:
        	fileDistType = SWAP;
            break;
        }
		return fileDistType;
	}
	 
}
