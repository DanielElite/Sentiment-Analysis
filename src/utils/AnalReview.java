package utils;

import java.util.ArrayList;
import java.util.HashMap;

public class AnalReview {
	/**
	 * 评论文本
	 */
	private String text;
	private ArrayList<String> words;
	private ArrayList<ArrayList<String>> wordOfSentence;//每句话里面的词

	private String filtedText;//被过滤的句子
	private boolean[] featureVector;//特征向量对应的值

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
	private HashMap<String, Integer> frequency = new HashMap<String, Integer>();

	
	
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

	/**
	 * @return the filtedText
	 */
	public String getFiltedText() {
		return filtedText;
	}

	/**
	 * @param filtedText
	 *            the filtedText to add
	 */
	public void addFiltedText(String filtedText) {
		this.filtedText.concat(filtedText);
	}

	/**
	 * @return the words
	 */
	public ArrayList<String> getWords() {
		return words;
	}

	/**
	 * @param words
	 *            the words to set
	 */
	public void setWords(ArrayList<String> words) {
		this.words = words;
	}

	/**
	 * @return the featureValue
	 */
	public boolean[] getFeatureVector() {
		return featureVector;
	}

	/**
	 * @param featureValue the featureValue to set
	 */
	public void setFeatureVector(boolean[] featureValue) {
		this.featureVector = featureValue;
	}

	/**
	 * @return the wordOfSentence
	 */
	public ArrayList<ArrayList<String>> getWordOfSentence() {
		return wordOfSentence;
	}

	/**
	 * @param wordOfSentence the wordOfSentence to set
	 */
	public void setWordOfSentence(ArrayList<ArrayList<String>> wordOfSentence) {
		this.wordOfSentence = wordOfSentence;
	}

	/**
	 * @param filtedText the filtedText to set
	 */
	public void setFiltedText(String filtedText) {
		this.filtedText = filtedText;
	}

}