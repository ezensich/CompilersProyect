package ast;


import java.util.LinkedList;
import java.util.List;

import data_structures.Pair;


public abstract class FieldDeclaration extends DeclarationClass {

	
	private Pair<Type, Identifier> pairTypeAndId;
	
	public FieldDeclaration(){
		
	}
}
