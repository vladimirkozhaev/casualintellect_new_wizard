/*
 * generated by Xtext 2.9.1
 */
package org.casualintellect.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.casualintellect.casualIntellect.And;
import org.casualintellect.casualIntellect.BoolConstant;
import org.casualintellect.casualIntellect.CasualIntellectPackage;
import org.casualintellect.casualIntellect.Model;
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
import org.casualintellect.services.CasualIntellectGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class CasualIntellectSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private CasualIntellectGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == CasualIntellectPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case CasualIntellectPackage.AND:
				sequence_And(context, (And) semanticObject); 
				return; 
			case CasualIntellectPackage.BOOL_CONSTANT:
				sequence_Atomic(context, (BoolConstant) semanticObject); 
				return; 
			case CasualIntellectPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case CasualIntellectPackage.NESTED_EXPRESSION:
				sequence_Primary(context, (NestedExpression) semanticObject); 
				return; 
			case CasualIntellectPackage.NOT:
				sequence_Primary(context, (Not) semanticObject); 
				return; 
			case CasualIntellectPackage.OR:
				sequence_Or(context, (Or) semanticObject); 
				return; 
			case CasualIntellectPackage.PROCESS_AFTER_STATE:
				sequence_ProcessAfterState(context, (ProcessAfterState) semanticObject); 
				return; 
			case CasualIntellectPackage.PROCESS_BEFORE_STATE:
				sequence_ProcessBeforeState(context, (ProcessBeforeState) semanticObject); 
				return; 
			case CasualIntellectPackage.PROCESS_IN_STATE:
				sequence_ProcessInState(context, (ProcessInState) semanticObject); 
				return; 
			case CasualIntellectPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case CasualIntellectPackage.STRING_CONSTANT:
				sequence_Atomic(context, (StringConstant) semanticObject); 
				return; 
			case CasualIntellectPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			case CasualIntellectPackage.TRANSITIONS:
				sequence_Transitions(context, (Transitions) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Expression returns And
	 *     Or returns And
	 *     Or.Or_1_0 returns And
	 *     And returns And
	 *     And.And_1_0 returns And
	 *
	 * Constraint:
	 *     (left=And_And_1_0 right=Primary)
	 */
	protected void sequence_And(ISerializationContext context, And semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CasualIntellectPackage.Literals.AND__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CasualIntellectPackage.Literals.AND__LEFT));
			if (transientValues.isValueTransient(semanticObject, CasualIntellectPackage.Literals.AND__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CasualIntellectPackage.Literals.AND__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getRightPrimaryParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns BoolConstant
	 *     Or returns BoolConstant
	 *     Or.Or_1_0 returns BoolConstant
	 *     And returns BoolConstant
	 *     And.And_1_0 returns BoolConstant
	 *     Primary returns BoolConstant
	 *     Atomic returns BoolConstant
	 *
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_Atomic(ISerializationContext context, BoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns StringConstant
	 *     Or returns StringConstant
	 *     Or.Or_1_0 returns StringConstant
	 *     And returns StringConstant
	 *     And.And_1_0 returns StringConstant
	 *     Primary returns StringConstant
	 *     Atomic returns StringConstant
	 *
	 * Constraint:
	 *     value=ID
	 */
	protected void sequence_Atomic(ISerializationContext context, StringConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CasualIntellectPackage.Literals.STRING_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CasualIntellectPackage.Literals.STRING_CONSTANT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtomicAccess().getValueIDTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     list_of_states+=State+
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Or
	 *     Or returns Or
	 *     Or.Or_1_0 returns Or
	 *
	 * Constraint:
	 *     (left=Or_Or_1_0 right=And)
	 */
	protected void sequence_Or(ISerializationContext context, Or semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CasualIntellectPackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CasualIntellectPackage.Literals.OR__LEFT));
			if (transientValues.isValueTransient(semanticObject, CasualIntellectPackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CasualIntellectPackage.Literals.OR__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns NestedExpression
	 *     Or returns NestedExpression
	 *     Or.Or_1_0 returns NestedExpression
	 *     And returns NestedExpression
	 *     And.And_1_0 returns NestedExpression
	 *     Primary returns NestedExpression
	 *
	 * Constraint:
	 *     child=Expression
	 */
	protected void sequence_Primary(ISerializationContext context, NestedExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CasualIntellectPackage.Literals.NESTED_EXPRESSION__CHILD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CasualIntellectPackage.Literals.NESTED_EXPRESSION__CHILD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getChildExpressionParserRuleCall_0_2_0(), semanticObject.getChild());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns Not
	 *     Or returns Not
	 *     Or.Or_1_0 returns Not
	 *     And returns Not
	 *     And.And_1_0 returns Not
	 *     Primary returns Not
	 *
	 * Constraint:
	 *     expression=Primary
	 */
	protected void sequence_Primary(ISerializationContext context, Not semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, CasualIntellectPackage.Literals.NOT__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CasualIntellectPackage.Literals.NOT__EXPRESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ProcessAfterState returns ProcessAfterState
	 *
	 * Constraint:
	 *     ((methods+=ID methods+=ID+) | methods+=ID+)?
	 */
	protected void sequence_ProcessAfterState(ISerializationContext context, ProcessAfterState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProcessBeforeState returns ProcessBeforeState
	 *
	 * Constraint:
	 *     ((methods+=ID methods+=ID+) | methods+=ID+)?
	 */
	protected void sequence_ProcessBeforeState(ISerializationContext context, ProcessBeforeState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ProcessInState returns ProcessInState
	 *
	 * Constraint:
	 *     ((methods+=ID methods+=ID+) | methods+=ID+)?
	 */
	protected void sequence_ProcessInState(ISerializationContext context, ProcessInState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     State returns State
	 *
	 * Constraint:
	 *     (name=ID before=ProcessBeforeState after=ProcessAfterState? inProcess=ProcessInState transitions=Transitions?)
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (name=ID condition=Expression (methods+=ID methods+=ID*)?)
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Transitions returns Transitions
	 *
	 * Constraint:
	 *     ((list+=Transition list+=Transition+) | list+=Transition+)?
	 */
	protected void sequence_Transitions(ISerializationContext context, Transitions semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
