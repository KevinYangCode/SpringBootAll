package com.yangvin.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 键值匹配
 *
 * @author Y_Kevin
 * @date 2021-02-04 15:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class KV {
	/**
	 * 键
	 */
	private String key;

	/**
	 * 值
	 */
	private Object value;
}
