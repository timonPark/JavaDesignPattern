package org.park.javadesignpattern.factorymethod.idcard;
import org.park.javadesignpattern.factorymethod.framework.Product;

public class IDCard extends Product {
	private String owner;
	private int serial;
	IDCard(String owner, int serial) {
		System.out.println(owner + "(" + serial + ")" + "�� ī�带 ����ϴ�.");
		this.owner = owner;
		this.serial = serial;
	}
	
	@Override
	public void use() {
		System.out.println(owner + "(" + serial + ")" + "�� ī�带 ����մϴ�");
	}
	
	public String getOwner(){
		return owner;
	}

	public int getSerial(){
		return serial;
	}

}