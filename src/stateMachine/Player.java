package stateMachine;

import stateInterface.PlayerStateInterface;
import concreteStates.StandByState;

public class Player {

	private PlayerStateInterface state;
	
	public void setState(PlayerStateInterface newState){
		this.state = newState;
	}
	
	public void actionButton(){
		state.actionButton(this);
	}
	
	public void sourceButton(){
		state.sourceButton(this);
	}
	
}
