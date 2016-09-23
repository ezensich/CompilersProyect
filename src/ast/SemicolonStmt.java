package ast;

import compilers.ASTVisitor;

public class SemicolonStmt extends Statement{

	public SemicolonStmt(){
		
	}
	
	@Override
    public String toString(){
    	return " ;";
    }
	
	@Override
    public <T> T accept(ASTVisitor<T> v) {
        return v.visit(this);
    }

	
	
}