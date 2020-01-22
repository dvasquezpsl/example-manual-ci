package co.com.psl.exampleci.domain;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PeopleServiceTest {
  
  @Mock
  private IPeopleRepository repositoryMock;
  
  @InjectMocks
  private PeopleService serviceUnderTest;

  @Test
  public void shouldCalculateAge() throws Exception {
    when(repositoryMock.getPersonInfo(any())).thenReturn(aToddler());
    
    int age = serviceUnderTest.getAge("1");
    
    assertThat(age, is(2));
  }

  private Person aToddler() {
    return new Person()
        .withId("1")
        .withName("Toddler")
        .withBirth(LocalDateTime.now().minusYears(2));
  }
}