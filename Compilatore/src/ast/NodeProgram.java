package ast;

import java.util.ArrayList;

import exception.RegisterException;
import visitor.IVisitor;

public class NodeProgram extends NodeAST {
    private ArrayList<NodeDecSt> decSts;
    
	public  NodeProgram(ArrayList<NodeDecSt> NodeDecStmList){
        this.decSts = NodeDecStmList;
    }

    public ArrayList<NodeDecSt> getDecSts() {
		return decSts;
	}
	

	@Override
	public void accept(IVisitor visitor) throws RegisterException {
        visitor.visit(this);
	}
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("<NodeProgram, decSts: [");
		boolean isFirst = true;
		for (NodeDecSt node : decSts) {
			if (!isFirst) {
				sb.append(", ");
			}
			isFirst = false;
			sb.append(node.toString());
		}
		sb.append("]>");
		return sb.toString();
	}
}
