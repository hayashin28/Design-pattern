/**
 * 増補改訂版
 * Java言語で学ぶデザインパターン入門
 * @author 結城浩
 * 第１章　Iterator｜一つ一つ数え上げる
 */
package lesson01;

/**
 * 数え上げ、スキャンを行うインタフェース
 */
public interface Iterator {
	public abstract boolean hasNext();
	public abstract Object next();
}
