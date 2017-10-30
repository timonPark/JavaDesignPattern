package org.park.javadesignpattern.rday.state;

public class NightState implements State {
	private static NightState singleton = new NightState();
	private NightState() {}
	
	public static NightState getSingleton() {
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {	// �ð�����
		if(9 <= hour && hour < 17){
			context.changeState(DayState.getSingleton());
		}
	}

	@Override
	public void doUse(Context context) {				// �ݰ����
		context.callSecurityCenter("��� : �߰��ݰ� ���!");

	}

	@Override
	public void doAlarm(Context context) {				// ���
		context.callSecurityCenter("���(�߰�)");

	}

	@Override
	public void doPhone(Context context) {
		context.recordLog("�߰���ȭ ����");

	}

	@Override
	public String toString() {
		return "[�߰�]";
	}
	
	

}