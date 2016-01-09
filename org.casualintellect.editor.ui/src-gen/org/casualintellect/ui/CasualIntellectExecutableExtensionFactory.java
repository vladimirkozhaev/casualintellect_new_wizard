/*
 * generated by Xtext 2.9.1
 */
package org.casualintellect.ui;

import com.google.inject.Injector;
import org.casualintellect.editor.ui.internal.EditorActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class CasualIntellectExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EditorActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EditorActivator.getInstance().getInjector(EditorActivator.ORG_CASUALINTELLECT_CASUALINTELLECT);
	}
	
}