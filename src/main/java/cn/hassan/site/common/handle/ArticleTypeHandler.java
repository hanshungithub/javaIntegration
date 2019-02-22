package cn.hassan.site.common.handle;

import cn.hassan.site.mvc.enums.ArticleTypeEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/2/22 10:53
 * Description:
 */
public class ArticleTypeHandler extends BaseTypeHandler<ArticleTypeEnum> {

	public void setNonNullParameter(PreparedStatement preparedStatement, int i, ArticleTypeEnum articleTypeEnum, JdbcType jdbcType) throws SQLException {
		preparedStatement.setInt(i,articleTypeEnum.code());
	}

	public ArticleTypeEnum getNullableResult(ResultSet resultSet, String s) throws SQLException {
		int code = resultSet.getInt(s);
		return ArticleTypeEnum.find(code);
	}

	public ArticleTypeEnum getNullableResult(ResultSet resultSet, int i) throws SQLException {
		return ArticleTypeEnum.find(resultSet.getInt(i));
	}

	public ArticleTypeEnum getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
		return ArticleTypeEnum.find(callableStatement.getInt(i));
	}

}
