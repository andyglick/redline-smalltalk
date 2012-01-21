/* Redline Smalltalk, Copyright (c) James C. Ladd. All rights reserved. See LICENSE in the root of this distribution */
package st.redline.compiler;

interface NodeVisitor {
	void visitBegin(Program program);
	void visitEnd(Program program);
	void visitBegin(Temporaries temporaries);
	void visitEnd(Temporaries temporaries);
	void visitBegin(Statements statements);
	void visitEnd(Statements statements);
	void visit(Temporary temporary, String value, int line);
	void visitBegin(SimpleExpression simpleExpression);
	void visitEnd(SimpleExpression simpleExpression);
	void visitBegin(Cascade cascade);
	void visitEnd(Cascade cascade);
	void visit(Identifier identifier, String value, int line);
	void visit(Self self, int line);
	void visit(Super aSuper, int line);
	void visit(True aTrue, int line);
	void visit(False aFalse, int line);
	void visit(Nil nil, int line);
	void visit(JVM jvm, int line);
}
