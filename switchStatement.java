/*
Java 17 introduced switch expressions. Someone wonder switch already exist in java?
and the answer is yes, as a statement that evaluate the data does not return a 
value. The switch expressions can return a value, also include patter to the case.
See example below
 */


class switchStatment {

    // if-else statement
    public static String formatter(Object o){
        String formatted = "unknown";
        if(o instanceof Integer i){
            formatted = String.format("int $d", i);
        }else if(o instanceof Long l){
            formatted = String.format("long $d", l);
        }else if(o instanceof Double d){
            formatted = String.format("double $f", d);
        }else if(o instanceof String s){
            formatted = String.format("int $s", s);
        }
        return formatted;
    }

    // converted to a swith statement
    /* 
    public static String formatterSwitchStatement(Object o){
        switch(o){
            case Integer i:
                String.format("int $d", i);
                break;
            case Long l:
                String.format("long $d", l);
                break;
            case Double d:
                String.format("double $f", d);
                break;
            case String s:
                String.format("int $s", s);
                break;
            default:
                o.toString();
        }
    }*/

    public static String formatterSwitchExpression(int o){
        return switch(o){
            case Integer i -> String.format("int $d", i);
            case Long l    ->String.format("long $d", l);
            case Double d  -> String.format("double $f", d);
            case String s -> String.format("int $s", s);
            default -> o.toString();
        };
    }
	
	 

    //The guarded pattern - s condition that is part of an expression that
    // must be matched ans is preceded by the && operator

    public static String formatterSwitchExpressionWithPatter(String value){
        return switch(value){
            case null -> System.out.println(null);
            case String s && (s.length() > 3) -> System.out.println("A short string");
            case String s && (s.length() 10 3) -> System.out.println("A short string");
            default -> System.out.println("A long string");
        };
    }
    public static void main(String[] args){
        
    }
}