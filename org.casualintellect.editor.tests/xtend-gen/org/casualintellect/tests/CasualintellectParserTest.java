package org.casualintellect.tests;

import com.google.inject.Inject;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)/* 
@InjectWith(CasualIntellectInjectorProvider.class) */
@SuppressWarnings("all")
public class CasualintellectParserTest {
  @Inject
  @Extension
  private /* ParseHelper<Model> */Object _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testEmptyTransitions() {
    throw new Error("Unresolved compilation problems:"
      + "\nassertNoErrors cannot be resolved");
  }
  
  @Test
  public void testTransition() {
    throw new Error("Unresolved compilation problems:"
      + "\nassertNoErrors cannot be resolved");
  }
  
  @Test
  public void testEmptyTransitionMethods() {
    throw new Error("Unresolved compilation problems:"
      + "\nassertNoErrors cannot be resolved");
  }
  
  @Test
  public void testTransitionExpression() {
    throw new Error("Unresolved compilation problems:"
      + "\nassertNoErrors cannot be resolved");
  }
  
  @Test
  public void testStateWithoutBefore() {
    throw new Error("Unresolved compilation problems:"
      + "\nassertNoErrors cannot be resolved");
  }
  
  @Test
  public void testEmptyState() {
    throw new Error("Unresolved compilation problems:"
      + "\nassertNoErrors cannot be resolved");
  }
  
  @Test
  public void testTransitionExpressionWithNot() {
    throw new Error("Unresolved compilation problems:"
      + "\nassertNoErrors cannot be resolved");
  }
}
