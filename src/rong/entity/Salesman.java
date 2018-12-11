package rong.entity;

/**
 * SalesMan �ۻ�Աʵ����
 * @author lyons(zhanglei)
 */

public final class Salesman
{
	private int sId;
	private String sName;
	private String sPassWord;
	
	/**
	 * ��֤�û���½
	 * @param sId,spassWord
	 */
	public Salesman(int sId,String spassWord)
	{
		this.sId = sId;
		this.sPassWord = spassWord;
	}
	
	/**
	 * ��ѯ�û��������û�����
	 * @param sId,sName,sPassWord
	 */
	public Salesman(int sId,String sName,String sPassWord)
	{
		this.sId = sId;
		this.sName = sName;
		this.sPassWord = sPassWord;
	}
	
	/**
	 * ����û�
	 * @param NsNameame,sPassWord
	 */
	public Salesman(String NsNameame, String sPassWord)
	{
		this.sName = NsNameame;
		this.sPassWord = sPassWord;
	}

		
	//����get.set����
		public int getSId()
		{
			return sId;
		}
		public void setSId(int id)
		{
			sId = id;
		}
		public String getSName()
		{
			return sName;
		}
		public void setSName(String name)
		{
			sName = name;
		}
		public String getSPassWord()
		{
			return sPassWord;
		}
		public void setSPassWord(String passWord)
		{
			sPassWord = passWord;
		}

}
