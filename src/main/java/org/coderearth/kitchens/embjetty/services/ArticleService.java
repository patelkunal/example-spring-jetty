package org.coderearth.kitchens.embjetty.services;

import org.coderearth.kitchens.embjetty.pojo.Article;

/**
 * Created by kunal_patel on 09/02/16.
 */
public interface ArticleService {

	public String saveArticle(final Article anArticle);

	public String getArticle(final String id);

	public String getArticle(final String[] searchTerms);

}
