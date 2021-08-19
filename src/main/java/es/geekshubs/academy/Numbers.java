package es.geekshubs.academy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Numbers {

	/**
	 * Apply Method
	 * 
	 * @param input
	 * @return
	 */
	public List<String> apply(final List<Integer> input) {
		List<String> output = new ArrayList<String>();
		int nPos = 0,
			nNeg = 0,
			nZro = 0;
		
		for(Integer n : input) {
			if(n>0)
				nPos++;
			else
				if(n==0)
					nZro++;
				else
					nNeg++;
		}
		
		output.add(String.format("%.4f", nPos/input.size()));
		output.add(String.format("%.4f", nNeg/input.size()));
		output.add(String.format("%.4f", nZro/input.size()));
		
		return output;
	}

}
