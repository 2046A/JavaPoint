/**
 * 但出于规范的目的，Java 还是建议我们用单个大写字母来代表类型参数。常见的如：
 *
 *     T 代表一般的任何类。
 *     E 代表 Element 的意思，或者 Exception 异常的意思。
 *     K 代表 Key 的意思。
 *     V 代表 Value 的意思，通常与 K 一起配合使用。
 *     S 代表 Subtype 的意思，文章后面部分会讲解示意。
 *
 *
 */
package main.com.dean.func.generic;

public class GenericClass<T>{
    private T val;
    public T getVal(){
        return val;
    }
    public void setVal(T val) {
        this.val = val;
    }
}
