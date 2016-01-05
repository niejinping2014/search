package xyz.hollysys.search.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import xyz.hollysys.search.model.Shangpin;

public interface ShangpinDAO {
	@Select("SELECT * FROM `hls_shangpin` WHERE `sp_id` = #{sp_id}")
	Shangpin getShangpinById(@Param("sp_id")long sp_id);
	
	@Select("SELECT * FROM `hls_shangpin`")
	List<Shangpin> getAllShangpin();

}
