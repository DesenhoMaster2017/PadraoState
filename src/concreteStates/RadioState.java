package concreteStates;

import stateInterface.PlayerStateInterface;
import stateMachine.Player;
import concreteStates.*;

public class RadioState implements PlayerStateInterface{

	public RadioState(){
		System.out.println("Radio Mode!");
	}
	
	@Override
	public void sourceButton(Player player) {
		player.setState(new StandByState());
	}

	@Override
	public void actionButton(Player player) {
		System.out.println("changing frequency...");
		
	}

	
}
