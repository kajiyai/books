public void shouldCatchAtNormalGraularity(){
  try {
    methodThatThrowsCheckedException();
  } catch (FileAlreadyExistsException e) {
    logger.error("File already exists:", e);
  }catch (InterruptedException e) {
    logger.error("Interrupted: ", e);
  }
}