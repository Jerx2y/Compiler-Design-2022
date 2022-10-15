package AST.Expr;

import AST.ASTVisitor;
import AST.Def.varDefNode;
import AST.Stmt.StmtNode;
import Util.position;

import java.util.ArrayList;

public class funcExprNode extends ExprNode {
    boolean haveAnd;
    varDefNode parameter;
    StmtNode stmts;
    ArrayList<ExprNode> exprs;

    public funcExprNode(boolean haveAnd, varDefNode paramter, StmtNode stmts, position pos) {
        super(pos);
        this.haveAnd = haveAnd;
        this.parameter = paramter;
        this.stmts = stmts;
        exprs = new ArrayList<>();
    }

    @Override
    public void accept(ASTVisitor visitor) {
        visitor.visit(this);
    }
}