package TermProject;
import java.util.*;

public class FoodBox {
	/*public String koreanFood[] = {"������", "���뺺��", "��������", "����", "�Ұ��", "��ġ��", "���" , "û����", "������",
			"������", "�����屹", "�ſ���", "��ġ����", "��������", "��¡���", "�����","����","�����", "����","��ġ����" };
	public String westernFood[] = {"����", "�Ľ�Ÿ", "������ũ", "Ÿ��", "�������", "����", "������", "�ܹ���", "����ũ", "����", 
			"ũ������", "��Ű", "�佺Ʈ", "���ڳ�" };
	public String chinaFood[] = { "�̱�", "�����", "������", "������", "«��", "�Ⱥ�ä", "��ǳ��", "����", "źź��", "������" };
	*/

	ArrayList <String> koreanFood = new ArrayList<String>();
	ArrayList <String> westernFood = new ArrayList<String>();
	ArrayList <String> chinaFood = new ArrayList<String>();
	
	public void addFoodname(ArrayList<String> list,String foodname){
		list.add(foodname);
	}
	
	public void choiceFood(ArrayList<String> list){
		double number = Math.random();
		long foodnum = Math.round(number*list.size());
		list.get((int)foodnum);
	}
	
	
}

	