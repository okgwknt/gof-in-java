# Iterator Pattern

iterate = 繰り返す

一つずつ数えあげます

ループ変数のような役割を果たします

```java
public interface Iterator {
    public abstract boolean hasNext();
    public abstract Object next();
}
```

実装がどうであれ hasNext，next を使うだけです

hasNext は次の要素が存在するか，next は次の要素を得るためのメソッドです

<!-- Iterator = 反復子 -->

<!-- ConcreteIterator = 具体的な反復子 -->

<!-- Aggregate = 集合体 -->

<!-- ConcreteAggregate = 具体的な集合体 -->
