package compilers.symbol_table;

import java.util.LinkedList;
import java.util.List;

/*
 * Class definition to create a symbol table.
 */
public class ClassSymbolTable {
	private List<AttributeSymbolTable> listAttr;
    private List<MethodSymbolTable> listMeth;
    private List<String> errorList;
   
    public ClassSymbolTable() {
    	this.errorList = new LinkedList<>();
        this.listAttr = new LinkedList<>();
        this.listMeth = new LinkedList<>();
    }
    
    public List<String> getErrorList(){
    	return this.errorList;
    }
    
    
    public ClassSymbolTable(List<AttributeSymbolTable> attrs, List<MethodSymbolTable> meths) {
        this.listAttr = attrs;
        this.listMeth = meths;
    }

    public List<AttributeSymbolTable> getAttrList() {
        return this.listAttr;
    }

    public void setAttrList(List<AttributeSymbolTable> listAttr) {
        this.listAttr = listAttr;
    }

    public List<MethodSymbolTable> getMethList() {
        return this.listMeth;
    }

    public void setMethList(List<MethodSymbolTable> listMeth) {
        this.listMeth = listMeth;
    }

    public void setAttributeSymbolTable(AttributeSymbolTable attr) {
        if (existAttributeSymbolTable(attr)) {
             errorList.add("error, ya existe el AttributeSymbolTable '" + attr.getName() + "'");
             
        }
        this.listAttr.add(attr);
    }

    public boolean existAttributeSymbolTable(AttributeSymbolTable attr) {
        boolean exist = false;
        int i = 0;
        while (!exist && i < listAttr.size()) {
            if (listAttr.get(i).getName() == attr.getName()) {
                exist = true;
            }
            i++;
        }
        return exist;
    }

    public boolean existMethodSymbolTable(MethodSymbolTable meth) {
        boolean exist = false;
        int i = 0;
        while (!exist && i < listMeth.size()) {
            if (listMeth.get(i).getName() == meth.getName()) {
                exist = true;
            }
            i++;
        }
        return exist;
    }
    
        public MethodSymbolTable getMethodSymbolTable(String name) {
        int i = 0;
        while (i < listMeth.size()) {
            if (listMeth.get(i).getName().equals(name)) {
                return listMeth.get(i);
            }
            i++;
        }
        return null;
    }
    

    public void setMethodSymbolTable(MethodSymbolTable meth) {
        if (existMethodSymbolTable(meth)) {
             errorList.add("error, ya existe el MethodSymbolTable '" + meth.getName() + "'");
             
        }
        this.listMeth.add(meth);
    }
}
