/* Generated By:JJTree: Do not edit this line. ASTnumber.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
public
class ASTnumber extends SimpleNode {
  public ASTnumber(int id) {
    super(id);
  }

  public ASTnumber(MyJJ p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(MyJJVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=e7bafb31ed3ab95fbf61e72d4f548de0 (do not edit this line) */