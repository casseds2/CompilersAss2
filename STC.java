import java.util.*;

public class STC extends Object
{
    String type;
    String value;
    String qualifier;

    public STC(String itype, String ivalue)
    {
	type = itype;
	value = ivalue;
    }

    public STC(String itype, String ivalue, String iqualifier)
    {
	type = itype;
	value = ivalue;
	qualifier = iqualifier;
    }
}