import java.io.*;

public class PrintVisitor implements JJTreeVisitor
{

	PrintWriter pw;

    public Object visit(SimpleNode node, Object data)
    {
	throw new RuntimeException("Visit SimpleNode");
    }

    public Object visit(ASTProgram node, Object data)
    {

    try{
   		pw = new PrintWriter("Visitor.txt");
    }

    catch(Exception e){
        e.printStackTrace();
    }

	node.childrenAccept(this, data);
	pw.close();
	return(data);
    }

    public Object visit(ASTVar_Decl node, Object data)
    {
   	System.out.println();
	System.out.print(node.value + " ");
	return node.childrenAccept(this,data);
    }

	public Object visit(ASTConst_Decl node, Object data)
    {
    System.out.println();
	System.out.print(node.value + " ");
	return node.childrenAccept(this,data);
    }

    public Object visit(ASTBin_op node, Object data)
    {
    System.out.println();
	System.out.println(node.value);
	return node.childrenAccept(this,data);
    }

    public Object visit(ASTBool node, Object data)
    {
	System.out.println(node.value + " ");
	return node.childrenAccept(this,data);
    }

    public Object visit(ASTID node, Object data)
    {
	System.out.print(node.value + " ");
	return node.childrenAccept(this,data);
    }

    public Object visit(ASTNum node, Object data)
    {
	System.out.println(" " + node.value);
	return node.childrenAccept(this,data);
    }
    
    public Object visit(ASTElse node, Object data)
    {
    System.out.println();
	System.out.println(node + " ");
	return node.childrenAccept(this,data);
    }

    public Object visit(ASTCondition_Statement node, Object data){
    	System.out.println(node.value);
    	return node.childrenAccept(this,data);
    }

    public Object visit(ASTArgs node, Object data){
    	System.out.print(node + " ");
    	return node.childrenAccept(this,data);
    }

    public Object visit(ASTComp_op node, Object data){
    	System.out.println(node.value);
    	return node.childrenAccept(this,data);
    }

    public Object visit(ASTAnd_Or node, Object data){
    	System.out.println(node.value);
    	return node.childrenAccept(this,data);
    }

    public Object visit(ASTNegative node, Object data){
    	System.out.print(node + " ");
    	return node.childrenAccept(this,data);
    }

    public Object visit(ASTFragment node, Object data){
    	return node.childrenAccept(this,data);
    }

    public Object visit(ASTMain node, Object data){
    	System.out.println();
    	System.out.print(node);
    	return node.childrenAccept(this,data);
    }

    public Object visit(ASTParams node, Object data){
    	System.out.print(node + " ");
    	return node.childrenAccept(this,data);
    } 

    public Object visit(ASTType node, Object data){
    	System.out.print(node.value + " ");
    	return node.childrenAccept(this,data);
    }

    public Object visit(ASTFunction_Return node, Object data){
    	System.out.println(node);
    	return node.childrenAccept(this,data);
    }

    public Object visit(ASTFunction node, Object data){
    	System.out.print(node + " ");
    	return node.childrenAccept(this,data);
    }

    public Object visit(ASTAssign node, Object data){
    	return node.childrenAccept(this,data);
    }
}