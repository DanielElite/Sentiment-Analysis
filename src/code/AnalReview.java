package code;

import java.util.HashMap;

public class AnalReview {
	/**
	 * 评论文本
	 */
	private String text;
	/**
	 * 评论星级
	 */
	private int level;
	/**
	 * 词数
	 */
	private int wordsCount;
	/**
	 * 字数
	 */
	private int charsCount;
	/**
	 * 每个词与它的出现次数
	 */
	private HashMap<String, Integer> frequency=new HashMap<String, Integer>();
	
	public AnalReview(String text, int level) {
		this.text = text;
		this.level = level;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getWordsCount() {
		return wordsCount;
	}
	public void setWordsCount(int wordsCount) {
		this.wordsCount = wordsCount;
	}
	public HashMap<String, Integer> getFrequency() {
		return frequency;
	}
	public void setFrequency(HashMap<String, Integer> frequency) {
		this.frequency = frequency;
	}
	public int getCharsCount() {
		return charsCount;
	}
	public void setCharsCount(int charsCount) {
		this.charsCount = charsCount;
	}
	@Override
	public String toString() {
		return "AnalReview [text=" + text + ", level=" + level
				+ ", wordsCount=" + wordsCount + ", charsCount=" + charsCount
				+ ", frequency=" + frequency + "]";
	}
	
}
