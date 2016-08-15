package cn.hncu.bookStore.out.vo;

import java.io.Serializable;

/**
 * ������ϸ������ֵ�����װ
 * @author �º���
 *
 * @version 1.0
 */
public class OutDetailModel implements Serializable{
	//������ϸ���
	private String uuid;
	//���۵����
	private String outId;
	//ͼ����
	private String bookId;
	//��������
	private int sumNum;
	//�����ܽ��
	private double sumMoney;
	
	//Ϊ��������ʾ���û�������bookUuid����һ��bookName����
	private String bookName;
	
	
	
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	public String getOutId() {
		return outId;
	}
	public void setOutId(String outId) {
		this.outId = outId;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public int getSumNum() {
		return sumNum;
	}
	public void setSumNum(int sumNum) {
		this.sumNum = sumNum;
	}
	public double getSumMoney() {
		return sumMoney;
	}
	public void setSumMoney(double sumMoney) {
		this.sumMoney = sumMoney;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OutDetailModel other = (OutDetailModel) obj;
		if (uuid == null) {
			if (other.uuid != null)
				return false;
		} else if (!uuid.equals(other.uuid))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return uuid +", "+bookName + ", " + sumNum
				+ "��, " + sumMoney + "Ԫ";
	}
	
	
	
	
	
}