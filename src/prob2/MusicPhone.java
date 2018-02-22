package prob2;

public class MusicPhone extends Phone {
	
	@Override
	public void execute( String function ) {
		if ( function.equals("음악") ) {
			playMusic();
			return;
		} else if(function.equals("앱")) {
			System.out.println("앱실행");
		} else {
			super.execute( function );
		}
		
	}

	protected void playMusic() {
		System.out.println("MP3 플레이어에서 음악재생");
	}
}
