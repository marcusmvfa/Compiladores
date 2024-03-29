/* Generated By:JavaCC: Do not edit this line. SyntaxChecker.java */
package myNewPackage;

import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;

public class SyntaxChecker implements SyntaxCheckerConstants {

    public static void main(String[] args) {

                String content = null;
                try {
                                        content = new String(Files.readAllBytes(Paths.get("C:/Users/Marcus/Documents/Faculdade/Compiladores/TrabCompiladores/teste.txt")));
                                } catch (IOException e1) {
                                        // TODO Auto-generated catch block
                                        e1.printStackTrace();
                                }

        try {
            new SyntaxChecker(new java.io.StringReader(content)).programaPrincipal();
            System.out.println("Syntax is okay\u005cn");
                        System.out.println(content);

        } catch (Throwable e) {
            // Catching Throwable is ugly but JavaCC throws Error objects!
            System.out.println("Syntax check failed: " + e.getMessage());
        }

    }

  static final public void classe() throws ParseException {
    jj_consume_token(CLASS);
    jj_consume_token(LETRA);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUM:
      case LETRA:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LETRA:
        jj_consume_token(LETRA);
        break;
      case NUM:
        jj_consume_token(NUM);
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case HERDA:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_2;
      }
      jj_consume_token(HERDA);
      jj_consume_token(LETRA);
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NUM:
        case LETRA:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_3;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LETRA:
          jj_consume_token(LETRA);
          break;
        case NUM:
          jj_consume_token(NUM);
          break;
        default:
          jj_la1[4] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case 26:
          ;
          break;
        default:
          jj_la1[5] = jj_gen;
          break label_4;
        }
        jj_consume_token(26);
        jj_consume_token(LETRA);
        label_5:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case NUM:
          case LETRA:
            ;
            break;
          default:
            jj_la1[6] = jj_gen;
            break label_5;
          }
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case LETRA:
            jj_consume_token(LETRA);
            break;
          case NUM:
            jj_consume_token(NUM);
            break;
          default:
            jj_la1[7] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
        }
      }
    }
    jj_consume_token(BLOCO_INICIO);
    metodoo();
    comandos();
    jj_consume_token(BLOCO_FINAL);
  }

  static final public void parametros() throws ParseException {
    jj_consume_token(TIPO);
    jj_consume_token(LETRA);
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUM:
      case LETRA:
        ;
        break;
      default:
        jj_la1[8] = jj_gen;
        break label_6;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LETRA:
        jj_consume_token(LETRA);
        break;
      case NUM:
        jj_consume_token(NUM);
        break;
      default:
        jj_la1[9] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 27:
        ;
        break;
      default:
        jj_la1[10] = jj_gen;
        break label_7;
      }
      jj_consume_token(27);
      jj_consume_token(TIPO);
      jj_consume_token(LETRA);
      label_8:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NUM:
        case LETRA:
          ;
          break;
        default:
          jj_la1[11] = jj_gen;
          break label_8;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LETRA:
          jj_consume_token(LETRA);
          break;
        case NUM:
          jj_consume_token(NUM);
          break;
        default:
          jj_la1[12] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
  }

  static final public void metodoo() throws ParseException {
    jj_consume_token(TIPO);
    jj_consume_token(LETRA);
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUM:
      case LETRA:
        ;
        break;
      default:
        jj_la1[13] = jj_gen;
        break label_9;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LETRA:
        jj_consume_token(LETRA);
        break;
      case NUM:
        jj_consume_token(NUM);
        break;
      default:
        jj_la1[14] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(7);
    parametros();
    jj_consume_token(8);
    jj_consume_token(BLOCO_INICIO);
    comandos();
    jj_consume_token(RETURN);
    jj_consume_token(LETRA);
    label_10:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUM:
      case LETRA:
        ;
        break;
      default:
        jj_la1[15] = jj_gen;
        break label_10;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LETRA:
        jj_consume_token(LETRA);
        break;
      case NUM:
        jj_consume_token(NUM);
        break;
      default:
        jj_la1[16] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(6);
    jj_consume_token(BLOCO_FINAL);
  }

  static final public void declaracao() throws ParseException {
    jj_consume_token(TIPO);
    jj_consume_token(LETRA);
    label_11:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUM:
      case LETRA:
        ;
        break;
      default:
        jj_la1[17] = jj_gen;
        break label_11;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LETRA:
        jj_consume_token(LETRA);
        break;
      case NUM:
        jj_consume_token(NUM);
        break;
      default:
        jj_la1[18] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    label_12:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPERADOR_MATEMATICO:
      case OPERADOR_LOGICO:
        ;
        break;
      default:
        jj_la1[19] = jj_gen;
        break label_12;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPERADOR_LOGICO:
        jj_consume_token(OPERADOR_LOGICO);
        break;
      case OPERADOR_MATEMATICO:
        jj_consume_token(OPERADOR_MATEMATICO);
        break;
      default:
        jj_la1[20] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      label_13:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NUM:
        case FLOAT_NUM:
        case LETRA:
          ;
          break;
        default:
          jj_la1[21] = jj_gen;
          break label_13;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LETRA:
          jj_consume_token(LETRA);
          break;
        case NUM:
          jj_consume_token(NUM);
          break;
        case FLOAT_NUM:
          jj_consume_token(FLOAT_NUM);
          break;
        default:
          jj_la1[22] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
    jj_consume_token(6);
  }

  static final public void operacoesMatematicas() throws ParseException {
    label_14:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUM:
      case FLOAT_NUM:
      case LETRA:
        ;
        break;
      default:
        jj_la1[23] = jj_gen;
        break label_14;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LETRA:
        jj_consume_token(LETRA);
        break;
      case NUM:
        jj_consume_token(NUM);
        break;
      case FLOAT_NUM:
        jj_consume_token(FLOAT_NUM);
        break;
      default:
        jj_la1[24] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    label_15:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPERADOR_MATEMATICO:
      case OPERADOR_LOGICO:
        ;
        break;
      default:
        jj_la1[25] = jj_gen;
        break label_15;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPERADOR_MATEMATICO:
        jj_consume_token(OPERADOR_MATEMATICO);
        break;
      case OPERADOR_LOGICO:
        jj_consume_token(OPERADOR_LOGICO);
        break;
      default:
        jj_la1[26] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      label_16:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NUM:
        case FLOAT_NUM:
        case LETRA:
          ;
          break;
        default:
          jj_la1[27] = jj_gen;
          break label_16;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LETRA:
          jj_consume_token(LETRA);
          break;
        case NUM:
          jj_consume_token(NUM);
          break;
        case FLOAT_NUM:
          jj_consume_token(FLOAT_NUM);
          break;
        default:
          jj_la1[28] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
    jj_consume_token(6);
  }

  static final public void condicao() throws ParseException {
    jj_consume_token(IF);
    label_17:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 7:
        ;
        break;
      default:
        jj_la1[29] = jj_gen;
        break label_17;
      }
      jj_consume_token(7);
    }
    label_18:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUM:
      case FLOAT_NUM:
      case LETRA:
        ;
        break;
      default:
        jj_la1[30] = jj_gen;
        break label_18;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LETRA:
        jj_consume_token(LETRA);
        break;
      case NUM:
        jj_consume_token(NUM);
        break;
      case FLOAT_NUM:
        jj_consume_token(FLOAT_NUM);
        break;
      default:
        jj_la1[31] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    label_19:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPERADOR_LOGICO:
        ;
        break;
      default:
        jj_la1[32] = jj_gen;
        break label_19;
      }
      jj_consume_token(OPERADOR_LOGICO);
      label_20:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NUM:
        case FLOAT_NUM:
        case LETRA:
          ;
          break;
        default:
          jj_la1[33] = jj_gen;
          break label_20;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LETRA:
          jj_consume_token(LETRA);
          break;
        case NUM:
          jj_consume_token(NUM);
          break;
        case FLOAT_NUM:
          jj_consume_token(FLOAT_NUM);
          break;
        default:
          jj_la1[34] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
    label_21:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 8:
        ;
        break;
      default:
        jj_la1[35] = jj_gen;
        break label_21;
      }
      jj_consume_token(8);
    }
    jj_consume_token(THEN);
    comandos();
    label_22:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ELSE:
        ;
        break;
      default:
        jj_la1[36] = jj_gen;
        break label_22;
      }
      jj_consume_token(ELSE);
      comandos();
    }
  }

  static final public void loop() throws ParseException {
    jj_consume_token(FOR);
    label_23:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 7:
        ;
        break;
      default:
        jj_la1[37] = jj_gen;
        break label_23;
      }
      jj_consume_token(7);
    }
    label_24:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUM:
      case LETRA:
        ;
        break;
      default:
        jj_la1[38] = jj_gen;
        break label_24;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LETRA:
        jj_consume_token(LETRA);
        break;
      case NUM:
        jj_consume_token(NUM);
        break;
      default:
        jj_la1[39] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    label_25:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPERADOR_MATEMATICO:
      case OPERADOR_LOGICO:
        ;
        break;
      default:
        jj_la1[40] = jj_gen;
        break label_25;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPERADOR_MATEMATICO:
        jj_consume_token(OPERADOR_MATEMATICO);
        break;
      case OPERADOR_LOGICO:
        jj_consume_token(OPERADOR_LOGICO);
        break;
      default:
        jj_la1[41] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      label_26:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NUM:
        case FLOAT_NUM:
        case LETRA:
          ;
          break;
        default:
          jj_la1[42] = jj_gen;
          break label_26;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LETRA:
          jj_consume_token(LETRA);
          break;
        case NUM:
          jj_consume_token(NUM);
          break;
        case FLOAT_NUM:
          jj_consume_token(FLOAT_NUM);
          break;
        default:
          jj_la1[43] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
    jj_consume_token(TO);
    label_27:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUM:
      case FLOAT_NUM:
      case LETRA:
        ;
        break;
      default:
        jj_la1[44] = jj_gen;
        break label_27;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LETRA:
        jj_consume_token(LETRA);
        break;
      case NUM:
        jj_consume_token(NUM);
        break;
      case FLOAT_NUM:
        jj_consume_token(FLOAT_NUM);
        break;
      default:
        jj_la1[45] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    label_28:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPERADOR_MATEMATICO:
      case OPERADOR_LOGICO:
        ;
        break;
      default:
        jj_la1[46] = jj_gen;
        break label_28;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPERADOR_MATEMATICO:
        jj_consume_token(OPERADOR_MATEMATICO);
        break;
      case OPERADOR_LOGICO:
        jj_consume_token(OPERADOR_LOGICO);
        break;
      default:
        jj_la1[47] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      label_29:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NUM:
        case FLOAT_NUM:
        case LETRA:
          ;
          break;
        default:
          jj_la1[48] = jj_gen;
          break label_29;
        }
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LETRA:
          jj_consume_token(LETRA);
          break;
        case NUM:
          jj_consume_token(NUM);
          break;
        case FLOAT_NUM:
          jj_consume_token(FLOAT_NUM);
          break;
        default:
          jj_la1[49] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    }
    label_30:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 8:
        ;
        break;
      default:
        jj_la1[50] = jj_gen;
        break label_30;
      }
      jj_consume_token(8);
    }
    jj_consume_token(DO);
    jj_consume_token(BLOCO_INICIO);
    comandos();
    jj_consume_token(BLOCO_FINAL);
  }

  static final public void comandos() throws ParseException {
    label_31:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 6:
      case NUM:
      case FLOAT_NUM:
      case LETRA:
      case TIPO:
      case OPERADOR_MATEMATICO:
      case OPERADOR_LOGICO:
      case IF:
      case FOR:
      case CLASS:
        ;
        break;
      default:
        jj_la1[51] = jj_gen;
        break label_31;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case TIPO:
        declaracao();
        break;
      case 6:
      case NUM:
      case FLOAT_NUM:
      case LETRA:
      case OPERADOR_MATEMATICO:
      case OPERADOR_LOGICO:
        operacoesMatematicas();
        break;
      case IF:
        condicao();
        break;
      case FOR:
        loop();
        break;
      case CLASS:
        classe();
        break;
      default:
        jj_la1[52] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void programaPrincipal() throws ParseException {
    jj_consume_token(START_PROGRAM);
    label_32:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case LETRA:
        jj_consume_token(LETRA);
        break;
      case NUM:
        jj_consume_token(NUM);
        break;
      default:
        jj_la1[53] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NUM:
      case LETRA:
        ;
        break;
      default:
        jj_la1[54] = jj_gen;
        break label_32;
      }
    }
    jj_consume_token(BLOCO_INICIO);
    comandos();
    jj_consume_token(BLOCO_FINAL);
    jj_consume_token(END_PROGRAM);
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public SyntaxCheckerTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[55];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0xa00,0xa00,0x800000,0xa00,0xa00,0x4000000,0xa00,0xa00,0xa00,0xa00,0x8000000,0xa00,0xa00,0xa00,0xa00,0xa00,0xa00,0xa00,0xa00,0x6000,0x6000,0xe00,0xe00,0xe00,0xe00,0x6000,0x6000,0xe00,0xe00,0x80,0xe00,0xe00,0x4000,0xe00,0xe00,0x100,0x80000,0x80,0xa00,0xa00,0x6000,0x6000,0xe00,0xe00,0xe00,0xe00,0x6000,0x6000,0xe00,0xe00,0x100,0x2127e40,0x2127e40,0xa00,0xa00,};
   }

  /** Constructor with InputStream. */
  public SyntaxChecker(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public SyntaxChecker(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new SyntaxCheckerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 55; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 55; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public SyntaxChecker(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new SyntaxCheckerTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 55; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 55; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public SyntaxChecker(SyntaxCheckerTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 55; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(SyntaxCheckerTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 55; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[28];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 55; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 28; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
