Public class SystemComponent {

  Public int publicApiMethod() {
    return privateApiMethod();
  }

  private int privateApiMethod() {
    return complexCalculations();
  }

  private int complexCalculations() {
    // 複雑なロジック
    return 0;
  }
}