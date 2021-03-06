package au.com.dius.pact.provider.junitsupport;


import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to mark methods that should be run on state change
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Inherited
public @interface State {
  /**
   * @return list of state names
   */
  String[] value();

  /**
   * Whether to run the method before (SETUP) or after (TEARDOWN) the interaction
   */
  StateChangeAction action() default StateChangeAction.SETUP;
}
