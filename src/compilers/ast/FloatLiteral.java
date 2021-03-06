package compilers.ast;

import compilers.ast.enumerated_types.Type;
import compilers.ASTVisitor;

public class FloatLiteral extends Literal {

	private String stringValue;
	private Float floatValue;
	private GenericType type = new GenericType(Type.FLOAT.toString());
	

	public FloatLiteral(Float val, int line, int col){
		this.setColumnNumber(col);
		this.setLineNumber(line);
		stringValue = val.toString(); 
		floatValue = val;
	}

	@Override
	public GenericType getType() {
		return this.type;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public Float getValue() {
		return floatValue;
	}

	public void setValue(Float value) {
		this.floatValue = value;
	}

	@Override
    public <T> T accept(ASTVisitor<T> v) {
        return v.visit(this);
    }

}
