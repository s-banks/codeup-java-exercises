package util;

public class InputTest {
	public static void main(String[] args) {
		Input in = new Input();
		System.out.println(in.getString());
		System.out.println(in.yesNo());
		System.out.println(in.getInt());
		System.out.println(in.getInt(2,8));
		System.out.println(in.getDouble());
		System.out.println(in.getDouble(2,8));
		System.out.println(in.getBinary());
		System.out.println(in.getHex());
	}
}
