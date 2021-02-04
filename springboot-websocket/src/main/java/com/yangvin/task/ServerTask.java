package com.yangvin.task;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.Dict;
import cn.hutool.json.JSONUtil;
import com.yangvin.common.WebSocketConsts;
import com.yangvin.model.Server;
import com.yangvin.payload.ServerVO;
import com.yangvin.util.ServerUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 服务器定时推送任务
 *
 * @author Y_Kevin
 * @date 2021-02-04 15:09
 */
@Slf4j
@Component
public class ServerTask {

	private final SimpMessagingTemplate wsTemplate;

	public ServerTask(SimpMessagingTemplate wsTemplate) {
		this.wsTemplate = wsTemplate;
	}

	/**
	 * 按照标准时间来算，每隔 10s 执行一次
	 */
	@Scheduled(cron = "0/10 * * * * ?")
	public void websocket() throws Exception {
		log.info("【推送消息】开始执行：{}", DateUtil.formatDateTime(new Date()));
		// 查询服务器状态
		Server server = new Server();
		server.copyTo();
		ServerVO serverVO = ServerUtil.wrapServerVO(server);
		Dict dict = ServerUtil.wrapServerDict(serverVO);
		wsTemplate.convertAndSend(WebSocketConsts.PUSH_SERVER, JSONUtil.toJsonStr(dict));
		log.info("【推送消息】执行结束：{}", DateUtil.formatDateTime(new Date()));
	}
}
