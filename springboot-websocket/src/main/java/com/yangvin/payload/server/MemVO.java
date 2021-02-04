package com.yangvin.payload.server;

import com.google.common.collect.Lists;
import com.yangvin.model.server.Mem;
import com.yangvin.payload.KV;
import lombok.Data;

import java.util.List;

/**
 * 內存相关信息实体VO
 *
 * @author Y_Kevin
 * @date 2021-02-04 15:06
 */
@Data
public class MemVO {
	List<KV> data = Lists.newArrayList();

	public static MemVO create(Mem mem) {
		MemVO vo = new MemVO();
		vo.data.add(new KV("内存总量", mem.getTotal() + "G"));
		vo.data.add(new KV("已用内存", mem.getUsed() + "G"));
		vo.data.add(new KV("剩余内存", mem.getFree() + "G"));
		vo.data.add(new KV("使用率", mem.getUsage() + "%"));
		return vo;
	}
}
