/**
 * generated by Xtext 2.9.1
 */
package org.casualintellect.validation;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import org.casualintellect.casualIntellect.CasualIntellectPackage;
import org.casualintellect.casualIntellect.Model;
import org.casualintellect.casualIntellect.Transition;
import org.casualintellect.casualIntellect.Transitions;
import org.casualintellect.validation.AbstractCasualIntellectValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class CasualIntellectValidator extends AbstractCasualIntellectValidator {
  @Check
  public void checkTransitions(final Model model) {
    EList<org.casualintellect.casualIntellect.State> states = model.getList_of_states();
    final LinkedList<String> listOfStateNames = new LinkedList<String>();
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(states, Object.class)).length); i++) {
      {
        org.casualintellect.casualIntellect.State state = states.get(i);
        String _name = state.getName();
        listOfStateNames.add(_name);
      }
    }
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(states, Object.class)).length); i++) {
      {
        final org.casualintellect.casualIntellect.State state = states.get(i);
        final String name = state.getName();
        final Function1<String, Boolean> _function = (String it) -> {
          return Boolean.valueOf(it.equals(name));
        };
        Iterable<String> list = IterableExtensions.<String>filter(listOfStateNames, _function);
        int _size = IterableExtensions.size(list);
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          EAttribute _state_Name = CasualIntellectPackage.eINSTANCE.getState_Name();
          this.error(("There are several states with the same name:" + name), CasualIntellectPackage.Literals.STATE, _state_Name);
        }
      }
    }
    for (int i = 0; (i < ((Object[])Conversions.unwrapArray(states, Object.class)).length); i++) {
      {
        final org.casualintellect.casualIntellect.State state = states.get(i);
        Transitions _transitions = state.getTransitions();
        final EList<Transition> transitionsList = _transitions.getList();
        final Consumer<Transition> _function = (Transition transition) -> {
          this.checkTransition(state, transition, listOfStateNames);
        };
        transitionsList.forEach(_function);
      }
    }
  }
  
  public void checkTransition(final EObject state, final Transition transition, final List<String> stateNamesList) {
    String _name = transition.getName();
    boolean _contains = stateNamesList.contains(_name);
    boolean _not = (!_contains);
    if (_not) {
      final int index = this.foundIndex(transition);
      String _name_1 = transition.getName();
      String _plus = ("No state for transition " + _name_1);
      EAttribute _state_Name = CasualIntellectPackage.eINSTANCE.getState_Name();
      this.error(_plus, state, _state_Name, index);
    }
  }
  
  public int foundIndex(final EObject object) {
    int _xblockexpression = (int) 0;
    {
      final EObject container = object.eContainer();
      EList<EObject> _eContents = container.eContents();
      int index = _eContents.indexOf(object);
      _xblockexpression = index;
    }
    return _xblockexpression;
  }
}
