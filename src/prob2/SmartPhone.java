package prob2;

public class SmartPhone extends MusicPhone {
	public void execute( String function ) {
		if ( function.equals("음악") ) {
			playMusic();
			return;
		}
		
		super.execute( function );
	}
	
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}
}
