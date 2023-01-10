package com.csvconverter.temp_generated;

import com.csvconverter.temp_generated.CityTarget;
import com.csvconverter.temp_generated.CityTargetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityTargetMapper {
    long countByExample(CityTargetExample example);

    int deleteByExample(CityTargetExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CityTarget row);

    int insertSelective(CityTarget row);

    List<CityTarget> selectByExample(CityTargetExample example);

    CityTarget selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") CityTarget row, @Param("example") CityTargetExample example);

    int updateByExample(@Param("row") CityTarget row, @Param("example") CityTargetExample example);

    int updateByPrimaryKeySelective(CityTarget row);

    int updateByPrimaryKey(CityTarget row);
}