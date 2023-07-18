public void shouldCatchAtHigherGraularity() {
  try {
    methodThatThrowsCheckedException();
  } catch (IOException | InterruptedException  e) {
    logger.error("problem: ", e);
  }
}