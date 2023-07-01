// Singletonの問題を解消した形のパターンという認識であっているはず・・・

private static ThreadLocal<SystemComponent> threadLocalValue = new ThreadLocal<>();

public static void set() {
  threadLocalValue.set(new SystemComponent());
}

public static void executeAction() {
  SystemComponent systemComponent = threadLocalValue.get();
}

public static SystemComponent get() {
  return threadLocalValue.get();
}