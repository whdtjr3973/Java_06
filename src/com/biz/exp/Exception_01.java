package com.biz.exp;

import java.util.ArrayList;
import java.util.List;

public class Exception_01 {

	public static void main(String[] args) {
		
		int[] nums = new int[3];
		String strKor = " 30 ";
		List<String> stList = new ArrayList<String>();
		String strName = null;
		
		try {
			nums[3] = 10;
			Integer.valueOf(strKor);
			String s = stList.get(1).toString();
			System.out.println(strName.toString());

		} catch (ArrayIndexOutOfBoundsException ea) {
			System.out.println("�迭 ���� �ʰ�");		
		} catch (NumberFormatException en) {
			System.out.println("���ڿ��� ���ڷ� ������ ����");
		} catch (NullPointerException ep) {
			System.out.println("NullPoint ����");
		} catch (Exception e) {
			System.out.println("�ý��� ����");
		}
		System.out.println("�ݰ����ϴ�");
		
		
	}
}
