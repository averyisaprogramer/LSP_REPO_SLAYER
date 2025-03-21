package org.howard.edu.lsp.midterm.question3;

public class Tally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectronicVotingMachine vm = new ElectronicVotingMachine();
		
		vm.addCandidate("Alic");
		vm.addCandidate("Bob");
		vm.addCandidate("Charlie");
		
		vm.castVote("Alice");
		vm.castVote("Alice");
		vm.castVote("Bob");
		vm.castVote("Charlie");
		vm.castVote("Charlie");
		vm.castVote("Charlie");
		
		boolean success = vm.castVote("Eve");
		System.out.println("Vote for Eve successful? " + success);
		
		System.out.println("Winner: " + vm.getWinner());
			
		
		
	}

}
//code retrieved from chat gpt 
