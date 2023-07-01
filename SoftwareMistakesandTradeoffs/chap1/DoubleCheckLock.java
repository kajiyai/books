// 注釈がついてました.....
// 訳注 https://refactoring.guru/ja/design-patterns/singletonただしGoF本の著者陣は、このパターンを同書の改訂
// 時に最初に削除すべきものとして挙げていました。テストがしにくくなるなどの弊害も大きく、よく推奨しないとも
// 言われますが、本章ではAPIと実装の設計の良し悪しを見るための事例として割り切ってお読みください。

// 二重チェックロック
private volatile static SystemComponent instance;

public static SystemComponent getInstance() {
  if (instance == null) {
    synchronized (ThreadSafeSingleton.class){
      if (instance == null){
        instance = new SystemComponent();
      }
    }
  }
  return instance;
}