/**
 * 増補改訂版
 * Java言語で学ぶデザインパターン入門
 * @author 結城浩
 * 第１章　Iterator｜一つ一つ数え上げる
 */
package lesson01;

/**
 * 集合体を表すインタフェース
 */
public interface Aggregate {
	public abstract Iterator iterator();
}
