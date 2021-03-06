package dev.clacrone.interview;

// import java.io.FileNotFoundException;

// import dev.clacrone.interview.basic.BasicQuestionsRunner;
// import dev.clacrone.interview.graphs.GraphQuestionsRunner;
// import dev.clacrone.interview.hashmap.TMHashMapRunner;
// import dev.clacrone.interview.heaps.HeapQuestionsRunner;
// import dev.clacrone.interview.queues.QueueQuestionsRunner;
// import dev.clacrone.interview.searching.SearchingQuestionsRunner;
// import dev.clacrone.interview.sorting.SortingQuestionsRunner;
// import dev.clacrone.interview.stacks.StackQuestionsRunner;
// import dev.clacrone.interview.stacksqueuesbags.StacksQueuesBagsRunner;
// import dev.clacrone.interview.threesum.ThreeSumRunner;
// import dev.clacrone.interview.trees.TreeQuestionsRunner;
// import dev.clacrone.interview.unionfind.UnionFindRunner;
// import dev.clacrone.interview.wordladder.WordLadderRunner;

public class Main {

	// public static void runStacksQueuesBags() {
	// 	try {
	// 		StacksQueuesBagsRunner.runStacksQueuesBags();
	// 	} catch (FileNotFoundException e) {
	// 		// TODO Auto-generated catch block
	// 		e.printStackTrace();
	// 	}
	// }

	// public static void runThreeSum() {
	// 	try {
	// 		ThreeSumRunner.runThreeSum();
	// 	} catch (FileNotFoundException e) {
	// 		// TODO Auto-generated catch block
	// 		e.printStackTrace();
	// 	}
	// }

	// public static void runBasicQuestions() {
	// 	BasicQuestionsRunner.runBasicQuestions();
	// }

	// public static void runTreeQuestions() {
	// 	TreeQuestionsRunner.runTreeQuestions();
	// }

	// public static void runUnionFind() {
	// 	try {
	// 		UnionFindRunner.runUnionFind();
	// 	} catch (FileNotFoundException e) {
	// 		// TODO Auto-generated catch block
	// 		e.printStackTrace();
	// 	}
	// }

	// public static void runWordLadder() {
	// 	WordLadderRunner.runWordLadder();
	// }

	// public static void runTMHashMap() {
	// 	TMHashMapRunner.runTMHashMap();
	// }

	// public static void runSortingQuestions() {
	// 	SortingQuestionsRunner.runSortingQuestions();
	// }

	// public static void runSearchingQuestions() {
	// 	SearchingQuestionsRunner.runSearchingQuestions();
	// }

	// public static void runStackQuestions() {
	// 	StackQuestionsRunner.runStackQuestions();
	// }

	// public static void runQueueQuestions() {
	// 	QueueQuestionsRunner.runQueueQuestions();
	// }

	// public static void runHeapQuestions() {
	// 	HeapQuestionsRunner.runHeapQuestions();
	// }

	// public static void runGraphQuestions() {
	// 	GraphQuestionsRunner.runGraphQuestions();
	// }

	public static boolean isPowerOf2(final int n) {
		if ((n & (n-1)) == 0)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		runBasicQuestions();
//		runTMHashMap();
//		runSearchingQuestions();
//		runSortingQuestions();
//		runStackQuestions();
//		runQueueQuestions();
//		runHeapQuestions();
		// runGraphQuestions();
		int num = 2;
		boolean result = isPowerOf2(2);
		System.out.println("num " + num + (result ? " is a power of 2" : "is NOT a power of 2"));
	}

}
