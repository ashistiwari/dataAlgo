package com.dataAlgo.dataAlgo;

import com.dataAlgo.dataAlgo.array.MaximumSumSubarray;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataAlgoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataAlgoApplication.class, args);
		int[] arr = { 1, 2, 3, -4, -5, 6, 7, 8, 9, -10 };
		MaximumSumSubarray maxsum=new MaximumSumSubarray();
		int answer = maxsum.maxSumSubArray(arr);
		System.out.println(answer);
		git init
		git add README.md
		git commit -m "first commit"
		git branch -M main
		git remote add origin https://github.com/ashistiwari/dataAlgo.git
		git push -u origin main
	}

}
