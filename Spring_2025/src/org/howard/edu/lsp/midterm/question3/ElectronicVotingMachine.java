package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

/** a voting machine that records candidates, votes for each candidate, and winner
 *  
 */

public class ElectronicVotingMachine {
	private Map<String, Integer> votes;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}		
	/** constructor that makes empty set of candidates 
	 * 
	 */
		public ElectronicVotingMachine(){
			votes = new HashMap<>();
		}
		
		public void addCandidate(String name) {
			if (!votes.containsKey(name)) {
				votes.put(name, 0);
			}
		}
		/** if the candidate isn't new it tallies a vote for them
		 * 
		 * @param name
		 * @return
		 */
		public boolean castVote(String name) {
			if (votes.containsKey(name)) {
				votes.put(name, votes.get(name) + 1);
				return true;
			}
			return false;
		}
		/** counts votes and displays winner
		 * 
		 * @return
		 */
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