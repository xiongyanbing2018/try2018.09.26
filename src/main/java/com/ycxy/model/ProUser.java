package com.ycxy.model;

/**
 * �û��б�
 * ��֤��¼�����û�ע��
 * @author ASUS
 *
 */
public class ProUser {

	//�û�id
	private String id;
	//�û���ʵ����
	private String trueName;
	//�û��ֻ�����
	private String phone;
	//�û��Ա�
	private String sex;
	//�û�����ѧԺ
	private String faculty;
	//�û���¼����
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTrueName() {
		return trueName;
	}

	public void setTrueName(String trueName) {
		this.trueName = trueName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "ProUser [id=" + id + ", trueName=" + trueName + ", phone=" + phone + ", sex=" + sex + ", faculty="
				+ faculty + ", password=" + password + "]";
	}

}
