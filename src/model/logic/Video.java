package model.logic;

import java.util.Date;

public class Video implements Comparable<Video> 
{
	private int id;
	
	private Date trendingDate;
	
	private String title;
	
	private String channel;
	
	private int categoryId;
	
	private Date publishDate;
	
	private String tags;
	
	private int views;
	
	private int likes;
	
	private int dislikes;
	
	private String country;
	
	public Video(int pId, Date pTrending, String pTitle, String pChannel, int pCategoryId, Date pPublish, String ptags, int pViews, int pLikes, int pDislikes, String pCountry)
	{
		id = pId;
		trendingDate = pTrending;
		title = pTitle;
		channel = pChannel;
		categoryId = pCategoryId;
		publishDate = pPublish;
		tags = ptags;
		views = pViews;
		likes = pLikes;
		dislikes = pDislikes;
		country = pCountry;
	}
	
	public int getId() 
	{
		return id;
	}
	
	public Date getTrendingDate()
	{
		return trendingDate;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getChannel()
	{
		return channel;
	}
	
	public int getCategoryID()
	{
		return categoryId;
	}
	
	public Date getPublishDate()
	{
		return publishDate;
	}
	
	public String getTags()
	{
		return tags;
	}
	
	public int getViews()
	{
		return views;
	}
	
	public int getLikes()
	{
		return likes;
	}
	
	public int getDislikes()
	{
		return dislikes;
	}
	
	public String getCountry()
	{
		return country;
	}

	@Override
	public int compareTo(Video o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
