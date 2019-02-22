package cn.hassan.site.mybatis.dao;

import cn.hassan.site.mvc.pojo.Article;
import org.apache.ibatis.annotations.Param;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/2/22 10:11
 * Description:
 */
public interface ArticleDao {
	Article findOne(@Param("id") int id);
}
