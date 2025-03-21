package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

public class ElectronicVotingMachine {
	private Map<String, Integer> votes;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}		
		public ElectronicVotingMachine(){
			votes = new HashMap<>();
		}
		
		public void addCandidate(String name) {
			if (!votes.containsKey(name)) {
				votes.put(name, 0);
			}
		}
		
		public boolean castVote(String name) {
			if (votes.containsKey(name)) {
				votes.put(name, votes.get(name) + 1);
				return true;
			}
			return false;
		}
		
		public String getWinner() {
			String winner = null;
			int maxVotes = 0;
			
			for (Map.Entry<String, Integer> entry: votes.entrySet()) {
				if (entry.getValue() > maxVotes) {
					maxVotes = entry.getValue();
					winner = entry.getKey();
				}
			}
			return (winner != null) ? winner + " WINS with " + maxVotes + " votes!!" : "No winner.";
	}
	
}
/* Code from https://www.geeksforgeeks.org/java-program-to-count-the-occurrence-of-each-character-in-a-string-using-hashmap/
 and chat gpt*/