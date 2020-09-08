package org.cskj.book.chinese.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.cskj.book.chinese.bean.Chinese;

@Mapper
public interface ChineseMapper {
	
	List<Chinese> queryChineseAll();

	
}
