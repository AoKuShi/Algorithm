package mysort.sort;

import java.util.Arrays;

public abstract class Sort { // abstract 클래스 작성
	int[] orgData; // 오리지날 데이터 배열
	int[] sortedData; // 솔트 데이터 배열
	
	public abstract void sort(int[] dataList); // abstract 메서드(오버라이드 필수) 작성
	
	void swap(int[] dataList, int a, int b) { // dataList[a]와 dataList[b]를 스왑
		if (a == b) return;
		int temp;
		temp = dataList[a];
		dataList[a] = dataList[b];
		dataList[b] = temp;
	}
	
	public void setData(int[] dataList) { // 오리지널 데이터, 솔트 데이터 set
		this.orgData = dataList;
		this.sortedData = dataList.clone(); // dataList의 복사본(다른 메모리주소에 새로 생성된 dataList)에 sortedData를 할당
	}
	
	public String getOrgData() { // 오리지날 데이터 get
		return Arrays.toString(orgData);
	}
	
	public String getSortedData() { // 솔트 데이터 get
		return Arrays.toString(sortedData);
	}

}
