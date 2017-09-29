
import stateMachine.Player;
import concreteStates.StandByState;

public class Main {

	public static void main(String[] args) {
		
		//state inicial
		StandByState standBy = new StandByState();
		
		//O player possui apenas dois botões
		Player player = new Player();
		
		//Definindo state inicial
		player.setState(standBy);
		
		// mudando de state
		player.sourceButton(); // a gerência dos estados é interna
		
		// tocar musica é o segundo estado
		// ação do botao de musica pausa o player
		
		player.actionButton(); // pausar é outro state
		
		player.actionButton(); // despausar
		
		//mudando source
		player.sourceButton(); // mudando para a radio
	
		player.actionButton(); // mudando frequência de radio
		
		//mudando source	
		player.sourceButton(); // voltando ao standby
		
		player.actionButton(); // desligando player
		
		player.actionButton(); // Religando player
	}

}
