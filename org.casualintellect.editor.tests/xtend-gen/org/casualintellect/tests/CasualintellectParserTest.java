package org.casualintellect.tests;

import com.google.inject.Inject;
import org.casualintellect.casualIntellect.Model;
import org.casualintellect.tests.CasualIntellectInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(CasualIntellectInjectorProvider.class)
@SuppressWarnings("all")
public class CasualintellectParserTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Test
  public void testEmptyTransitions() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("state state1{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("before: salo, pivo, vodka;");
      _builder.newLine();
      _builder.append("\t\t    ");
      _builder.append("after:salo,pivo,vodka; ");
      _builder.newLine();
      _builder.append("\t\t    ");
      _builder.append("in_process:pivo, vodka, salo; ");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.append("}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTransition() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("state state1{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("before: salo, pivo, vodka;");
      _builder.newLine();
      _builder.append("\t\t    ");
      _builder.append("after:salo,pivo,vodka; ");
      _builder.newLine();
      _builder.append("\t\t    ");
      _builder.append("in_process:pivo, vodka, salo; ");
      _builder.newLine();
      _builder.append("\t\t    ");
      _builder.append("transitions : {transition:salo; condition:true; methods:salo,pivo,vodka} ");
      _builder.newLine();
      _builder.append("\t\t  ");
      _builder.append("}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEmptyTransitionMethods() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("state state1{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("before: salo, pivo, vodka;");
      _builder.newLine();
      _builder.append("\t\t    ");
      _builder.append("after:salo,pivo,vodka; ");
      _builder.newLine();
      _builder.append("\t\t    ");
      _builder.append("in_process:pivo, vodka, salo; ");
      _builder.newLine();
      _builder.append("\t\t    ");
      _builder.append("transitions : {transition:salo; condition:true} ");
      _builder.newLine();
      _builder.append("\t\t  ");
      _builder.append("}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTransitionExpression() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("state state1{");
      _builder.newLine();
      _builder.append("\t\t\t   \t");
      _builder.append("before: salo, pivo, vodka;");
      _builder.newLine();
      _builder.append("\t\t\t   \t");
      _builder.append("after:salo,pivo,vodka; ");
      _builder.newLine();
      _builder.append("\t\t\t   \t");
      _builder.append("in_process:pivo, vodka, salo; ");
      _builder.newLine();
      _builder.append("\t\t\t   \t");
      _builder.append("transitions : {transition:salo; condition:f1 || f2&&f3} ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testStateWithoutBefore() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("state state1{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("before:;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("after:salo,pivo,vodka; ");
      _builder.newLine();
      _builder.append("\t\t   \t");
      _builder.append("in_process:pivo, vodka, salo; ");
      _builder.newLine();
      _builder.append("\t\t   \t");
      _builder.append("transitions : {transition:salo; condition:f1 || f2&&f3} ");
      _builder.newLine();
      _builder.append("}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEmptyState() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("state state1{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("before:pivo;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("after:salo;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("in_process:vodka;");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("transitions : {transition:salo; condition:f1 || f2&&f3} ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTransitionExpressionWithNot() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("state state1{");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("before: salo, pivo, vodka;");
      _builder.newLine();
      _builder.append("\t\t    ");
      _builder.append("after:salo,pivo,vodka; ");
      _builder.newLine();
      _builder.append("\t\t    ");
      _builder.append("in_process:pivo, vodka, salo; ");
      _builder.newLine();
      _builder.append("\t\t    ");
      _builder.append("transitions: {transition:salo; condition:f1 || f2&&!false} ");
      _builder.newLine();
      _builder.append("\t\t  ");
      _builder.append("}");
      Model _parse = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(_parse);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
