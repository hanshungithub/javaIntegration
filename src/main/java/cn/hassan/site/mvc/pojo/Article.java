package cn.hassan.site.mvc.pojo;

import cn.hassan.site.mvc.enums.ArticleTypeEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/2/22 9:37
 * Description:
 */
@Data
public class Article implements Serializable {
	private Integer id;
	private String title;
	private ArticleTypeEnum type;
	private Author author;
	private String content;
	private Date createTime;
}
