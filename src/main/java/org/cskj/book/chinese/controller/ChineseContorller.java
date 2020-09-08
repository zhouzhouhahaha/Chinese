package org.cskj.book.chinese.controller;

import java.util.List;

import org.cskj.book.chinese.bean.Chinese;
import org.cskj.book.chinese.server.ChineseServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChineseContorller {

	@Autowired
	private ChineseServer chineseServer;

	@GetMapping(value = "queryChineseAll")
	public List<Chinese> queryChineseAll() {
		List<Chinese> list = chineseServer.queryChineseAll();
		System.out.println(list);
		return list;

	}

}
