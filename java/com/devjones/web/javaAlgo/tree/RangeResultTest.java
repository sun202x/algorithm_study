package com.devjones.web.javaAlgo.tree;

public class RangeResultTest {

	public static void main(String[] args) {
		
	}
	
	static RangeResult merge(RangeResult a, RangeResult b) {
		RangeResult ret = new RangeResult();
		
		ret.size = a.size + b.size;
		
		ret.leftNumber = a.leftNumber;
		ret.leftFreq = a.leftFreq;
		if(a.size == a.leftFreq && a.leftNumber == b.leftNumber)
			ret.leftFreq += b.leftFreq;
		
		ret.rightNumber = b.rightNumber;
		ret.rightFreq = b.rightFreq;
		if(b.size == b.rightFreq && a.rightNumber == b.rightNumber)
			ret.rightFreq += a.rightFreq;
		
		ret.mostFrequent = Math.max(a.mostFrequent, b.mostFrequent);
		
		if(a.rightNumber == b.leftNumber)
			ret.mostFrequent = Math.max(ret.mostFrequent, a.rightFreq + b.leftFreq);
		
		return ret;
	}
}

class RangeResult {
	int size;
	int mostFrequent;
	int leftNumber, leftFreq;
	int rightNumber, rightFreq;
}