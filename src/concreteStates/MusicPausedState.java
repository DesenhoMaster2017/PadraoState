package concreteStates;

import stateInterface.PlayerStateInterface;
import stateMachine.Player;
import concreteStates.*;



public class MusicPausedState implements PlayerStateInterface{

	public MusicPausedState(){
		System.out.println("Music is paused...");
	}
	
	@Override
	public void sourceButton(Player player) {
		player.setState(new RadioState());
	}

	@Override
	public void actionButton(Player player) {
		player.setState(new MusicPlayingState());
	}	
}
