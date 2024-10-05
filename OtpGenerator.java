class OtpGenerator
{
	public static void main(String[] args) 
	{
		String op = generateOTP1();
		System.out.println(op);

		int op1 = generateOTP2();
		System.out.println(op1);
	}

	public static String generateOTP1()
	{
		String otp = "";
		for(int i=1;i<=4;i++)
		{
			otp += ((int)(Math.random()*9));
		}
		return otp;
	}

	public static int generateOTP2()
	{
		return ((int)(Math.random()*9999));
	}
}