/* Generated By:JJTree: Do not edit this line. ASTNot_op.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTNot_op extends SimpleNode {
  public ASTNot_op(int id) {
    super(id);
  }

  public ASTNot_op(ExprLang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExprLangVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=9d9fc15a5b9f4199d11d25841eec1757 (do not edit this line) */