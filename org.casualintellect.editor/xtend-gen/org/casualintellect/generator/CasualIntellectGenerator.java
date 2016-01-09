/**
 * generated by Xtext 2.9.1
 */
package org.casualintellect.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.List;
import org.casualintellect.casualIntellect.And;
import org.casualintellect.casualIntellect.BoolConstant;
import org.casualintellect.casualIntellect.Expression;
import org.casualintellect.casualIntellect.NestedExpression;
import org.casualintellect.casualIntellect.Not;
import org.casualintellect.casualIntellect.Or;
import org.casualintellect.casualIntellect.ProcessAfterState;
import org.casualintellect.casualIntellect.ProcessBeforeState;
import org.casualintellect.casualIntellect.ProcessInState;
import org.casualintellect.casualIntellect.State;
import org.casualintellect.casualIntellect.StringConstant;
import org.casualintellect.casualIntellect.Transition;
import org.casualintellect.casualIntellect.Transitions;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class CasualIntellectGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    String states = "";
    TreeIterator<EObject> _allContents = resource.getAllContents();
    Iterable<EObject> _iterable = IteratorExtensions.<EObject>toIterable(_allContents);
    Iterable<State> _filter = Iterables.<State>filter(_iterable, State.class);
    for (final State e : _filter) {
      {
        CharSequence _compile = this.compile(e);
        String _plus = (states + _compile);
        states = _plus;
        states = (states + "\n");
      }
    }
    fsa.generateFile(("states/states" + ".xml"), states);
  }
  
  public CharSequence compile(final State state) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<state name=\"");
    String _name = state.getName();
    _builder.append(_name, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<before methods=\"");
    String _xifexpression = null;
    ProcessBeforeState _before = state.getBefore();
    boolean _notEquals = (!Objects.equal(_before, null));
    if (_notEquals) {
      ProcessBeforeState _before_1 = state.getBefore();
      EList<String> _methods = _before_1.getMethods();
      _xifexpression = this.processMethodsList(_methods);
    }
    _builder.append(_xifexpression, "\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<after methods=\"");
    String _xifexpression_1 = null;
    ProcessAfterState _after = state.getAfter();
    boolean _notEquals_1 = (!Objects.equal(_after, null));
    if (_notEquals_1) {
      ProcessAfterState _after_1 = state.getAfter();
      EList<String> _methods_1 = _after_1.getMethods();
      _xifexpression_1 = this.processMethodsList(_methods_1);
    }
    _builder.append(_xifexpression_1, "\t");
    _builder.append("\"/>\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<in_process methods=\"");
    String _xifexpression_2 = null;
    ProcessInState _inProcess = state.getInProcess();
    boolean _notEquals_2 = (!Objects.equal(_inProcess, null));
    if (_notEquals_2) {
      ProcessInState _inProcess_1 = state.getInProcess();
      EList<String> _methods_2 = _inProcess_1.getMethods();
      _xifexpression_2 = this.processMethodsList(_methods_2);
    }
    _builder.append(_xifexpression_2, "\t");
    _builder.append("\"/>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("<transitions>");
    {
      Transitions _transitions = state.getTransitions();
      boolean _notEquals_3 = (!Objects.equal(_transitions, null));
      if (_notEquals_3) {
        _builder.newLineIfNotEmpty();
        {
          Transitions _transitions_1 = state.getTransitions();
          EList<Transition> _list = _transitions_1.getList();
          for(final Transition transition : _list) {
            _builder.append("\t");
            _builder.append("<transition name=\"");
            String _name_1 = transition.getName();
            _builder.append(_name_1, "\t");
            _builder.append("\" methods=\"");
            EList<String> _methods_3 = transition.getMethods();
            String _processMethodsList = this.processMethodsList(_methods_3);
            _builder.append(_processMethodsList, "\t");
            _builder.append("\">");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("<condition function=\"");
            Expression _condition = transition.getCondition();
            Object _compile = this.compile(_condition);
            _builder.append(_compile, "\t\t");
            _builder.append("\"/>");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("</transition>");
            _builder.newLine();
          }
        }
        _builder.append("\t");
      }
    }
    _builder.append("</transitions>");
    _builder.newLineIfNotEmpty();
    _builder.append("</state>");
    _builder.newLine();
    return _builder;
  }
  
  public Object compile(final Expression expression) {
    Object _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (expression instanceof Or) {
        _matched=true;
        Expression _left = ((Or)expression).getLeft();
        Object _compile = this.compile(_left);
        String _plus = (_compile + " || ");
        Expression _right = ((Or)expression).getRight();
        Object _compile_1 = this.compile(_right);
        _switchResult = (_plus + _compile_1);
      }
    }
    if (!_matched) {
      if (expression instanceof And) {
        _matched=true;
        Expression _left = ((And)expression).getLeft();
        Object _compile = this.compile(_left);
        String _plus = (_compile + " && ");
        Expression _right = ((And)expression).getRight();
        Object _compile_1 = this.compile(_right);
        _switchResult = (_plus + _compile_1);
      }
    }
    if (!_matched) {
      if (expression instanceof Not) {
        _matched=true;
        Expression _expression = ((Not)expression).getExpression();
        _switchResult = this.compile(_expression);
      }
    }
    if (!_matched) {
      if (expression instanceof NestedExpression) {
        _matched=true;
        Expression _child = ((NestedExpression)expression).getChild();
        Object _compile = this.compile(_child);
        String _plus = ("(" + _compile);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (expression instanceof BoolConstant) {
        _matched=true;
        String _value = ((BoolConstant)expression).getValue();
        _switchResult = Boolean.valueOf(Boolean.parseBoolean(_value));
      }
    }
    if (!_matched) {
      if (expression instanceof StringConstant) {
        _matched=true;
        _switchResult = ((StringConstant)expression).getValue();
      }
    }
    return _switchResult;
  }
  
  public String processMethodsList(final List<String> methods) {
    String _xblockexpression = null;
    {
      String methodsStr = "";
      for (int i = 0; (i < ((Object[])Conversions.unwrapArray(methods, Object.class)).length); i++) {
        {
          String _get = methods.get(i);
          String _plus = (methodsStr + _get);
          methodsStr = _plus;
          int _length = ((Object[])Conversions.unwrapArray(methods, Object.class)).length;
          int _minus = (_length - 1);
          boolean _lessThan = (i < _minus);
          if (_lessThan) {
            String _methodsStr = methodsStr;
            methodsStr = (_methodsStr + ",");
          }
        }
      }
      _xblockexpression = methodsStr;
    }
    return _xblockexpression;
  }
}
