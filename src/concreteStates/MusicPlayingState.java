package concreteStates;

import stateInterface.PlayerStateInterface;
import stateMachine.Player;
import concreteStates.*;



public class MusicPlayingState implements PlayerStateInterface{

	public MusicPlayingState(){
		System.out.println("Playing music...");
	}
	
	@Override
	public void sourceButton(Player player) {
		player.setState(new RadioState());
	}

	@Override
	public void actionButton(Player player) {
		player.setState(new MusicPausedState());
	}
}
