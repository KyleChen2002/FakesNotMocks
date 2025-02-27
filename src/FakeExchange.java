public class FakeExchange implements Exchange {
  @Override
  public float rate(String origin, String target) {
    // For testing purposes, return a fixed rate
    if ("USD".equals(origin) && "Euro".equals(target)) {
      return 0.85f;
    }
    return 1.0f;
  }
}
