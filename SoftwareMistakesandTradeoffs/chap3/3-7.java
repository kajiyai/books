public void shouldCatchAtNormalGraularityRuntimeWillBeNotCatch() {
  assertThatThronBy(
    () -> {
      try {
          methodThatThrowsUnCheckedException();
        } catch (FileAlreadyExistsException e) {
          logger.error("File already exists ", e);
        }catch (InterruptedException e) {
          logger.error("Interrupted: ", e);
        }
    }).isInstanceOf(RuntimeException.class);
    }
  