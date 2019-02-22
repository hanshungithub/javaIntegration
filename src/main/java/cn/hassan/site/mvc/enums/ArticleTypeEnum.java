package cn.hassan.site.mvc.enums;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/2/22 9:39
 * Description:
 */
public enum ArticleTypeEnum {
	JAVA	(1,"java"),
	DUBBO	(2,"dubbo"),
	SPRING	(4,"spring"),
	MYBATIS	(8,"mybatis");

	private int code;
	private String description;

	ArticleTypeEnum(int code,String description) {
		this.code = code;
		this.description = description;
	}

	public int code() {
		return code;
	}

	public String description() {
		return description;
	}

	public static ArticleTypeEnum find(int code) {
		for (ArticleTypeEnum at : ArticleTypeEnum.values()) {
			if (at.code == code) {
				return at;
			}
		}

		return null;
	}
}
