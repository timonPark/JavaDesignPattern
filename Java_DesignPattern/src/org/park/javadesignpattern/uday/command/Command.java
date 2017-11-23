package org.park.javadesignpattern.uday.command;

/**
 * 
 * �ۼ���: 2017-11-16
 * �ۼ���: ������
 * �ۼ�����: Command Pattern�� �ǵ�
 * ��� �������̽����� ���� �� �޼ҵ� �̸��� �����ϰ�
 * �ش� �������̽��� �޾Ƽ� Ŭ�������� �ش� �޼ҵ��� ����� �����Ѵ�.
 * �׸��� ���� �ܿ��� Ŭ���� ��ü ���� �� �������̽����� ���ǵ� �޼ҵ带
 * ���(�̹� �޼ҵ� �̸��� �����Ǿ��ֱ� ������ �ش��ɸ� Ŭ�������� 
 * �����ϸ� �ȴ�)
 *
 */

public interface Command {
	public abstract void execute();
}