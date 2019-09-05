package tws.repository;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import tws.entity.Box;

public interface BoxMapper {

    List<Box> selectAllByStatus(@Param("status") String status);

    int insert(@Param("o") Box orderTable);

    int updatePatchPackageDateByOrderNum(@Param("num") String num, @Param("date") Date date);

}
