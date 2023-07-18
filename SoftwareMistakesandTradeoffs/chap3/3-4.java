public void shoudCatchAtCatcheAll {
  try {
    methodThatThrowsCheckedException();
  } catch (Exception e) {
    logger.error("problem: ", e);
  }
}