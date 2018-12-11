package rong.entity;

/**
 * goods 商品实体类
 * @author lyons(zhanglei)
 */
public final class Goods  {
	
	private int gid;

	private String gname;

	private int gnum;

	private double gprice;


	/**
	 * 添加商品信息
	 * @param gname,gprice,gum
	 */
	public Goods(String gname,double gprice,int gum)
	{
		this.gname  = gname;
		this.gprice = gprice;
		this.gnum 	= gum;
	}
	
	/**
	 * 展示所有商品
	 * @param gid,gname,gprice,gum
	 */
	public Goods(int gid,String gname,double gprice,int gum)
	{
		this.gid	= gid;
		this.gname  = gname;
		this.gprice = gprice;
		this.gnum 	= gum;
	}
	
	/**
	 * 根据编号更改商品数量
	 * @param gid,gum
	 */
	public Goods(int gid,int gnum)
	{
		this.gid	= gid;
		this.gnum 	= gnum;
	}
	/**
	 * 根据编号更改商品价格
	 * @param gid,gprice
	 */
	public  Goods(int gid,double gprice)
	{
		this.gid	= gid;
		this.gprice = gprice;
	}
	
	/**
	 * 根据编号更改商品名
	 * @param gid,gname
	 */
	public  Goods(int gid,String gname)
	{
		this.gid	= gid;
		this.gname  = gname;
	}
	//共有-get、set-方法。
	public int getGid()
	{
		return gid;
	}
	public void setGid(int gid)
	{
		this.gid = gid;
	}
	public String getGname()
	{
		return gname;
	}
	public void setGname(String gname)
	{
		this.gname = gname;
	}
	public double getGprice()
	{
		return gprice;
	}
	public void setGprice(double gprice)
	{
		this.gprice = gprice;
	}
	public int getGnum()
	{
		return gnum;
	}
	public void setGnum(int gnum)
	{
		this.gnum = gnum;
	}	
}