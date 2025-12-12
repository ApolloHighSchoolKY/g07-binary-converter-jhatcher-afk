public class BinaryConverter
{
	//Instance Variables
	private int value;
	private String binaryValue;
    private String decimalValue;
	//Default Constructor
    public BinaryConverter()
    {
    	value=0;
    	binaryValue="0";
    }

    //Modified  Constructor(s)
    public BinaryConverter(int newValue)
    {
    	value=newValue;
    	binaryValue="0";
    }

    public BinaryConverter(String newBinary)
    {
    	value=0;
    	binaryValue=newBinary;
    }

    //Methods
    public int getValue()
    {
    	return value;
    }

    public void setValue(int newValue)
    {
    	value=newValue;
    }

    public void setBinary(int newBinary)
    {
    	value=newBinary;
    }

    public String getBinary()
    {
    	return binaryValue;
    }
    
    public void setDecimal(int newDecimal)
    {
    	value=newDecimal;
    }
    public String getDecimal()
    {
    	return decimalValue;
    }
    public String toBinary()
    { 
    	//Convert the integer value to binary
        int temp = value;
        String binaryOut = "";

        for (int i= 7;i>=0;i--)
        {
            if(temp >= Math.pow(2,i))
            {
                temp -= Math.pow(2,i);
                binaryOut += "1";
            }
            else
                binaryOut += "0";
        }
            

    	return "" + binaryOut;
    }

    public int toDecimal()
    {
    	//Convert the binary value to decimal
        int decOut = 0;
        String tempDec = binaryValue;

        for(int i = 0; i < tempDec.length(); i++)
            if(tempDec.charAt(i)=='1')
            {
                decOut += Math.pow(2, tempDec.length()- 1 - i);
            }

    	return decOut;
    }

    public String toString()
	{
		return "" + "the binary value of " + value + " is " + toBinary() + "\n"
                  + "the decimal value of " + binaryValue + " is " + toDecimal();	

	}
}