/**
 * 増補改訂版
 * Java言語で学ぶデザインパターン入門
 * @author 結城浩
 * 第１章　Iterator｜一つ一つ数え上げる
 */
package lesson01;

/**
 * 本を表すクラス
 */
public class Book {
	private String name;
	public Book(String name) { 
		this.name = name;
	}
	
	public String getName() { 	return name; }
}
