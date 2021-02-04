package com.yangvin.payload;

import com.google.common.collect.Lists;
import com.yangvin.model.Server;
import com.yangvin.payload.server.*;
import lombok.Data;

import java.util.List;

/**
 * 服务器信息VO
 *
 * @author Y_Kevin
 * @date 2021-02-04 15:03
 */
@Data
public class ServerVO {
	List<CpuVO> cpu = Lists.newArrayList();
	List<JvmVO> jvm = Lists.newArrayList();
	List<MemVO> mem = Lists.newArrayList();
	List<SysFileVO> sysFile = Lists.newArrayList();
	List<SysVO> sys = Lists.newArrayList();

	public ServerVO create(Server server) {
		cpu.add(CpuVO.create(server.getCpu()));
		jvm.add(JvmVO.create(server.getJvm()));
		mem.add(MemVO.create(server.getMem()));
		sysFile.add(SysFileVO.create(server.getSysFiles()));
		sys.add(SysVO.create(server.getSys()));
		return null;
	}
}
