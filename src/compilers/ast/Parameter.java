package compilers.ast;

import compilers.ASTVisitor;

public class Parameter extends AST {
    private GenericType type;
    private IdName id;

    public Parameter(GenericType type, IdName id) {
        this.type = type;
        this.id = id;
    }

    public GenericType getType() {
        return type;
    }

    public IdName getId() {
        return id;
    }
    
	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}


}
