package org.casualintellect.tests;

import com.google.inject.Inject;
import org.casualintellect.tests.CasualIntellectInjectorProvider;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.util.ReflectExtensions;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(CasualIntellectInjectorProvider.class)
@SuppressWarnings("all")
public class GeneratorTest {
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  @Extension
  private ReflectExtensions _reflectExtensions;
  
  @Test
  public void testGeneratedCode() {
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
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<state name=\"state1\">");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<before methods=\"salo,pivo,vodka\"/>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<after methods=\"salo,pivo,vodka\"/>\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<in_process methods=\"pivo,vodka,salo\"/>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<transitions>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<transition name=\"salo\" methods=\"\">");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("<condition function=\"f1 || f2 && false\"/>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("</transition>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("</transitions>");
      _builder_1.newLine();
      _builder_1.append("</state>");
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMethodsInTransition() {
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
      _builder.append("transitions: {transition:salo; condition:f1 || f2&&!false;methods:salo,pivo,vodka} ");
      _builder.newLine();
      _builder.append("\t\t  ");
      _builder.append("}");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<state name=\"state1\">");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<before methods=\"salo,pivo,vodka\"/>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<after methods=\"salo,pivo,vodka\"/>\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<in_process methods=\"pivo,vodka,salo\"/>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<transitions>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<transition name=\"salo\" methods=\"salo,pivo,vodka\">");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("<condition function=\"f1 || f2 && false\"/>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("</transition>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("</transitions>");
      _builder_1.newLine();
      _builder_1.append("</state>");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testWithBrackets() {
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
      _builder.append("transitions: {transition:salo; condition:(f1 || f2)&&!false} ");
      _builder.newLine();
      _builder.append("\t\t  ");
      _builder.append("}");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<state name=\"state1\">");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<before methods=\"salo,pivo,vodka\"/>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<after methods=\"salo,pivo,vodka\"/>\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<in_process methods=\"pivo,vodka,salo\"/>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<transitions>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<transition name=\"salo\" methods=\"\">");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("<condition function=\"(f1 || f2) && false\"/>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("</transition>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("</transitions>");
      _builder_1.newLine();
      _builder_1.append("</state>");
      _builder_1.newLine();
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testTwoTransitions() {
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
      _builder.append("transitions: {transition:salo; condition:(f1 || f2)&&!false, transition:pivo; condition:(f1 || f2)&&!false} ");
      _builder.newLine();
      _builder.append("\t\t  ");
      _builder.append("}");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("<state name=\"state1\">");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<before methods=\"salo,pivo,vodka\"/>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<after methods=\"salo,pivo,vodka\"/>\t");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<in_process methods=\"pivo,vodka,salo\"/>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<transitions>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<transition name=\"salo\" methods=\"\">");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("<condition function=\"(f1 || f2) && false\"/>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("</transition>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("<transition name=\"pivo\" methods=\"\">");
      _builder_1.newLine();
      _builder_1.append("\t\t");
      _builder_1.append("<condition function=\"(f1 || f2) && false\"/>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("</transition>");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("</transitions>");
      _builder_1.newLine();
      _builder_1.append("</state>");
      this._compilationTestHelper.assertCompilesTo(_builder, _builder_1);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
