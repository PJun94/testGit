package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.domain.BoardVO;

public interface BoardMapper {
	
	@Select("SELECT * FROM TB1_BOARD WHERE BNO > 0")
	public List<BoardVO> getList();
}
