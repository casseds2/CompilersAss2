/* Generated By:JJTree: Do not edit this line. ASTExp.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTExp extends SimpleNode {
  public ASTExp(int id) {
    super(id);
  }

  public ASTExp(ExprLang p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ExprLangVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=04e5c9fc32b5adfc937a415ea9e28dd3 (do not edit this line) */