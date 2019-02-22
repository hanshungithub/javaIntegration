package cn.hassan.site.mvc.pojo;

import cn.hassan.site.mvc.enums.SexEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/2/22 9:36
 * Description:
 */
@Data
public class Author implements Serializable {

	private Integer id;
	private String name;
	private Integer age;
	private SexEnum sex;
	private String email;
	private List<Article> articles;

}
