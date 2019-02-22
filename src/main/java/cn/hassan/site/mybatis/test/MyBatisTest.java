package cn.hassan.site.mybatis.test;

import cn.hassan.site.mvc.pojo.Article;
import cn.hassan.site.mvc.pojo.Author;
import cn.hassan.site.mybatis.dao.ArticleDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created with idea
 * Author: hss
 * Date: 2019/2/22 13:39
 * Description:
 */
public class MyBatisTest {
	private SqlSessionFactory sqlSessionFactory;

	@Before
	public void prepare() throws IOException {
		String resource = "config/mybatis-config-test.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		inputStream.close();
	}

	@Test
	public void testOne2One() {
		SqlSession session = sqlSessionFactory.openSession();
		try {

			ArticleDao articleDao = session.getMapper(ArticleDao.class);

			Article article = articleDao.findOne(1);

			Author author = article.getAuthor();
			article.setAuthor(null);

			System.out.println();
			System.out.println("author info:");
			System.out.println(author);
			System.out.println();
			System.out.println("articles info:");
			System.out.println(article);
		} finally {
			session.close();
		}
	}
}
