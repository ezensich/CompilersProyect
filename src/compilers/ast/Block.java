package compilers.ast;


import compilers.ASTVisitor;

public class Block extends Statement{
	
	private StatementList listStatement;
	private FieldDeclarationList listFieldDeclarations;
	
	
	public Block(StatementList stmtList,FieldDeclarationList fieldList){
		this.listStatement = stmtList;
		this.listFieldDeclarations = fieldList;
	}
	
	public FieldDeclarationList getFieldDecList(){
		return this.listFieldDeclarations;
	}
	
	public StatementList getStmtList(){
		return this.listStatement;
	}

	@Override
    public <T> T accept(ASTVisitor<T> v) {
        return v.visit(this);
    }
}
