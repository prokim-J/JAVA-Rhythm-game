package dynamic_beat_16;

public class Main {

	public static final int SCREEN_WIDTH = 1280; //게임화면
	public static final int SCREEN_HEIGHT = 960;
	public static final int NOTE_SPEED = 5;	//노트가 떨어지는 속도
	public static final int SLEEP_TIME = 10; //노트가 얼마간의 시간주기로 떨어지는지 설정하는것
	//public static final int REACH_TIME = 2; // 노트가 생성되고나서 판정 바까지 닿는 시간
	
	public static void main(String[] args) {
		
		new DynamicBeat();
		
	}
	
}
