/* Generated By:JavaCC: Do not edit this line. MyJJVisitor.java Version 5.0 */
public interface MyJJVisitor
{
  public Object visit(SimpleNode node, Object data);
  public Object visit(ASTPROGRAM node, Object data);
  public Object visit(ASTDecls node, Object data);
  public Object visit(ASTdecl node, Object data);
  public Object visit(ASTVAR node, Object data);
  public Object visit(ASTCONST node, Object data);
  public Object visit(ASTFUNCTION node, Object data);
  public Object visit(ASTTYPE node, Object data);
  public Object visit(ASTPARAMSLIST node, Object data);
  public Object visit(ASTMAIN node, Object data);
  public Object visit(ASTSTATE node, Object data);
  public Object visit(ASTOPENSTATEMENTBLOCK node, Object data);
  public Object visit(ASTCLOSESTATEMENTBLOCK node, Object data);
  public Object visit(ASTELSE node, Object data);
  public Object visit(ASTWHILE node, Object data);
  public Object visit(ASTBINOP node, Object data);
  public Object visit(ASTNUM node, Object data);
  public Object visit(ASTTRUE node, Object data);
  public Object visit(ASTFALSE node, Object data);
  public Object visit(ASTMINUS node, Object data);
  public Object visit(ASTANDOR node, Object data);
  public Object visit(ASTCOMPOP node, Object data);
  public Object visit(ASTARGUMENTSLIST node, Object data);
  public Object visit(ASTID node, Object data);
  public Object visit(ASTIF node, Object data);
  public Object visit(ASTnumber node, Object data);
}
/* JavaCC - OriginalChecksum=c6717ecde48aeae12906068e858bb2ab (do not edit this line) */
