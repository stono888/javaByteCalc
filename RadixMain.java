package com.srie.test;

public class RadixMain {

	public static void main(String[] args) {
		// ʮ����תΪ��������
		System.out.println(Integer.toBinaryString(112));// ������
		System.out.println(Integer.toHexString(112));// ʮ������
		System.out.println(Integer.toOctalString(112));// �˽���

		// ��������ת��Ϊʮ����
		System.out.println(Integer.parseInt("111001", 2));// ������
		System.out.println(Integer.parseInt("27", 8));// �˽���
		System.out.println(Integer.parseInt("A8", 16));// ʮ������
		System.out.println(Integer.parseInt("12", 3));// ������
	}

}
