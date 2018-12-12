package br.ucsal.rpg.main;

import java.util.Random;

import br.ucsal.rpg.model.NPC;
import br.ucsal.rpg.model.Personagem;
import br.ucsal.rpg.model.Status;

public class Combate {
	private NPC npc;
	private Personagem personagem;
	private Random random;
	
	public Combate(NPC npc, Personagem personagem) {
		super();
		this.npc = npc;
		this.personagem = personagem;
	}
	
	public void ataquePersonagem() {
		Integer danoPersonagem = personagem.getItens().get(0).getDano() * (random.nextInt(6) + 1);
		Status npcStatus = npc.getStatus();
		npcStatus.setSaude(npcStatus.getSaude() - danoPersonagem);
		npc.setStatus(npcStatus);
	}
	
	public void ataqueNpc() {
		Integer danoNpc = npc.getItens().get(0).getDano() * (random.nextInt(6) + 1);
		Status personagemStatus = personagem.getStatus();
		personagemStatus.setSaude(personagemStatus.getSaude() - danoNpc);
		personagem.setStatus(personagemStatus);
	}
}
