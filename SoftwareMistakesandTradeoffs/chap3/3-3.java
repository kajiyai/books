public void shouldCatchAtHigherGraularity() {
  try {
    methodThatThrowsCheckedException();
  } catch (IOException e) {
    logger.error("Some IO problem: ", e);
  }catch (InterruptedException e) {
    logger.error("Interrupted: ", e);
  }
}