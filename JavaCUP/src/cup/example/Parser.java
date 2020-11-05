
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20141204 (SVN rev 60)
//----------------------------------------------------

package cup.example;

import java_cup.runtime.*;
import cup.example.Lexer;
import cup.tools.*;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20141204 (SVN rev 60) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\022\000\002\002\003\000\002\002\004\000\002\003" +
    "\004\000\002\003\004\000\002\003\002\000\002\005\005" +
    "\000\002\005\005\000\002\004\006\000\002\004\005\000" +
    "\002\006\005\000\002\006\003\000\002\010\003\000\002" +
    "\010\003\000\002\010\003\000\002\010\003\000\002\007" +
    "\003\000\002\007\003\000\002\007\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\037\000\014\002\ufffd\004\007\005\010\006\005\017" +
    "\004\001\002\000\004\007\025\001\002\000\004\017\023" +
    "\001\002\000\014\002\ufffd\004\007\005\010\006\005\017" +
    "\004\001\002\000\004\017\020\001\002\000\004\017\016" +
    "\001\002\000\004\002\015\001\002\000\004\002\001\001" +
    "\002\000\014\002\ufffd\004\007\005\010\006\005\017\004" +
    "\001\002\000\004\002\ufffe\001\002\000\004\002\000\001" +
    "\002\000\004\014\017\001\002\000\014\002\ufffb\004\ufffb" +
    "\005\ufffb\006\ufffb\017\ufffb\001\002\000\004\014\021\001" +
    "\002\000\014\002\ufffc\004\ufffc\005\ufffc\006\ufffc\017\ufffc" +
    "\001\002\000\004\002\uffff\001\002\000\004\014\024\001" +
    "\002\000\014\002\ufff9\004\ufff9\005\ufff9\006\ufff9\017\ufff9" +
    "\001\002\000\010\015\032\016\031\017\026\001\002\000" +
    "\014\010\ufff0\011\ufff0\012\ufff0\013\ufff0\014\ufff0\001\002" +
    "\000\014\010\ufff7\011\ufff7\012\ufff7\013\ufff7\014\ufff7\001" +
    "\002\000\014\010\034\011\035\012\040\013\037\014\036" +
    "\001\002\000\014\010\ufff1\011\ufff1\012\ufff1\013\ufff1\014" +
    "\ufff1\001\002\000\014\010\ufff2\011\ufff2\012\ufff2\013\ufff2" +
    "\014\ufff2\001\002\000\010\015\032\016\031\017\026\001" +
    "\002\000\010\015\ufff6\016\ufff6\017\ufff6\001\002\000\010" +
    "\015\ufff5\016\ufff5\017\ufff5\001\002\000\014\002\ufffa\004" +
    "\ufffa\005\ufffa\006\ufffa\017\ufffa\001\002\000\010\015\ufff3" +
    "\016\ufff3\017\ufff3\001\002\000\010\015\ufff4\016\ufff4\017" +
    "\ufff4\001\002\000\014\010\034\011\035\012\040\013\037" +
    "\014\ufff8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\037\000\012\002\010\003\011\004\012\005\005\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\003\021" +
    "\004\012\005\005\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\003\013" +
    "\004\012\005\005\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\006\027\007\026\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\010\032\001\001\000" +
    "\002\001\001\000\002\001\001\000\006\006\040\007\026" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\010\032" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  /** User initialization code. */
  public void user_init() throws java.lang.Exception
    {
//@@CUPDBG1

  ComplexSymbolFactory f = new ComplexSymbolFactory();
  symbolFactory = f;
  File file = new File("input.txt");
  FileInputStream fis = null;
  try {
    fis = new FileInputStream(file);
  } catch (IOException e) {
    e.printStackTrace();
  } 
  lexer = new Lexer(f,fis);

  st = new SymbolTable();
  st.init();

  isCorrect = true;
  codice = new StringBuffer();

    }

  /** Scan to get the next Symbol. */
  public java_cup.runtime.Symbol scan()
    throws java.lang.Exception
    {
//@@CUPDBG2
 return lexer.next_token(); 
    }

//@@CUPDBG0

  protected Lexer lexer;
  protected SymbolTable st;
  protected boolean isCorrect;
  protected StringBuffer codice;


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // Prog ::= DSs 
            {
              Object RESULT =null;
		//@@CUPDBG3

									if (isCorrect){
										System.out.println("Program: Correct");
										System.out.println(SymbolTable.toStr());
										System.out.println("------------------");
										System.out.println("CODE");
										System.out.println("------------------");
										System.out.println(codice);
									}else{
										System.out.println("Program: Not correct");
									}
								
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Prog",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= Prog EOF 
            {
              Object RESULT =null;
		Location start_valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location start_valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // DSs ::= Dcl DSs 
            {
              Object RESULT =null;
		//@@CUPDBG4
 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("DSs",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // DSs ::= Stm DSs 
            {
              Object RESULT =null;
		//@@CUPDBG5
 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("DSs",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // DSs ::= 
            {
              Object RESULT =null;
		//@@CUPDBG6
 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("DSs",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // Dcl ::= TYFLOAT ID SEMI 
            {
              TypeDescriptor RESULT =null;
		Location namexleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location namexright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		String name = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG7
 
									Attributes id =  new Attributes(TypeDescriptor.FLOAT);
									id.setReg();
									if (SymbolTable.enter(name, id) == false) {
										System.out.println("Var '" + name + "' already def");
										isCorrect = false;
										RESULT = TypeDescriptor.ERROR;
									}
								
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Dcl",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // Dcl ::= TYINT ID SEMI 
            {
              TypeDescriptor RESULT =null;
		Location namexleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location namexright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		String name = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG8

									Attributes id =  new Attributes(TypeDescriptor.INT);
									id.setReg();
									if (SymbolTable.enter(name, id) == false) {
										System.out.println("Var '" + name + "' already def");
										isCorrect = false;
										RESULT = TypeDescriptor.ERROR;
									}
								
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Dcl",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // Stm ::= ID ASSIGN Expr SEMI 
            {
              TypeDescriptor RESULT =null;
		Location idNamexleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).xleft;
		Location idNamexright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).xright;
		String idName = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		Location exprxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location exprxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		TypeDescriptor expr = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG9

												Attributes id = SymbolTable.lookup(idName);
												if (Lib.compatibleType(id.getType(), expr)) {
													RESULT = TypeDescriptor.VOID;
													codice.append("s").append(id.getReg()).append(" 0 k ");
												} else {
													System.out.println("ASSING not valid");
													isCorrect = false;
													RESULT = TypeDescriptor.ERROR;
												}											
											
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Stm",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // Stm ::= PRINT ID SEMI 
            {
              TypeDescriptor RESULT =null;
		Location idNamexleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location idNamexright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		String idName = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		//@@CUPDBG10
 
									Attributes id = SymbolTable.lookup(idName);			
        							codice.append("l")
  	  	      						.append(id.getReg()).append(" ")
  	  	      						.append("p ")	
  	  	      						.append("P ");
									RESULT = TypeDescriptor.VOID;									
								
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Stm",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // Expr ::= Expr Op Expr 
            {
              TypeDescriptor RESULT =null;
		Location explxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xleft;
		Location explxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).xright;
		TypeDescriptor expl = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		Location opxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xleft;
		Location opxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).xright;
		Character op = (Character)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		Location exprxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location exprxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		TypeDescriptor expr = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG11
 
										if (expl == TypeDescriptor.ERROR || expr == TypeDescriptor.ERROR) {
											RESULT = TypeDescriptor.ERROR;
										} else {
											if ( (expl == TypeDescriptor.INT && expr== TypeDescriptor.FLOAT) || expl == TypeDescriptor.FLOAT && expr == TypeDescriptor.INT){
												codice.append("5 k ")
													  .append(op + " ");
												RESULT = TypeDescriptor.FLOAT;
											}else if (expl == TypeDescriptor.FLOAT && expr == TypeDescriptor.FLOAT) {
												codice.append(op + " ");
												RESULT = TypeDescriptor.FLOAT;
											} else {
												codice.append(op + " ");
												RESULT = TypeDescriptor.INT;
											}
										}
										
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // Expr ::= Val 
            {
              TypeDescriptor RESULT =null;
		Location valxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location valxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		TypeDescriptor val = (TypeDescriptor)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG12

										RESULT = val;
									
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Expr",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // Op ::= PLUS 
            {
              Character RESULT =null;
		//@@CUPDBG13
 RESULT = '+'; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Op",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // Op ::= MINUS 
            {
              Character RESULT =null;
		//@@CUPDBG14
 RESULT = '-'; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Op",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // Op ::= TIMES 
            {
              Character RESULT =null;
		//@@CUPDBG15
 RESULT = '*'; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Op",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // Op ::= DIV 
            {
              Character RESULT =null;
		//@@CUPDBG16
 RESULT = '/'; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Op",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // Val ::= INT 
            {
              TypeDescriptor RESULT =null;
		Location numxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location numxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		String num = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG17
 
								   codice.append(num + " ");
								   RESULT = TypeDescriptor.INT; 
								
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Val",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // Val ::= FLOAT 
            {
              TypeDescriptor RESULT =null;
		Location numxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location numxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		String num = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG18
 
									codice.append(num + " ");
									RESULT = TypeDescriptor.FLOAT; 
								
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Val",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // Val ::= ID 
            {
              TypeDescriptor RESULT =null;
		Location nameVarxleft = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xleft;
		Location nameVarxright = ((java_cup.runtime.ComplexSymbolFactory.ComplexSymbol)CUP$Parser$stack.peek()).xright;
		String nameVar = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		//@@CUPDBG19
 
									Attributes id = SymbolTable.lookup(nameVar);
									if (id == null) {
										System.out.println("Var " + nameVar + " not defined");
										isCorrect = false;
										RESULT = TypeDescriptor.ERROR;
									} else {
										RESULT = TypeDescriptor.VOID; 
									}
								
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("Val",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
