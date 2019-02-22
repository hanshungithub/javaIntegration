package cn.hassan.site.mybatis.dao;

import cn.hassan.site.mvc.pojo.Author;
import org.apache.ibatis.annotations.Param;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/2/22 10:12
 * Description:
 */
public interface AuthorDao {
	Author findOne(@Param("id") int id);
}
