package com.yangvin.util;

import cn.hutool.core.lang.Dict;
import com.yangvin.model.Server;
import com.yangvin.payload.ServerVO;

/**
 * 服务器转换工具类
 *
 * @author Y_Kevin
 * @date 2021-02-04 14:55
 */
public class ServerUtil {
	/**
	 * 包装成 ServerVO
	 *
	 * @param server server
	 * @return ServerVO
	 */
	public static ServerVO wrapServerVO(Server server) {
		ServerVO serverVO = new ServerVO();
		serverVO.create(server);
		return serverVO;
	}

	/**
	 * 包装成 Dict
	 *
	 * @param serverVO serverVO
	 * @return Dict
	 */
	public static Dict wrapServerDict(ServerVO serverVO) {
		return Dict.create().set("cpu", serverVO.getCpu().get(0).getData())
				.set("mem", serverVO.getMem().get(0).getData())
				.set("sys", serverVO.getSys().get(0).getData())
				.set("jvm", serverVO.getJvm().get(0).getData())
				.set("sysFile", serverVO.getSysFile().get(0).getData());
	}
}
