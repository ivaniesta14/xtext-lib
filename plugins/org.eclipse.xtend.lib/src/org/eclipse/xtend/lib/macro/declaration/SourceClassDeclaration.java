package org.eclipse.xtend.lib.macro.declaration;

import java.util.List;

public interface SourceClassDeclaration extends ClassDeclaration, SourceTypeDeclaration {
	public List<SourceTypeParameterDeclaration> getTypeParameters();
}
