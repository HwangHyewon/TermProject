package TermProject;
import java.util.*;

public class FoodBox {
	/*public String koreanFood[] = {"¶±ººÀÌ", "¼ø´ëººÀ½", "Á¦À°µ¤¹ä", "»ï°ã»ì", "ºÒ°í±â", "±èÄ¡Àü", "±è¹ä" , "Ã»±¹Àå", "¼³··ÅÁ",
			"°¨ÀÚÅÁ", "»ÀÇØÀå±¹", "¸Å¿îÅÁ", "°¥Ä¡Á¶¸²", "°íµî¾îÁ¶¸²", "¿ÀÂ¡¾îººÀ½", "°è¶õÂò","ÆÄÀü","ºñºö¹ä", "¶±±¹","ÀÜÄ¡±¹¼ö" };
	public String westernFood[] = {"ÇÇÀÚ", "ÆÄ½ºÅ¸", "½ºÅ×ÀÌÅ©", "Å¸ÄÚ", "¶óµû¶ÑÀÌ", "ºü³×", "»ø·¯µå", "ÇÜ¹ö°Å", "ÄÉÀÌÅ©", "Æø¸³", 
			"Å©¸²¼öÇÁ", "ÅÍÅ°", "Åä½ºÆ®", "¶óÀÚ³Ä" };
	public String chinaFood[] = { "ÈÌ±Å", "ÀÚÀå¸é", "ÅÁ¼öÀ°", "±ñ¼î»õ¿ì", "Â«»Í", "ÆÈº¸Ã¤", "±ñÇ³±â", "µõ¼¶", "ÅºÅº¸é", "¾çÀåÇÇ" };
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

	