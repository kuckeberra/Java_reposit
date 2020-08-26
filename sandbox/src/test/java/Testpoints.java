import org.testng.annotations.Test;
import ru.stqa.sandbox.Pointsdata;

public class Testpoints {

  @Test
  public void testDistance() {
    Pointsdata P = new Pointsdata(0, 1, 2, -2);
    assert P.distance() == 3.6;
  }
}
