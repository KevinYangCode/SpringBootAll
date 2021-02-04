package com.yangvin.controller;

import cn.hutool.core.lang.Dict;
import com.yangvin.model.Server;
import com.yangvin.payload.ServerVO;
import com.yangvin.util.ServerUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务器监控Controller
 *
 * @author Y_Kevin
 * @date 2021-02-04 14:48
 */
@RestController
@RequestMapping("/server")
public class ServerController {
	@GetMapping
	public Dict serverInfo() throws Exception {
		Server server = new Server();
		server.copyTo();
		ServerVO serverVO = ServerUtil.wrapServerVO(server);
		return ServerUtil.wrapServerDict(serverVO);
	}
}
