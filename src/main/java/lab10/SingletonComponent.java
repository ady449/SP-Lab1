package lab10;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class SingletonComponent {
    public void operation() {
        System.out.println(
                "Invoked SingletonComponent::operation() on " + this);

    }
}
