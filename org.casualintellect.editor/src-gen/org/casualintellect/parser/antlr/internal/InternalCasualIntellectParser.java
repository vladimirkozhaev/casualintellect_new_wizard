package org.casualintellect.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.casualintellect.services.CasualIntellectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCasualIntellectParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'state'", "'{'", "'}'", "'transitions'", "':'", "','", "'transition'", "';'", "'condition'", "'methods'", "'in_process'", "'after'", "'before'", "'||'", "'&&'", "'('", "')'", "'!'", "'true'", "'false'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCasualIntellectParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCasualIntellectParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCasualIntellectParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCasualIntellect.g"; }



     	private CasualIntellectGrammarAccess grammarAccess;

        public InternalCasualIntellectParser(TokenStream input, CasualIntellectGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected CasualIntellectGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalCasualIntellect.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalCasualIntellect.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalCasualIntellect.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalCasualIntellect.g:71:1: ruleModel returns [EObject current=null] : ( (lv_list_of_states_0_0= ruleState ) )+ ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_list_of_states_0_0 = null;



        	enterRule();

        try {
            // InternalCasualIntellect.g:77:2: ( ( (lv_list_of_states_0_0= ruleState ) )+ )
            // InternalCasualIntellect.g:78:2: ( (lv_list_of_states_0_0= ruleState ) )+
            {
            // InternalCasualIntellect.g:78:2: ( (lv_list_of_states_0_0= ruleState ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCasualIntellect.g:79:3: (lv_list_of_states_0_0= ruleState )
            	    {
            	    // InternalCasualIntellect.g:79:3: (lv_list_of_states_0_0= ruleState )
            	    // InternalCasualIntellect.g:80:4: lv_list_of_states_0_0= ruleState
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getList_of_statesStateParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_list_of_states_0_0=ruleState();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"list_of_states",
            	    					lv_list_of_states_0_0,
            	    					"org.casualintellect.CasualIntellect.State");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleState"
    // InternalCasualIntellect.g:100:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalCasualIntellect.g:100:46: (iv_ruleState= ruleState EOF )
            // InternalCasualIntellect.g:101:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalCasualIntellect.g:107:1: ruleState returns [EObject current=null] : (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_before_3_0= ruleProcessBeforeState ) ) ( (lv_after_4_0= ruleProcessAfterState ) )? ( (lv_inProcess_5_0= ruleProcessInState ) ) ( (lv_transitions_6_0= ruleTransitions ) )? otherlv_7= '}' ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_before_3_0 = null;

        EObject lv_after_4_0 = null;

        EObject lv_inProcess_5_0 = null;

        EObject lv_transitions_6_0 = null;



        	enterRule();

        try {
            // InternalCasualIntellect.g:113:2: ( (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_before_3_0= ruleProcessBeforeState ) ) ( (lv_after_4_0= ruleProcessAfterState ) )? ( (lv_inProcess_5_0= ruleProcessInState ) ) ( (lv_transitions_6_0= ruleTransitions ) )? otherlv_7= '}' ) )
            // InternalCasualIntellect.g:114:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_before_3_0= ruleProcessBeforeState ) ) ( (lv_after_4_0= ruleProcessAfterState ) )? ( (lv_inProcess_5_0= ruleProcessInState ) ) ( (lv_transitions_6_0= ruleTransitions ) )? otherlv_7= '}' )
            {
            // InternalCasualIntellect.g:114:2: (otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_before_3_0= ruleProcessBeforeState ) ) ( (lv_after_4_0= ruleProcessAfterState ) )? ( (lv_inProcess_5_0= ruleProcessInState ) ) ( (lv_transitions_6_0= ruleTransitions ) )? otherlv_7= '}' )
            // InternalCasualIntellect.g:115:3: otherlv_0= 'state' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_before_3_0= ruleProcessBeforeState ) ) ( (lv_after_4_0= ruleProcessAfterState ) )? ( (lv_inProcess_5_0= ruleProcessInState ) ) ( (lv_transitions_6_0= ruleTransitions ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getStateAccess().getStateKeyword_0());
            		
            // InternalCasualIntellect.g:119:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalCasualIntellect.g:120:4: (lv_name_1_0= RULE_ID )
            {
            // InternalCasualIntellect.g:120:4: (lv_name_1_0= RULE_ID )
            // InternalCasualIntellect.g:121:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCasualIntellect.g:141:3: ( (lv_before_3_0= ruleProcessBeforeState ) )
            // InternalCasualIntellect.g:142:4: (lv_before_3_0= ruleProcessBeforeState )
            {
            // InternalCasualIntellect.g:142:4: (lv_before_3_0= ruleProcessBeforeState )
            // InternalCasualIntellect.g:143:5: lv_before_3_0= ruleProcessBeforeState
            {

            					newCompositeNode(grammarAccess.getStateAccess().getBeforeProcessBeforeStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_before_3_0=ruleProcessBeforeState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"before",
            						lv_before_3_0,
            						"org.casualintellect.CasualIntellect.ProcessBeforeState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCasualIntellect.g:160:3: ( (lv_after_4_0= ruleProcessAfterState ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==22) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalCasualIntellect.g:161:4: (lv_after_4_0= ruleProcessAfterState )
                    {
                    // InternalCasualIntellect.g:161:4: (lv_after_4_0= ruleProcessAfterState )
                    // InternalCasualIntellect.g:162:5: lv_after_4_0= ruleProcessAfterState
                    {

                    					newCompositeNode(grammarAccess.getStateAccess().getAfterProcessAfterStateParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_after_4_0=ruleProcessAfterState();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStateRule());
                    					}
                    					set(
                    						current,
                    						"after",
                    						lv_after_4_0,
                    						"org.casualintellect.CasualIntellect.ProcessAfterState");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCasualIntellect.g:179:3: ( (lv_inProcess_5_0= ruleProcessInState ) )
            // InternalCasualIntellect.g:180:4: (lv_inProcess_5_0= ruleProcessInState )
            {
            // InternalCasualIntellect.g:180:4: (lv_inProcess_5_0= ruleProcessInState )
            // InternalCasualIntellect.g:181:5: lv_inProcess_5_0= ruleProcessInState
            {

            					newCompositeNode(grammarAccess.getStateAccess().getInProcessProcessInStateParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_8);
            lv_inProcess_5_0=ruleProcessInState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"inProcess",
            						lv_inProcess_5_0,
            						"org.casualintellect.CasualIntellect.ProcessInState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCasualIntellect.g:198:3: ( (lv_transitions_6_0= ruleTransitions ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalCasualIntellect.g:199:4: (lv_transitions_6_0= ruleTransitions )
                    {
                    // InternalCasualIntellect.g:199:4: (lv_transitions_6_0= ruleTransitions )
                    // InternalCasualIntellect.g:200:5: lv_transitions_6_0= ruleTransitions
                    {

                    					newCompositeNode(grammarAccess.getStateAccess().getTransitionsTransitionsParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_transitions_6_0=ruleTransitions();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getStateRule());
                    					}
                    					set(
                    						current,
                    						"transitions",
                    						lv_transitions_6_0,
                    						"org.casualintellect.CasualIntellect.Transitions");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleTransitions"
    // InternalCasualIntellect.g:225:1: entryRuleTransitions returns [EObject current=null] : iv_ruleTransitions= ruleTransitions EOF ;
    public final EObject entryRuleTransitions() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransitions = null;


        try {
            // InternalCasualIntellect.g:225:52: (iv_ruleTransitions= ruleTransitions EOF )
            // InternalCasualIntellect.g:226:2: iv_ruleTransitions= ruleTransitions EOF
            {
             newCompositeNode(grammarAccess.getTransitionsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransitions=ruleTransitions();

            state._fsp--;

             current =iv_ruleTransitions; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransitions"


    // $ANTLR start "ruleTransitions"
    // InternalCasualIntellect.g:232:1: ruleTransitions returns [EObject current=null] : (otherlv_0= 'transitions' otherlv_1= ':' otherlv_2= '{' ( (lv_list_3_0= ruleTransition ) )? (otherlv_4= ',' ( (lv_list_5_0= ruleTransition ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleTransitions() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_list_3_0 = null;

        EObject lv_list_5_0 = null;



        	enterRule();

        try {
            // InternalCasualIntellect.g:238:2: ( (otherlv_0= 'transitions' otherlv_1= ':' otherlv_2= '{' ( (lv_list_3_0= ruleTransition ) )? (otherlv_4= ',' ( (lv_list_5_0= ruleTransition ) ) )* otherlv_6= '}' ) )
            // InternalCasualIntellect.g:239:2: (otherlv_0= 'transitions' otherlv_1= ':' otherlv_2= '{' ( (lv_list_3_0= ruleTransition ) )? (otherlv_4= ',' ( (lv_list_5_0= ruleTransition ) ) )* otherlv_6= '}' )
            {
            // InternalCasualIntellect.g:239:2: (otherlv_0= 'transitions' otherlv_1= ':' otherlv_2= '{' ( (lv_list_3_0= ruleTransition ) )? (otherlv_4= ',' ( (lv_list_5_0= ruleTransition ) ) )* otherlv_6= '}' )
            // InternalCasualIntellect.g:240:3: otherlv_0= 'transitions' otherlv_1= ':' otherlv_2= '{' ( (lv_list_3_0= ruleTransition ) )? (otherlv_4= ',' ( (lv_list_5_0= ruleTransition ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionsAccess().getTransitionsKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionsAccess().getColonKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getTransitionsAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalCasualIntellect.g:252:3: ( (lv_list_3_0= ruleTransition ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalCasualIntellect.g:253:4: (lv_list_3_0= ruleTransition )
                    {
                    // InternalCasualIntellect.g:253:4: (lv_list_3_0= ruleTransition )
                    // InternalCasualIntellect.g:254:5: lv_list_3_0= ruleTransition
                    {

                    					newCompositeNode(grammarAccess.getTransitionsAccess().getListTransitionParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_list_3_0=ruleTransition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTransitionsRule());
                    					}
                    					add(
                    						current,
                    						"list",
                    						lv_list_3_0,
                    						"org.casualintellect.CasualIntellect.Transition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalCasualIntellect.g:271:3: (otherlv_4= ',' ( (lv_list_5_0= ruleTransition ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==16) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCasualIntellect.g:272:4: otherlv_4= ',' ( (lv_list_5_0= ruleTransition ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_13); 

            	    				newLeafNode(otherlv_4, grammarAccess.getTransitionsAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalCasualIntellect.g:276:4: ( (lv_list_5_0= ruleTransition ) )
            	    // InternalCasualIntellect.g:277:5: (lv_list_5_0= ruleTransition )
            	    {
            	    // InternalCasualIntellect.g:277:5: (lv_list_5_0= ruleTransition )
            	    // InternalCasualIntellect.g:278:6: lv_list_5_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getTransitionsAccess().getListTransitionParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_list_5_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTransitionsRule());
            	    						}
            	    						add(
            	    							current,
            	    							"list",
            	    							lv_list_5_0,
            	    							"org.casualintellect.CasualIntellect.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getTransitionsAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransitions"


    // $ANTLR start "entryRuleTransition"
    // InternalCasualIntellect.g:304:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalCasualIntellect.g:304:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalCasualIntellect.g:305:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalCasualIntellect.g:311:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleExpression ) ) (otherlv_7= ';' otherlv_8= 'methods' otherlv_9= ':' ( (lv_methods_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_methods_12_0= RULE_ID ) ) )* )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_methods_10_0=null;
        Token otherlv_11=null;
        Token lv_methods_12_0=null;
        EObject lv_condition_6_0 = null;



        	enterRule();

        try {
            // InternalCasualIntellect.g:317:2: ( (otherlv_0= 'transition' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleExpression ) ) (otherlv_7= ';' otherlv_8= 'methods' otherlv_9= ':' ( (lv_methods_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_methods_12_0= RULE_ID ) ) )* )? ) )
            // InternalCasualIntellect.g:318:2: (otherlv_0= 'transition' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleExpression ) ) (otherlv_7= ';' otherlv_8= 'methods' otherlv_9= ':' ( (lv_methods_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_methods_12_0= RULE_ID ) ) )* )? )
            {
            // InternalCasualIntellect.g:318:2: (otherlv_0= 'transition' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleExpression ) ) (otherlv_7= ';' otherlv_8= 'methods' otherlv_9= ':' ( (lv_methods_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_methods_12_0= RULE_ID ) ) )* )? )
            // InternalCasualIntellect.g:319:3: otherlv_0= 'transition' otherlv_1= ':' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= ';' otherlv_4= 'condition' otherlv_5= ':' ( (lv_condition_6_0= ruleExpression ) ) (otherlv_7= ';' otherlv_8= 'methods' otherlv_9= ':' ( (lv_methods_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_methods_12_0= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getTransitionAccess().getColonKeyword_1());
            		
            // InternalCasualIntellect.g:327:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalCasualIntellect.g:328:4: (lv_name_2_0= RULE_ID )
            {
            // InternalCasualIntellect.g:328:4: (lv_name_2_0= RULE_ID )
            // InternalCasualIntellect.g:329:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_2_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_4, grammarAccess.getTransitionAccess().getConditionKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getColonKeyword_5());
            		
            // InternalCasualIntellect.g:357:3: ( (lv_condition_6_0= ruleExpression ) )
            // InternalCasualIntellect.g:358:4: (lv_condition_6_0= ruleExpression )
            {
            // InternalCasualIntellect.g:358:4: (lv_condition_6_0= ruleExpression )
            // InternalCasualIntellect.g:359:5: lv_condition_6_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getTransitionAccess().getConditionExpressionParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_condition_6_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransitionRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_6_0,
            						"org.casualintellect.CasualIntellect.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCasualIntellect.g:376:3: (otherlv_7= ';' otherlv_8= 'methods' otherlv_9= ':' ( (lv_methods_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_methods_12_0= RULE_ID ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCasualIntellect.g:377:4: otherlv_7= ';' otherlv_8= 'methods' otherlv_9= ':' ( (lv_methods_10_0= RULE_ID ) ) (otherlv_11= ',' ( (lv_methods_12_0= RULE_ID ) ) )*
                    {
                    otherlv_7=(Token)match(input,18,FOLLOW_18); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getSemicolonKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,20,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getTransitionAccess().getMethodsKeyword_7_1());
                    			
                    otherlv_9=(Token)match(input,15,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getColonKeyword_7_2());
                    			
                    // InternalCasualIntellect.g:389:4: ( (lv_methods_10_0= RULE_ID ) )
                    // InternalCasualIntellect.g:390:5: (lv_methods_10_0= RULE_ID )
                    {
                    // InternalCasualIntellect.g:390:5: (lv_methods_10_0= RULE_ID )
                    // InternalCasualIntellect.g:391:6: lv_methods_10_0= RULE_ID
                    {
                    lv_methods_10_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_methods_10_0, grammarAccess.getTransitionAccess().getMethodsIDTerminalRuleCall_7_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    						addWithLastConsumed(
                    							current,
                    							"methods",
                    							lv_methods_10_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalCasualIntellect.g:407:4: (otherlv_11= ',' ( (lv_methods_12_0= RULE_ID ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==16) ) {
                            int LA6_1 = input.LA(2);

                            if ( (LA6_1==RULE_ID) ) {
                                alt6=1;
                            }


                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalCasualIntellect.g:408:5: otherlv_11= ',' ( (lv_methods_12_0= RULE_ID ) )
                    	    {
                    	    otherlv_11=(Token)match(input,16,FOLLOW_4); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getTransitionAccess().getCommaKeyword_7_4_0());
                    	    				
                    	    // InternalCasualIntellect.g:412:5: ( (lv_methods_12_0= RULE_ID ) )
                    	    // InternalCasualIntellect.g:413:6: (lv_methods_12_0= RULE_ID )
                    	    {
                    	    // InternalCasualIntellect.g:413:6: (lv_methods_12_0= RULE_ID )
                    	    // InternalCasualIntellect.g:414:7: lv_methods_12_0= RULE_ID
                    	    {
                    	    lv_methods_12_0=(Token)match(input,RULE_ID,FOLLOW_19); 

                    	    							newLeafNode(lv_methods_12_0, grammarAccess.getTransitionAccess().getMethodsIDTerminalRuleCall_7_4_1_0());
                    	    						

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTransitionRule());
                    	    							}
                    	    							addWithLastConsumed(
                    	    								current,
                    	    								"methods",
                    	    								lv_methods_12_0,
                    	    								"org.eclipse.xtext.common.Terminals.ID");
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleProcessInState"
    // InternalCasualIntellect.g:436:1: entryRuleProcessInState returns [EObject current=null] : iv_ruleProcessInState= ruleProcessInState EOF ;
    public final EObject entryRuleProcessInState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessInState = null;


        try {
            // InternalCasualIntellect.g:436:55: (iv_ruleProcessInState= ruleProcessInState EOF )
            // InternalCasualIntellect.g:437:2: iv_ruleProcessInState= ruleProcessInState EOF
            {
             newCompositeNode(grammarAccess.getProcessInStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessInState=ruleProcessInState();

            state._fsp--;

             current =iv_ruleProcessInState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessInState"


    // $ANTLR start "ruleProcessInState"
    // InternalCasualIntellect.g:443:1: ruleProcessInState returns [EObject current=null] : (otherlv_0= 'in_process' otherlv_1= ':' ( (lv_methods_2_0= RULE_ID ) )? (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleProcessInState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_methods_2_0=null;
        Token otherlv_3=null;
        Token lv_methods_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCasualIntellect.g:449:2: ( (otherlv_0= 'in_process' otherlv_1= ':' ( (lv_methods_2_0= RULE_ID ) )? (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )* otherlv_5= ';' ) )
            // InternalCasualIntellect.g:450:2: (otherlv_0= 'in_process' otherlv_1= ':' ( (lv_methods_2_0= RULE_ID ) )? (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )* otherlv_5= ';' )
            {
            // InternalCasualIntellect.g:450:2: (otherlv_0= 'in_process' otherlv_1= ':' ( (lv_methods_2_0= RULE_ID ) )? (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )* otherlv_5= ';' )
            // InternalCasualIntellect.g:451:3: otherlv_0= 'in_process' otherlv_1= ':' ( (lv_methods_2_0= RULE_ID ) )? (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessInStateAccess().getIn_processKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessInStateAccess().getColonKeyword_1());
            		
            // InternalCasualIntellect.g:459:3: ( (lv_methods_2_0= RULE_ID ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCasualIntellect.g:460:4: (lv_methods_2_0= RULE_ID )
                    {
                    // InternalCasualIntellect.g:460:4: (lv_methods_2_0= RULE_ID )
                    // InternalCasualIntellect.g:461:5: lv_methods_2_0= RULE_ID
                    {
                    lv_methods_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    					newLeafNode(lv_methods_2_0, grammarAccess.getProcessInStateAccess().getMethodsIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getProcessInStateRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"methods",
                    						lv_methods_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalCasualIntellect.g:477:3: (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalCasualIntellect.g:478:4: otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getProcessInStateAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCasualIntellect.g:482:4: ( (lv_methods_4_0= RULE_ID ) )
            	    // InternalCasualIntellect.g:483:5: (lv_methods_4_0= RULE_ID )
            	    {
            	    // InternalCasualIntellect.g:483:5: (lv_methods_4_0= RULE_ID )
            	    // InternalCasualIntellect.g:484:6: lv_methods_4_0= RULE_ID
            	    {
            	    lv_methods_4_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    						newLeafNode(lv_methods_4_0, grammarAccess.getProcessInStateAccess().getMethodsIDTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getProcessInStateRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"methods",
            	    							lv_methods_4_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProcessInStateAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessInState"


    // $ANTLR start "entryRuleProcessAfterState"
    // InternalCasualIntellect.g:509:1: entryRuleProcessAfterState returns [EObject current=null] : iv_ruleProcessAfterState= ruleProcessAfterState EOF ;
    public final EObject entryRuleProcessAfterState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessAfterState = null;


        try {
            // InternalCasualIntellect.g:509:58: (iv_ruleProcessAfterState= ruleProcessAfterState EOF )
            // InternalCasualIntellect.g:510:2: iv_ruleProcessAfterState= ruleProcessAfterState EOF
            {
             newCompositeNode(grammarAccess.getProcessAfterStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessAfterState=ruleProcessAfterState();

            state._fsp--;

             current =iv_ruleProcessAfterState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessAfterState"


    // $ANTLR start "ruleProcessAfterState"
    // InternalCasualIntellect.g:516:1: ruleProcessAfterState returns [EObject current=null] : (otherlv_0= 'after' otherlv_1= ':' ( (lv_methods_2_0= RULE_ID ) )? (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleProcessAfterState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_methods_2_0=null;
        Token otherlv_3=null;
        Token lv_methods_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCasualIntellect.g:522:2: ( (otherlv_0= 'after' otherlv_1= ':' ( (lv_methods_2_0= RULE_ID ) )? (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )* otherlv_5= ';' ) )
            // InternalCasualIntellect.g:523:2: (otherlv_0= 'after' otherlv_1= ':' ( (lv_methods_2_0= RULE_ID ) )? (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )* otherlv_5= ';' )
            {
            // InternalCasualIntellect.g:523:2: (otherlv_0= 'after' otherlv_1= ':' ( (lv_methods_2_0= RULE_ID ) )? (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )* otherlv_5= ';' )
            // InternalCasualIntellect.g:524:3: otherlv_0= 'after' otherlv_1= ':' ( (lv_methods_2_0= RULE_ID ) )? (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessAfterStateAccess().getAfterKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessAfterStateAccess().getColonKeyword_1());
            		
            // InternalCasualIntellect.g:532:3: ( (lv_methods_2_0= RULE_ID ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCasualIntellect.g:533:4: (lv_methods_2_0= RULE_ID )
                    {
                    // InternalCasualIntellect.g:533:4: (lv_methods_2_0= RULE_ID )
                    // InternalCasualIntellect.g:534:5: lv_methods_2_0= RULE_ID
                    {
                    lv_methods_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    					newLeafNode(lv_methods_2_0, grammarAccess.getProcessAfterStateAccess().getMethodsIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getProcessAfterStateRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"methods",
                    						lv_methods_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalCasualIntellect.g:550:3: (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==16) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCasualIntellect.g:551:4: otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getProcessAfterStateAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCasualIntellect.g:555:4: ( (lv_methods_4_0= RULE_ID ) )
            	    // InternalCasualIntellect.g:556:5: (lv_methods_4_0= RULE_ID )
            	    {
            	    // InternalCasualIntellect.g:556:5: (lv_methods_4_0= RULE_ID )
            	    // InternalCasualIntellect.g:557:6: lv_methods_4_0= RULE_ID
            	    {
            	    lv_methods_4_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    						newLeafNode(lv_methods_4_0, grammarAccess.getProcessAfterStateAccess().getMethodsIDTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getProcessAfterStateRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"methods",
            	    							lv_methods_4_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProcessAfterStateAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessAfterState"


    // $ANTLR start "entryRuleProcessBeforeState"
    // InternalCasualIntellect.g:582:1: entryRuleProcessBeforeState returns [EObject current=null] : iv_ruleProcessBeforeState= ruleProcessBeforeState EOF ;
    public final EObject entryRuleProcessBeforeState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessBeforeState = null;


        try {
            // InternalCasualIntellect.g:582:59: (iv_ruleProcessBeforeState= ruleProcessBeforeState EOF )
            // InternalCasualIntellect.g:583:2: iv_ruleProcessBeforeState= ruleProcessBeforeState EOF
            {
             newCompositeNode(grammarAccess.getProcessBeforeStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProcessBeforeState=ruleProcessBeforeState();

            state._fsp--;

             current =iv_ruleProcessBeforeState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProcessBeforeState"


    // $ANTLR start "ruleProcessBeforeState"
    // InternalCasualIntellect.g:589:1: ruleProcessBeforeState returns [EObject current=null] : (otherlv_0= 'before' otherlv_1= ':' ( (lv_methods_2_0= RULE_ID ) )? (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )* otherlv_5= ';' ) ;
    public final EObject ruleProcessBeforeState() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_methods_2_0=null;
        Token otherlv_3=null;
        Token lv_methods_4_0=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalCasualIntellect.g:595:2: ( (otherlv_0= 'before' otherlv_1= ':' ( (lv_methods_2_0= RULE_ID ) )? (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )* otherlv_5= ';' ) )
            // InternalCasualIntellect.g:596:2: (otherlv_0= 'before' otherlv_1= ':' ( (lv_methods_2_0= RULE_ID ) )? (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )* otherlv_5= ';' )
            {
            // InternalCasualIntellect.g:596:2: (otherlv_0= 'before' otherlv_1= ':' ( (lv_methods_2_0= RULE_ID ) )? (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )* otherlv_5= ';' )
            // InternalCasualIntellect.g:597:3: otherlv_0= 'before' otherlv_1= ':' ( (lv_methods_2_0= RULE_ID ) )? (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getProcessBeforeStateAccess().getBeforeKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_20); 

            			newLeafNode(otherlv_1, grammarAccess.getProcessBeforeStateAccess().getColonKeyword_1());
            		
            // InternalCasualIntellect.g:605:3: ( (lv_methods_2_0= RULE_ID ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCasualIntellect.g:606:4: (lv_methods_2_0= RULE_ID )
                    {
                    // InternalCasualIntellect.g:606:4: (lv_methods_2_0= RULE_ID )
                    // InternalCasualIntellect.g:607:5: lv_methods_2_0= RULE_ID
                    {
                    lv_methods_2_0=(Token)match(input,RULE_ID,FOLLOW_21); 

                    					newLeafNode(lv_methods_2_0, grammarAccess.getProcessBeforeStateAccess().getMethodsIDTerminalRuleCall_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getProcessBeforeStateRule());
                    					}
                    					addWithLastConsumed(
                    						current,
                    						"methods",
                    						lv_methods_2_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }
                    break;

            }

            // InternalCasualIntellect.g:623:3: (otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCasualIntellect.g:624:4: otherlv_3= ',' ( (lv_methods_4_0= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,16,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getProcessBeforeStateAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCasualIntellect.g:628:4: ( (lv_methods_4_0= RULE_ID ) )
            	    // InternalCasualIntellect.g:629:5: (lv_methods_4_0= RULE_ID )
            	    {
            	    // InternalCasualIntellect.g:629:5: (lv_methods_4_0= RULE_ID )
            	    // InternalCasualIntellect.g:630:6: lv_methods_4_0= RULE_ID
            	    {
            	    lv_methods_4_0=(Token)match(input,RULE_ID,FOLLOW_21); 

            	    						newLeafNode(lv_methods_4_0, grammarAccess.getProcessBeforeStateAccess().getMethodsIDTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getProcessBeforeStateRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"methods",
            	    							lv_methods_4_0,
            	    							"org.eclipse.xtext.common.Terminals.ID");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getProcessBeforeStateAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProcessBeforeState"


    // $ANTLR start "entryRuleExpression"
    // InternalCasualIntellect.g:655:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalCasualIntellect.g:655:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalCasualIntellect.g:656:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalCasualIntellect.g:662:1: ruleExpression returns [EObject current=null] : this_Or_0= ruleOr ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Or_0 = null;



        	enterRule();

        try {
            // InternalCasualIntellect.g:668:2: (this_Or_0= ruleOr )
            // InternalCasualIntellect.g:669:2: this_Or_0= ruleOr
            {

            		newCompositeNode(grammarAccess.getExpressionAccess().getOrParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Or_0=ruleOr();

            state._fsp--;


            		current = this_Or_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleOr"
    // InternalCasualIntellect.g:680:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalCasualIntellect.g:680:43: (iv_ruleOr= ruleOr EOF )
            // InternalCasualIntellect.g:681:2: iv_ruleOr= ruleOr EOF
            {
             newCompositeNode(grammarAccess.getOrRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;

             current =iv_ruleOr; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalCasualIntellect.g:687:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCasualIntellect.g:693:2: ( (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalCasualIntellect.g:694:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalCasualIntellect.g:694:2: (this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalCasualIntellect.g:695:3: this_And_0= ruleAnd ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            {

            			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
            		
            pushFollow(FOLLOW_22);
            this_And_0=ruleAnd();

            state._fsp--;


            			current = this_And_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCasualIntellect.g:703:3: ( () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==24) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCasualIntellect.g:704:4: () otherlv_2= '||' ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalCasualIntellect.g:704:4: ()
            	    // InternalCasualIntellect.g:705:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,24,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getOrAccess().getVerticalLineVerticalLineKeyword_1_1());
            	    			
            	    // InternalCasualIntellect.g:715:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalCasualIntellect.g:716:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalCasualIntellect.g:716:5: (lv_right_3_0= ruleAnd )
            	    // InternalCasualIntellect.g:717:6: lv_right_3_0= ruleAnd
            	    {

            	    						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getOrRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.casualintellect.CasualIntellect.And");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalCasualIntellect.g:739:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalCasualIntellect.g:739:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalCasualIntellect.g:740:2: iv_ruleAnd= ruleAnd EOF
            {
             newCompositeNode(grammarAccess.getAndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;

             current =iv_ruleAnd; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalCasualIntellect.g:746:1: ruleAnd returns [EObject current=null] : (this_Primary_0= rulePrimary ( () otherlv_2= '&&' ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalCasualIntellect.g:752:2: ( (this_Primary_0= rulePrimary ( () otherlv_2= '&&' ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalCasualIntellect.g:753:2: (this_Primary_0= rulePrimary ( () otherlv_2= '&&' ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalCasualIntellect.g:753:2: (this_Primary_0= rulePrimary ( () otherlv_2= '&&' ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalCasualIntellect.g:754:3: this_Primary_0= rulePrimary ( () otherlv_2= '&&' ( (lv_right_3_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getAndAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_23);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalCasualIntellect.g:762:3: ( () otherlv_2= '&&' ( (lv_right_3_0= rulePrimary ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==25) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCasualIntellect.g:763:4: () otherlv_2= '&&' ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalCasualIntellect.g:763:4: ()
            	    // InternalCasualIntellect.g:764:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_16); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAndAccess().getAmpersandAmpersandKeyword_1_1());
            	    			
            	    // InternalCasualIntellect.g:774:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalCasualIntellect.g:775:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalCasualIntellect.g:775:5: (lv_right_3_0= rulePrimary )
            	    // InternalCasualIntellect.g:776:6: lv_right_3_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getAndAccess().getRightPrimaryParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAndRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"org.casualintellect.CasualIntellect.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRulePrimary"
    // InternalCasualIntellect.g:798:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalCasualIntellect.g:798:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalCasualIntellect.g:799:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalCasualIntellect.g:805:1: rulePrimary returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_child_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) ) | this_Atomic_7= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_child_2_0 = null;

        EObject lv_expression_6_0 = null;

        EObject this_Atomic_7 = null;



        	enterRule();

        try {
            // InternalCasualIntellect.g:811:2: ( ( ( () otherlv_1= '(' ( (lv_child_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) ) | this_Atomic_7= ruleAtomic ) )
            // InternalCasualIntellect.g:812:2: ( ( () otherlv_1= '(' ( (lv_child_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) ) | this_Atomic_7= ruleAtomic )
            {
            // InternalCasualIntellect.g:812:2: ( ( () otherlv_1= '(' ( (lv_child_2_0= ruleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) ) | this_Atomic_7= ruleAtomic )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt16=1;
                }
                break;
            case 28:
                {
                alt16=2;
                }
                break;
            case RULE_ID:
            case 29:
            case 30:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalCasualIntellect.g:813:3: ( () otherlv_1= '(' ( (lv_child_2_0= ruleExpression ) ) otherlv_3= ')' )
                    {
                    // InternalCasualIntellect.g:813:3: ( () otherlv_1= '(' ( (lv_child_2_0= ruleExpression ) ) otherlv_3= ')' )
                    // InternalCasualIntellect.g:814:4: () otherlv_1= '(' ( (lv_child_2_0= ruleExpression ) ) otherlv_3= ')'
                    {
                    // InternalCasualIntellect.g:814:4: ()
                    // InternalCasualIntellect.g:815:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNestedExpressionAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_16); 

                    				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalCasualIntellect.g:825:4: ( (lv_child_2_0= ruleExpression ) )
                    // InternalCasualIntellect.g:826:5: (lv_child_2_0= ruleExpression )
                    {
                    // InternalCasualIntellect.g:826:5: (lv_child_2_0= ruleExpression )
                    // InternalCasualIntellect.g:827:6: lv_child_2_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getChildExpressionParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_child_2_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"child",
                    							lv_child_2_0,
                    							"org.casualintellect.CasualIntellect.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,27,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalCasualIntellect.g:850:3: ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) )
                    {
                    // InternalCasualIntellect.g:850:3: ( () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) ) )
                    // InternalCasualIntellect.g:851:4: () otherlv_5= '!' ( (lv_expression_6_0= rulePrimary ) )
                    {
                    // InternalCasualIntellect.g:851:4: ()
                    // InternalCasualIntellect.g:852:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getNotAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,28,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_1_1());
                    			
                    // InternalCasualIntellect.g:862:4: ( (lv_expression_6_0= rulePrimary ) )
                    // InternalCasualIntellect.g:863:5: (lv_expression_6_0= rulePrimary )
                    {
                    // InternalCasualIntellect.g:863:5: (lv_expression_6_0= rulePrimary )
                    // InternalCasualIntellect.g:864:6: lv_expression_6_0= rulePrimary
                    {

                    						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_6_0=rulePrimary();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_6_0,
                    							"org.casualintellect.CasualIntellect.Primary");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalCasualIntellect.g:883:3: this_Atomic_7= ruleAtomic
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atomic_7=ruleAtomic();

                    state._fsp--;


                    			current = this_Atomic_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalCasualIntellect.g:895:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalCasualIntellect.g:895:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalCasualIntellect.g:896:2: iv_ruleAtomic= ruleAtomic EOF
            {
             newCompositeNode(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;

             current =iv_ruleAtomic; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalCasualIntellect.g:902:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_1=null;
        Token lv_value_3_2=null;


        	enterRule();

        try {
            // InternalCasualIntellect.g:908:2: ( ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) ) )
            // InternalCasualIntellect.g:909:2: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) )
            {
            // InternalCasualIntellect.g:909:2: ( ( () ( (lv_value_1_0= RULE_ID ) ) ) | ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=29 && LA18_0<=30)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalCasualIntellect.g:910:3: ( () ( (lv_value_1_0= RULE_ID ) ) )
                    {
                    // InternalCasualIntellect.g:910:3: ( () ( (lv_value_1_0= RULE_ID ) ) )
                    // InternalCasualIntellect.g:911:4: () ( (lv_value_1_0= RULE_ID ) )
                    {
                    // InternalCasualIntellect.g:911:4: ()
                    // InternalCasualIntellect.g:912:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getStringConstantAction_0_0(),
                    						current);
                    				

                    }

                    // InternalCasualIntellect.g:918:4: ( (lv_value_1_0= RULE_ID ) )
                    // InternalCasualIntellect.g:919:5: (lv_value_1_0= RULE_ID )
                    {
                    // InternalCasualIntellect.g:919:5: (lv_value_1_0= RULE_ID )
                    // InternalCasualIntellect.g:920:6: lv_value_1_0= RULE_ID
                    {
                    lv_value_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtomicRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalCasualIntellect.g:938:3: ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
                    {
                    // InternalCasualIntellect.g:938:3: ( () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) ) )
                    // InternalCasualIntellect.g:939:4: () ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
                    {
                    // InternalCasualIntellect.g:939:4: ()
                    // InternalCasualIntellect.g:940:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getAtomicAccess().getBoolConstantAction_1_0(),
                    						current);
                    				

                    }

                    // InternalCasualIntellect.g:946:4: ( ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) ) )
                    // InternalCasualIntellect.g:947:5: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
                    {
                    // InternalCasualIntellect.g:947:5: ( (lv_value_3_1= 'true' | lv_value_3_2= 'false' ) )
                    // InternalCasualIntellect.g:948:6: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
                    {
                    // InternalCasualIntellect.g:948:6: (lv_value_3_1= 'true' | lv_value_3_2= 'false' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==29) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==30) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalCasualIntellect.g:949:7: lv_value_3_1= 'true'
                            {
                            lv_value_3_1=(Token)match(input,29,FOLLOW_2); 

                            							newLeafNode(lv_value_3_1, grammarAccess.getAtomicAccess().getValueTrueKeyword_1_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_3_1, null);
                            						

                            }
                            break;
                        case 2 :
                            // InternalCasualIntellect.g:960:7: lv_value_3_2= 'false'
                            {
                            lv_value_3_2=(Token)match(input,30,FOLLOW_2); 

                            							newLeafNode(lv_value_3_2, grammarAccess.getAtomicAccess().getValueFalseKeyword_1_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getAtomicRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_3_2, null);
                            						

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtomic"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000074000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000050010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});

}