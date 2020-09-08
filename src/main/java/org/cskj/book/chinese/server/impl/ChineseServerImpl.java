package org.cskj.book.chinese.server.impl;
import java.util.List;
import org.cskj.book.chinese.bean.Chinese;
import org.cskj.book.chinese.mapper.ChineseMapper;
import org.cskj.book.chinese.server.ChineseServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ChineseServerImpl implements ChineseServer {

	@Autowired
	private ChineseMapper chineseMapper;
	@Override
	public List<Chinese> queryChineseAll() {
		return chineseMapper.queryChineseAll();
	}

}
