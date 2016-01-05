package xyz.hollysys.search.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import xyz.hollysys.search.model.Shangpin;
import xyz.hollysys.search.model.ShangpinDetail;

public interface ShangpinDetailDAO {
	@Select("SELECT * FROM `hls_shangpin_detail` WHERE `sp_id` = #{sp_id}")
	ShangpinDetail getShangpinById(@Param("sp_id")long sp_id);
}
