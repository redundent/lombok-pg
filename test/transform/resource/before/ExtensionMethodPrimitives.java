import lombok.Extension;
import lombok.ExtensionMethod;

@ExtensionMethod(ExtensionMethodPrimitives.Primitives.class)
class ExtensionMethodPrimitives {

	private void test(final byte b) {
		int i = b.toInt();
	}

	static class Primitives {
		@Extension
		public static int toInt(final byte in) {
			return in & 0xff;
		}
	}
}