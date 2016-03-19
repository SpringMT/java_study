import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HelloWorldTest {

  @Test
  public void _should_return_Hello_TDD_BootCamp() throws Exception {
    // Setup
    HelloWorld test = new HelloWorld();
    // Exercise
    String actual = test.jsonCheck();
    // Verify
    assertThat(actual, is("test"));
  }

}
