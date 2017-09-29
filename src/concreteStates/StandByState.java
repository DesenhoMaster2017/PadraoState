package concreteStates;

import stateInterface.PlayerStateInterface;
import stateMachine.Player;
import concreteStates.*;



public class StandByState implements PlayerStateInterface{
	
	private boolean standByState = true;
	
	public StandByState(){
		System.out.println("Stand By Mode!");
	}
	
	@Override
	public void sourceButton(Player player) {
		if (standByState){
			player.setState(new MusicPlayingState());
		}
	}

	@Override
	public void actionButton(Player player) {
		
		//Toggle state
		standByState = !standByState;
		
		if (standByState){
			System.out.println("Turning on...");
		}else{
			System.out.println("Entering on standby...");
		}
	}
}
